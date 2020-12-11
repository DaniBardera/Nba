package com.example.nbaapp.nbaapi;

import com.example.nbaapp.calendarModel.CalendarResponse;
import com.example.nbaapp.playerModel.PlayersResponse;
import com.example.nbaapp.teamModel.TeamsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NbaApiService {

    @GET("players")
    Call<PlayersResponse> obtenerListaPlayers();

    @GET("teams")
    Call<TeamsResponse> obtenerListaTeams();

    @GET("games")
    Call<CalendarResponse> obtenerListaGames();


}
