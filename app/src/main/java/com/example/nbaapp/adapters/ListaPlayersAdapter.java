package com.example.nbaapp.adapters;

import android.annotation.SuppressLint;
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
import com.example.nbaapp.R;
import com.example.nbaapp.playerModel.PlayersData;


import java.util.ArrayList;

public class ListaPlayersAdapter extends RecyclerView.Adapter<ListaPlayersAdapter.ViewHolder>{

    private ArrayList<PlayersData> dataset;
    private ArrayList<PlayersData> imagenes;

    public ListaPlayersAdapter(){
        dataset = new ArrayList<>();
        imagenes = new ArrayList<>();
    }

    public ListaPlayersAdapter(ArrayList<PlayersData> dataset, ArrayList<PlayersData> imagenes){
        this.dataset = dataset;
        this.imagenes = imagenes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_players, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PlayersData players = dataset.get(position);
        holder.nombrePlayerTV.setText(players.getFirst_name());
        holder.apellidoPlayerTV.setText(players.getLast_name());
        holder.teamPlayerTV.setText(players.getTeam().getFull_name());

        PlayersData imagen = imagenes.get(position);
        holder.imageTV.setImageResource(imagen.getFoto());

        holder.setOnClickListeners();
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public void adicionarListaPlayers(ArrayList<PlayersData> listaPlayers) {
        dataset.addAll(listaPlayers);
        notifyDataSetChanged();
    }

    public void adicionarListaImagenes(ArrayList<PlayersData> listaImagenes) {
        imagenes.add(new PlayersData(R.drawable.ike_anigbogu));
        imagenes.add(new PlayersData(R.drawable.ron_baker));
        imagenes.add(new PlayersData(R.drawable.jabari_bird));
        imagenes.add(new PlayersData(R.drawable.marshon_brooks));
        imagenes.add(new PlayersData(R.drawable.lorenzo_brown));
        imagenes.add(new PlayersData(R.drawable.omri_casspi));
        imagenes.add(new PlayersData(R.drawable.alex_abrines));
        imagenes.add(new PlayersData(R.drawable.tyler_davis));
        imagenes.add(new PlayersData(R.drawable.keenan_evans));
        imagenes.add(new PlayersData(R.drawable.marcin_gortat));
        imagenes.add(new PlayersData(R.drawable.andrew_bogut));
        imagenes.add(new PlayersData(R.drawable.amir_johnson));
        imagenes.add(new PlayersData(R.drawable.george_king));
        imagenes.add(new PlayersData(R.drawable.zach_lofton));
        imagenes.add(new PlayersData(R.drawable.kosta_koufos));
        imagenes.add(new PlayersData(R.drawable.james_nunnally));
        imagenes.add(new PlayersData(R.drawable.billy_preston));
        imagenes.add(new PlayersData(R.drawable.zhou_qi));
        imagenes.add(new PlayersData(R.drawable.zach_randolph));
        imagenes.add(new PlayersData(R.drawable.malachi_richardson));
        imagenes.add(new PlayersData(R.drawable.dj_stephens));
        imagenes.add(new PlayersData(R.drawable.milos_teodosic));
        imagenes.add(new PlayersData(R.drawable.gary_trent_jr));
        imagenes.add(new PlayersData(R.drawable.mike_smith));
        imagenes.add(new PlayersData(R.drawable.john_morton));
        imagenes.addAll(listaImagenes);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView nombrePlayerTV;
        private TextView apellidoPlayerTV;
        private TextView teamPlayerTV;
        private ImageView imageTV;

        Context context;

        // Boton que da acceso a la pantalla de infoPlayer
        Button botonInfoPLayer;

        @SuppressLint("ResourceType")
        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();

            nombrePlayerTV = itemView.findViewById(R.id.nombrePlayers);
            apellidoPlayerTV = itemView.findViewById(R.id.apellidoPlayers);
            teamPlayerTV = itemView.findViewById(R.id.teamPlayers);
            imageTV = itemView.findViewById(R.id.imagenTeam);

            botonInfoPLayer = (Button) itemView.findViewById(R.id.infoPlayer);

        }
        public void setOnClickListeners(){
            botonInfoPLayer.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()){

                case R.id.infoPlayer:

                    Intent infoPlayer = new Intent(context, InfoPlayers.class);

                    infoPlayer.putExtra("nombrePlayerTV", nombrePlayerTV.getText());
                    infoPlayer.putExtra("apellidoPlayerTV", apellidoPlayerTV.getText());
                    infoPlayer.putExtra("teamPlayerTV", teamPlayerTV.getText());

                    context.startActivity(infoPlayer);
                    break;
            }
        }
    }
}
