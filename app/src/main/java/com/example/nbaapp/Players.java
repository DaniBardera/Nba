package com.example.nbaapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.nbaapp.adapters.ListaPlayersAdapter;
import com.example.nbaapp.playerModel.PlayersData;
import com.example.nbaapp.playerModel.PlayersResponse;
import com.example.nbaapp.nbaapi.NbaApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Players extends AppCompatActivity {

    private Retrofit retrofit;
    private static final String TAG = "Players";

    private RecyclerView recyclerView;

    private ListaPlayersAdapter listaPlayersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        listaPlayersAdapter = new ListaPlayersAdapter();
        recyclerView.setAdapter(listaPlayersAdapter);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 1); // Muestra los datos en 1 columna
        recyclerView.setLayoutManager(layoutManager);

        obtenerDatos();

        // Vuelta a Inicio
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void obtenerDatos(){

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.balldontlie.io/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NbaApiService service = retrofit.create(NbaApiService.class);
        Call<PlayersResponse> playersResponseCall = service.obtenerListaPlayers();

        playersResponseCall.enqueue(new Callback<PlayersResponse>() {
            // Se ejecuta cuando llega la respuesta a la consulta que hicimos
            @Override
            public void onResponse(Call<PlayersResponse> call, Response<PlayersResponse> response) {
                if(response.isSuccessful()){

                    PlayersResponse playersResponse = response.body();
                    ArrayList<PlayersData> listaPlayers = playersResponse.getData();
                    ArrayList<PlayersData> listaImagenes = playersResponse.getImagenes();

                   listaPlayersAdapter.adicionarListaPlayers(listaPlayers);
                   listaPlayersAdapter.adicionarListaImagenes(listaImagenes);


                }else{
                    Log.e(TAG, " onResponse: " + response.errorBody());
                }
            }
            // Este se ejecuta cuando hay algun fallo
            @Override
            public void onFailure(Call<PlayersResponse> call, Throwable t) {
                Log.e(TAG, " onFailure: " + t.getMessage());
            }
        });
    }
}
