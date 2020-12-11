package com.example.nbaapp.playerModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class PlayersResponse {

    @SerializedName("data")
    @Expose
    private ArrayList<PlayersData> data;
    private ArrayList<PlayersData> imagen;

    public ArrayList<PlayersData> getData() {
        return data;
    }

    public ArrayList<PlayersData> getImagenes() {
        return data;
    }

    public void setData(ArrayList<PlayersData> data) {
        this.data = data;
    }


}
