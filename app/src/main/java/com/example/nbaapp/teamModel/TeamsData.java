package com.example.nbaapp.teamModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamsData {

    @SerializedName("full_name")
    @Expose
    private String full_name;

    private String url;

    private int foto;

    public TeamsData(int foto) {
        this.foto = foto;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
