package com.example.nbaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Boton que da acceso a la pantalla de inicio
    Button botonInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Identificamos el boton
        botonInicio = (Button) findViewById(R.id.buttonInicio);

        // Le indicamos cuando ese boton es llamado
        botonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pasamos de la portada a inicio
                Intent goInicio = new Intent(MainActivity.this, Inicio.class);
                startActivity(goInicio);
            }
        });
    }
}