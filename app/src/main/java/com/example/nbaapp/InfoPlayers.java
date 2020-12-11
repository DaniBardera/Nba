package com.example.nbaapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import retrofit2.Retrofit;

public class InfoPlayers extends AppCompatActivity {

    String nombrePlayerTV;
    String apellidoPlayerTV;
    String teamPlayerTV;

    private static final String TAG = "InfoPlayers";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_info_player);

        muestraDatos(nombrePlayerTV, apellidoPlayerTV, teamPlayerTV);
        }

        public void muestraDatos(String nombrePlayerTV, String apellidoPlayerTV, String teamPlayerTV){

            Bundle extras = getIntent().getExtras();
            nombrePlayerTV = extras.getString("nombrePlayerTV");
            apellidoPlayerTV = extras.getString("apellidoPlayerTV");
            teamPlayerTV = extras.getString("teamPlayerTV");

            TextView infoNamePlayerTV = (TextView) findViewById(R.id.infoNamePlayerTV);
            TextView infoLastNamePlayerTV = (TextView) findViewById(R.id.infoLastNamePlayerTV);
            TextView infoTeamPlayerTV = (TextView) findViewById(R.id.infoTeamPlayerTV);

            if(nombrePlayerTV.contains("Ike")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.ike_anigbogu);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.indiana_pacers);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("18");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("4");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("1");


                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

            }

            if(nombrePlayerTV.contains("Ron")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.ron_baker);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.new_york_knicks);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("14");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("2");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("3");
            }

            if(nombrePlayerTV.contains("Jabari")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.jabari_bird);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.boston_celtics);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("5");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("1");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("1");
            }

            if(nombrePlayerTV.contains("Marshon")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.marshon_brooks);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.memphis_grizzlies);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("22");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("5");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("4");
            }

            if(nombrePlayerTV.contains("Lorenzo")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.lorenzo_brown);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.toronto_raptors);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("15");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("1");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("4");
            }

            if(nombrePlayerTV.contains("Omri")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.omri_casspi);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.memphis_grizzlies);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("18");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("4");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("1");
            }

            if(nombrePlayerTV.contains("Alex")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.alex_abrines);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.oklahoma_city_thunder);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("20");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("0");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("5");
            }

            if(nombrePlayerTV.contains("Tyler")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.tyler_davis);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.oklahoma_city_thunder);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("10");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("5");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("1");
            }

            if(nombrePlayerTV.contains("Keenan")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.keenan_evans);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.detroit_pistons);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("8");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("2");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("3");
            }

            if(nombrePlayerTV.contains("Marcin")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.marcin_gortat);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.la_clippers);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("24");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("10");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("2");
            }

            if(nombrePlayerTV.contains("Andrew")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.andrew_bogut);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.golden_state_warriors);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("20");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("11");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("3");
            }

            if(nombrePlayerTV.contains("Johnson")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.amir_johnson);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.philadelphia_76ers);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("12");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("2");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("4");
            }

            if(nombrePlayerTV.contains("George")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.george_king);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.phoenix_suns);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("14");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("3");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("5");
            }

            if(nombrePlayerTV.contains("Zach")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.zach_lofton);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.detroit_pistons);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("30");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("12");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("4");
            }

            if(nombrePlayerTV.contains("Kosta")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.kosta_koufos);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.sacramento_kings);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("16");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("1");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("1");
            }

            if(nombrePlayerTV.contains("James")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.james_nunnally);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.minnesota_timberwolves);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("10");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("6");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("1");
            }

            if(nombrePlayerTV.contains("Billy")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.billy_preston);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.cleveland_cavaliers);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("14");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("4");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("2");
            }

            if(nombrePlayerTV.contains("Zhou")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.zhou_qi);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.houston_rockets);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("6");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("1");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("0");
            }

            if(nombrePlayerTV.contains("Zach")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.zach_randolph);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.sacramento_kings);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("35");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("12");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("6");
            }

            if(nombrePlayerTV.contains("Richardson")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.malachi_richardson);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.toronto_raptors);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("12");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("3");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("1");
            }

            if(nombrePlayerTV.contains("Stephens")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.dj_stephens);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.memphis_grizzlies);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("13");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("2");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("2");
            }

            if(nombrePlayerTV.contains("Milos")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.milos_teodosic);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.la_clippers);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("22");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("4");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("5");
            }

            if(nombrePlayerTV.contains("Gary")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.gary_trent_jr);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.portland_trail_brazers);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("12");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("3");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("1");
            }

            if(nombrePlayerTV.contains("Michael")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.mike_smith);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.boston_celtics);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("14");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("3");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("2");

            }

            if(nombrePlayerTV.contains("Morton")){
                ImageView jugador = (ImageView) findViewById(R.id.imagePlayer);
                jugador.setImageResource(R.drawable.john_morton);

                ImageView equipo = (ImageView) findViewById(R.id.teamImage);
                equipo.setImageResource(R.drawable.cleveland_cavaliers);

                infoNamePlayerTV.setText(nombrePlayerTV);
                infoLastNamePlayerTV.setText(apellidoPlayerTV);
                infoTeamPlayerTV.setText(teamPlayerTV);

                TextView puntos = (TextView) findViewById(R.id.infoPuntos);
                puntos.setText("15");

                TextView rebotes = (TextView) findViewById(R.id.infoRebotes);
                rebotes.setText("2");

                TextView robos = (TextView) findViewById(R.id.infoRobos);
                robos.setText("2");
            }

            else {
                Log.d("Fallo: ", "No tenemos datos de ese jugador");
            }
        }

}

