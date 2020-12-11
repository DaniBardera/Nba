package com.example.nbaapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.nbaapp.InfoPlayers;
import com.example.nbaapp.InfoTeam;
import com.example.nbaapp.R;
import com.example.nbaapp.Teams;
import com.example.nbaapp.playerModel.PlayersData;
import com.example.nbaapp.teamModel.TeamsData;

import java.util.ArrayList;

public class ListaTeamsAdapter extends RecyclerView.Adapter<ListaTeamsAdapter.ViewHolder>{

    private ArrayList<TeamsData> dataset;
    private ArrayList<TeamsData> imagenes;

    public ListaTeamsAdapter(){
        dataset = new ArrayList<>();
        imagenes = new ArrayList<>();
    }

    public ListaTeamsAdapter(ArrayList<TeamsData> dataset, ArrayList<TeamsData> imagenes){
        this.dataset = dataset;
        this.imagenes = imagenes;
    }

    @Override
    public ListaTeamsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_teams, parent, false);
        return new ListaTeamsAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListaTeamsAdapter.ViewHolder holder, int position) {

        TeamsData teams = dataset.get(position);
        holder.nombreTeamTV.setText(teams.getFull_name());

        TeamsData imagen = imagenes.get(position);
        holder.imageTeamTV.setImageResource(imagen.getFoto());

        holder.setOnClickListeners();

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaTeams(ArrayList<TeamsData> listaTeams) {
        dataset.addAll(listaTeams);
        notifyDataSetChanged();
    }

    public void adicionarListaImagenes(ArrayList<TeamsData> listaLogos) {

        imagenes.add(new TeamsData(R.drawable.atlanta_hawks));
        imagenes.add(new TeamsData(R.drawable.boston_celtics));
        imagenes.add(new TeamsData(R.drawable.brooklyn_nets));
        imagenes.add(new TeamsData(R.drawable.charlotte_hornets));
        imagenes.add(new TeamsData(R.drawable.chicago_bulls));
        imagenes.add(new TeamsData(R.drawable.cleveland_cavaliers));
        imagenes.add(new TeamsData(R.drawable.dallas_maveriks));
        imagenes.add(new TeamsData(R.drawable.denver_nuggets));
        imagenes.add(new TeamsData(R.drawable.detroit_pistons));
        imagenes.add(new TeamsData(R.drawable.golden_state_warriors));
        imagenes.add(new TeamsData(R.drawable.houston_rockets));
        imagenes.add(new TeamsData(R.drawable.indiana_pacers));
        imagenes.add(new TeamsData(R.drawable.la_clippers));
        imagenes.add(new TeamsData(R.drawable.angeles_lakers));
        imagenes.add(new TeamsData(R.drawable.memphis_grizzlies));
        imagenes.add(new TeamsData(R.drawable.miami_heat));
        imagenes.add(new TeamsData(R.drawable.milwaukee_bucks));
        imagenes.add(new TeamsData(R.drawable.minnesota_timberwolves));
        imagenes.add(new TeamsData(R.drawable.new_orleans_pelicans));
        imagenes.add(new TeamsData(R.drawable.new_york_knicks));
        imagenes.add(new TeamsData(R.drawable.oklahoma_city_thunder));
        imagenes.add(new TeamsData(R.drawable.orlando_magic));
        imagenes.add(new TeamsData(R.drawable.philadelphia_76ers));
        imagenes.add(new TeamsData(R.drawable.phoenix_suns));
        imagenes.add(new TeamsData(R.drawable.portland_trail_brazers));
        imagenes.add(new TeamsData(R.drawable.sacramento_kings));
        imagenes.add(new TeamsData(R.drawable.san_antonio_spurs));
        imagenes.add(new TeamsData(R.drawable.toronto_raptors));
        imagenes.add(new TeamsData(R.drawable.utah_jazz));
        imagenes.add(new TeamsData(R.drawable.washington_wizards));

        imagenes.addAll(listaLogos);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView nombreTeamTV;
        private ImageView imageTeamTV;

        Context context;

        // Boton que da acceso a la pantalla de infoPlayer
        Button botonInfoTeam;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();

            nombreTeamTV = itemView.findViewById(R.id.nombreTeams);
            imageTeamTV = itemView.findViewById(R.id.escudoTeam);

            botonInfoTeam = (Button) itemView.findViewById(R.id.infoTeam);
        }
        public void setOnClickListeners(){
            botonInfoTeam.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){

                case R.id.infoTeam:

                    Intent infoTeam = new Intent(context, InfoTeam.class);

                    infoTeam.putExtra("nombreTeamTV", nombreTeamTV.getText());

                    context.startActivity(infoTeam);
                    break;
            }
        }
    }
}
