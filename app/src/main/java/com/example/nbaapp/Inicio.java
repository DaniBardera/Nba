package com.example.nbaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Inicio extends AppCompatActivity {

    ImageView playersIV;
    ImageView teamsIV;
    ImageView calendarIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        // Enlace a Players
        playersIV = (ImageView) findViewById(R.id.players);
        playersIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goPlayers = new Intent(Inicio.this, Players.class);
                startActivity(goPlayers);
            }
        });

        // Enlace a Teams
        teamsIV = (ImageView) findViewById(R.id.teams);
        teamsIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goTeams = new Intent(Inicio.this, Teams.class);
                startActivity(goTeams);
            }
        });

        // Enlace a Calendar
        calendarIV = (ImageView) findViewById(R.id.calendar);
        calendarIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goCalendar = new Intent(Inicio.this, Calendar.class);
                startActivity(goCalendar);
            }
        });
    }
}