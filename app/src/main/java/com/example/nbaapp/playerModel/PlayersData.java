package com.example.nbaapp.playerModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayersData {

    @SerializedName("first_name")
    @Expose
    private String first_name;

    @SerializedName("last_name")
    @Expose
    private String last_name;

    private TeamDataPlayer team;

    private String url;

    private int foto;

    public PlayersData(){ }

    public PlayersData(int foto) {
        this.foto = foto;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public TeamDataPlayer getTeam() {
        return team;
    }

    public void setTeam(TeamDataPlayer team) {
        this.team = team;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
