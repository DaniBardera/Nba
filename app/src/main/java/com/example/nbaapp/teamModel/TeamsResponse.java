package com.example.nbaapp.teamModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class TeamsResponse {
    @SerializedName("data")
    @Expose
    private ArrayList<TeamsData> data;
    private ArrayList<TeamsData> imagen;

    public ArrayList<TeamsData> getData() {
        return data;
    }

    public void setData(ArrayList<TeamsData> data) {
        this.data = data;
    }
    public ArrayList<TeamsData> getImagenes() {
        return data;
    }

}
