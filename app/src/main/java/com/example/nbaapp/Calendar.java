package com.example.nbaapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.nbaapp.adapters.ListaCalendarAdapter;
import com.example.nbaapp.calendarModel.CalendarData;
import com.example.nbaapp.calendarModel.CalendarResponse;
import com.example.nbaapp.nbaapi.NbaApiService;
import com.example.nbaapp.playerModel.PlayersData;
import com.example.nbaapp.playerModel.PlayersResponse;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Calendar extends AppCompatActivity {

    private Retrofit retrofit;
    private static final String TAG = "Calendar";

    private RecyclerView recyclerView;

    private ListaCalendarAdapter listaCalendarAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        recyclerView = (RecyclerView) findViewById(R.id.calendarRV);
        listaCalendarAdapter = new ListaCalendarAdapter();
        recyclerView.setAdapter(listaCalendarAdapter);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 1); // Muestra los datos en 1 columna
        recyclerView.setLayoutManager(layoutManager);

        obtenerCalendario();

        // Vuelta a Inicio
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void obtenerCalendario() {

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.balldontlie.io/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NbaApiService service = retrofit.create(NbaApiService.class);
        Call<CalendarResponse> calendarResponseCall = service.obtenerListaGames();
        calendarResponseCall.enqueue(new Callback<CalendarResponse>() {
            // Se ejecuta cuando llega la respuesta a la consulta que hicimos
            @Override
            public void onResponse(Call<CalendarResponse> call, Response<CalendarResponse> response) {
                if(response.isSuccessful()){
                    CalendarResponse calendarResponse = response.body();
                    ArrayList<CalendarData> listaHomeTeams = calendarResponse.getHomeData();
                    ArrayList<CalendarData> listaVisitorTeams = calendarResponse.getVisitorData();
                    ArrayList<CalendarData> listaHomeTeamImagenes = calendarResponse.getImagenes();
                    ArrayList<CalendarData> listaVisitorTeamImagenes = calendarResponse.getImagenes();

                    listaCalendarAdapter.adicionarListaHomeTeams(listaHomeTeams);
                    listaCalendarAdapter.adicionarListaVisitorTeams(listaVisitorTeams);
                    listaCalendarAdapter.adicionarListaHomeTeamImagenes(listaHomeTeamImagenes);
                    listaCalendarAdapter.adicionarListaVisitorTeamImagenes(listaVisitorTeamImagenes);


                }else{
                    Log.e(TAG, " onResponse: " + response.errorBody());
                }
            }
            // Este se ejecuta cuando hay algun fallo
            @Override
            public void onFailure(Call<CalendarResponse> call, Throwable t) {
                Log.e(TAG, " onFailure: " + t.getMessage());
            }
        });
    }
}