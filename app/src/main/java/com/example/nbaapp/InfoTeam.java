package com.example.nbaapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoTeam extends AppCompatActivity {

    String nombreTeamTV;

    private static final String TAG = "InfoPlayers";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_team);

        muestraDatos(nombreTeamTV);
    }

    public void muestraDatos(String nombreTeamTV){

        Bundle extras = getIntent().getExtras();

        nombreTeamTV = extras.getString("nombreTeamTV");

        TextView infoTeamTV = (TextView) findViewById(R.id.infoTeamTV);

        if(nombreTeamTV.contains("Atlanta")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.atlanta_hawks);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Atlanta");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("State Farm Arena");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("4");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("1");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Boston Celtics")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.boston_celtics);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Boston");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("TD Garden");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("21");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("17");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Brooklyn Nets")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.brooklyn_nets);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("New York");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Barclays Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("2");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Charlotte Hornest")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.charlotte_hornets);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Charlotte");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Spectrum Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("0");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Chicago Bulls")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.chicago_bulls);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Chicago");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("United Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("6");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("6");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Cleveland Cavaliers")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.cleveland_cavaliers);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Cleveland");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Rocket Mortgage FieldHouse");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("5");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("1");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Dallas")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.dallas_maveriks);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Dallas");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("American Airlines Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("2");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("1");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Denver")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.denver_nuggets);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Denver");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Pepsi Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("0");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Detroit")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.detroit_pistons);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Detroit");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Little Caesars Arena");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("7");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("3");

            infoTeamTV.setText(nombreTeamTV);

        }

        if(nombreTeamTV.contains("Golden")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.golden_state_warriors);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("San Francisco");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Chase Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("11");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("6");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Houston")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.houston_rockets);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Houston");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Toyota Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("4");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("2");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Indiana")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.indiana_pacers);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Indianapolis");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Bankers Life Fieldhouse");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("1");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("1");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Clippers")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.la_clippers);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Los Angeles");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Staples Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("0");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Lakers")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.angeles_lakers);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Los Angeles");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Staples Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("32");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("17");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Memphis")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.memphis_grizzlies);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Memphis");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("FedExForum");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("0");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Miami")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.miami_heat);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Miami");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("American Airlines Arena");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("6");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("3");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Milwaukee")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.milwaukee_bucks);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Milwaukee");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Fiserv Forum");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("2");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("1");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Minnesota")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.minnesota_timberwolves);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Minnesota");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Target Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("0");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("New Orleans")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.new_orleans_pelicans);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("New Orleans");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Smoothie King Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("0");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Knicks")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.new_york_knicks);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("New York City");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Madison Square Garden");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("8");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("2");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Oklahoma")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.oklahoma_city_thunder);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Oklahoma City");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Chesapeake Energy Arena");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("4");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("1");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Orlando")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.orlando_magic);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Orlando");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Amway Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("2");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Philadelphia")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.philadelphia_76ers);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Philadelphia");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Wells Fargo Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("9");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("3");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Phoenix")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.phoenix_suns);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Phoenix");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Talking Stick Resort Arena");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("2");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Portland")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.portland_trail_brazers);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Portland");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Moda Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("3");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            cancha.setText("1");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Sacramento")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.sacramento_kings);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Sacramento");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Golden 1 Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("1");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            cancha.setText("1");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("San Antonio")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.san_antonio_spurs);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("San Antonio");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("AT&T Center");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("6");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("5");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Toronto")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.toronto_raptors);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Toronto");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Scotiabank Arena");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("1");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("1");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Utah Jazz")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.utah_jazz);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Oeste");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Salt Lake City");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Vivint Smart Home Arena");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("2");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("0");

            infoTeamTV.setText(nombreTeamTV);
        }

        if(nombreTeamTV.contains("Washington")){

            ImageView equipo = (ImageView) findViewById(R.id.infoTeamImage);
            equipo.setImageResource(R.drawable.washington_wizards);

            TextView conferencia = (TextView) findViewById(R.id.conferenciaData);
            conferencia.setText("Este");

            TextView ciudad = (TextView) findViewById(R.id.ciudadData);
            ciudad.setText("Washington");

            TextView cancha = (TextView) findViewById(R.id.canchaData);
            cancha.setText("Capital One Arena");

            TextView titulosConferencia = (TextView) findViewById(R.id.titulosConferenciaData);
            titulosConferencia.setText("4");

            TextView titulosNba = (TextView) findViewById(R.id.titulosNbaData);
            titulosNba.setText("1");

            infoTeamTV.setText(nombreTeamTV);
        }

        else {
            Log.d("Fallo: ", "No tenemos datos de ese jugador");
        }
    }
}
