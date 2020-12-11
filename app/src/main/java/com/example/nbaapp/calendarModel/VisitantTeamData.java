package com.example.nbaapp.calendarModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VisitantTeamData {

    @SerializedName("full_name")
    @Expose
    private String full_name;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
