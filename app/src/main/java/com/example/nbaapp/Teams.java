package com.example.nbaapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.nbaapp.adapters.ListaPlayersAdapter;
import com.example.nbaapp.adapters.ListaTeamsAdapter;
import com.example.nbaapp.nbaapi.NbaApiService;
import com.example.nbaapp.playerModel.PlayersData;
import com.example.nbaapp.playerModel.PlayersResponse;
import com.example.nbaapp.teamModel.TeamsData;
import com.example.nbaapp.teamModel.TeamsResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Teams extends AppCompatActivity {

    private Retrofit retrofit;
    private static final String TAG = "Teams";

    private RecyclerView recyclerView;

    private ListaTeamsAdapter listaTeamsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);

        recyclerView = (RecyclerView) findViewById(R.id.teamRV);
        listaTeamsAdapter = new ListaTeamsAdapter();
        recyclerView.setAdapter(listaTeamsAdapter);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 1); // Muestra los datos en 1 columna
        recyclerView.setLayoutManager(layoutManager);

        obtenerDatosTeams();

        // Vuelta a Inicio
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void obtenerDatosTeams() {

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.balldontlie.io/api/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            NbaApiService service = retrofit.create(NbaApiService.class);
            Call<TeamsResponse> teamsResponseCall = service.obtenerListaTeams();

            teamsResponseCall.enqueue(new Callback<TeamsResponse>() {
                // Se ejecuta cuando llega la respuesta a la consulta que hicimos
                @Override
                public void onResponse(Call<TeamsResponse> call, Response<TeamsResponse> response) {
                    if(response.isSuccessful()){
                        TeamsResponse teamsResponse = response.body();
                        ArrayList<TeamsData> listaTeams = teamsResponse.getData();
                        ArrayList<TeamsData> listaImagenes = teamsResponse.getImagenes();

                        listaTeamsAdapter.adicionarListaTeams(listaTeams);
                        listaTeamsAdapter.adicionarListaImagenes(listaImagenes);


                    }else{
                        Log.e(TAG, " onResponse: " + response.errorBody());
                    }
                }
                // Este se ejecuta cuando hay algun fallo
                @Override
                public void onFailure(Call<TeamsResponse> call, Throwable t) {
                    Log.e(TAG, " onFailure: " + t.getMessage());
                }
            });
        }
}