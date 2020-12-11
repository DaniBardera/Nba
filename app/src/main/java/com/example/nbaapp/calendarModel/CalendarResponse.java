package com.example.nbaapp.calendarModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class CalendarResponse {

    @SerializedName("data")
    @Expose
    private ArrayList<CalendarData> data;

    public ArrayList<CalendarData> getHomeData(){return data;}
    public ArrayList<CalendarData> getVisitorData(){return data;}

    public ArrayList<CalendarData> getImagenes(){return data;}

    public void setData(ArrayList<CalendarData> data) {
        this.data = data;
    }
}
