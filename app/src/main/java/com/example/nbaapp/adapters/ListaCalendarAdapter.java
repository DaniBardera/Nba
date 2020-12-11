package com.example.nbaapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.nbaapp.R;
import com.example.nbaapp.calendarModel.CalendarData;


import java.util.ArrayList;

public class ListaCalendarAdapter extends RecyclerView.Adapter<ListaCalendarAdapter.ViewHolder> {

    private ArrayList<CalendarData> homeData;
    private ArrayList<CalendarData> visitorData;
    private ArrayList<CalendarData> homeImagen;
    private ArrayList<CalendarData> visitorImagen;

    public ListaCalendarAdapter(){
        homeData = new ArrayList<>();
        visitorData = new ArrayList<>();
        homeImagen = new ArrayList<>();
        visitorImagen = new ArrayList<>();
    }

    public ListaCalendarAdapter(ArrayList<CalendarData> homeData, ArrayList<CalendarData> visitorData, ArrayList<CalendarData> homeImagen, ArrayList<CalendarData> visitorImagen){
        this.homeData = homeData;
        this.visitorData = visitorData;
        this.homeImagen = homeImagen;
        this.visitorImagen = visitorImagen;
    }

    @Override
    public ListaCalendarAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_calendar, parent, false);
        return new ListaCalendarAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListaCalendarAdapter.ViewHolder holder, int position) {
        CalendarData home = homeData.get(position);
        holder.homeTeamTV.setText(home.getHome_team().getFull_name());

        CalendarData visitant = visitorData.get(position);
        holder.visitorTeamTV.setText(visitant.getVisitor_team().getFull_name());

        CalendarData homeTeamImagen = homeImagen.get(position);
        holder.homeTeamImageV.setImageResource(homeTeamImagen.getFoto());

        CalendarData visitorTeamImagen = visitorImagen.get(position);
        holder.visitorTeamImageV.setImageResource(visitorTeamImagen.getFoto());
    }

    @Override
    public int getItemCount() {
        return homeData.size();
    }

    public void adicionarListaHomeTeams(ArrayList<CalendarData> listaHomeTeams) {
        homeData.addAll(listaHomeTeams);
        notifyDataSetChanged();
    }

    public void adicionarListaVisitorTeams(ArrayList<CalendarData> listaVisitorTeams) {
        visitorData.addAll(listaVisitorTeams);
        notifyDataSetChanged();
    }

    public void adicionarListaHomeTeamImagenes(ArrayList<CalendarData> listaHomeTeamImagenes) {

        homeImagen.add(new CalendarData(R.drawable.boston_celtics));
        homeImagen.add(new CalendarData(R.drawable.boston_celtics));
        homeImagen.add(new CalendarData(R.drawable.philadelphia_76ers));
        homeImagen.add(new CalendarData(R.drawable.washington_wizards));
        homeImagen.add(new CalendarData(R.drawable.sacramento_kings));
        homeImagen.add(new CalendarData(R.drawable.detroit_pistons));
        homeImagen.add(new CalendarData(R.drawable.new_orleans_pelicans));
        homeImagen.add(new CalendarData(R.drawable.indiana_pacers));
        homeImagen.add(new CalendarData(R.drawable.atlanta_hawks));
        homeImagen.add(new CalendarData(R.drawable.utah_jazz));
        homeImagen.add(new CalendarData(R.drawable.chicago_bulls));
        homeImagen.add(new CalendarData(R.drawable.dallas_maveriks));
        homeImagen.add(new CalendarData(R.drawable.philadelphia_76ers));
        homeImagen.add(new CalendarData(R.drawable.sacramento_kings));
        homeImagen.add(new CalendarData(R.drawable.milwaukee_bucks));
        homeImagen.add(new CalendarData(R.drawable.houston_rockets));
        homeImagen.add(new CalendarData(R.drawable.golden_state_warriors));
        homeImagen.add(new CalendarData(R.drawable.atlanta_hawks));
        homeImagen.add(new CalendarData(R.drawable.houston_rockets));
        homeImagen.add(new CalendarData(R.drawable.toronto_raptors));
        homeImagen.add(new CalendarData(R.drawable.atlanta_hawks));
        homeImagen.add(new CalendarData(R.drawable.indiana_pacers));
        homeImagen.add(new CalendarData(R.drawable.chicago_bulls));
        homeImagen.add(new CalendarData(R.drawable.golden_state_warriors));
        homeImagen.add(new CalendarData(R.drawable.memphis_grizzlies));

        homeImagen.addAll(listaHomeTeamImagenes);
        notifyDataSetChanged();
    }

    public void adicionarListaVisitorTeamImagenes(ArrayList<CalendarData> listaVisitorTeamImagenes) {

        visitorImagen.add(new CalendarData(R.drawable.charlotte_hornets));
        visitorImagen.add(new CalendarData(R.drawable.la_clippers));
        visitorImagen.add(new CalendarData(R.drawable.denver_nuggets));
        visitorImagen.add(new CalendarData(R.drawable.cleveland_cavaliers));
        visitorImagen.add(new CalendarData(R.drawable.miami_heat));
        visitorImagen.add(new CalendarData(R.drawable.washington_wizards));
        visitorImagen.add(new CalendarData(R.drawable.minnesota_timberwolves));
        visitorImagen.add(new CalendarData(R.drawable.cleveland_cavaliers));
        visitorImagen.add(new CalendarData(R.drawable.charlotte_hornets));
        visitorImagen.add(new CalendarData(R.drawable.san_antonio_spurs));
        visitorImagen.add(new CalendarData(R.drawable.washington_wizards));
        visitorImagen.add(new CalendarData(R.drawable.portland_trail_brazers));
        visitorImagen.add(new CalendarData(R.drawable.angeles_lakers));
        visitorImagen.add(new CalendarData(R.drawable.phoenix_suns));
        visitorImagen.add(new CalendarData(R.drawable.orlando_magic));
        visitorImagen.add(new CalendarData(R.drawable.oklahoma_city_thunder));
        visitorImagen.add(new CalendarData(R.drawable.miami_heat));
        visitorImagen.add(new CalendarData(R.drawable.orlando_magic));
        visitorImagen.add(new CalendarData(R.drawable.dallas_maveriks));
        visitorImagen.add(new CalendarData(R.drawable.brooklyn_nets));
        visitorImagen.add(new CalendarData(R.drawable.angeles_lakers));
        visitorImagen.add(new CalendarData(R.drawable.charlotte_hornets));
        visitorImagen.add(new CalendarData(R.drawable.milwaukee_bucks));
        visitorImagen.add(new CalendarData(R.drawable.utah_jazz));
        visitorImagen.add(new CalendarData(R.drawable.san_antonio_spurs));

        visitorImagen.addAll(listaVisitorTeamImagenes);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView homeTeamTV;
        private TextView visitorTeamTV;
        private ImageView homeTeamImageV;
        private ImageView visitorTeamImageV;

        public ViewHolder(View itemView) {
            super(itemView);
            homeTeamTV = itemView.findViewById(R.id.local);
            visitorTeamTV = itemView.findViewById(R.id.visitante);
            homeTeamImageV = itemView.findViewById(R.id.imagenLocalTeam);
            visitorTeamImageV = itemView.findViewById(R.id.imagenVisitantTeam);
        }
    }
}
