package com.example.nbaapp.calendarModel;

public class CalendarData {

    private HomeTeamData home_team;

    private VisitantTeamData visitor_team;

    private String url;

    private int foto;

    public CalendarData(){ }

    public CalendarData(int foto) {
        this.foto = foto;
    }

    public HomeTeamData getHome_team() {
        return home_team;
    }

    public void setHome_team(HomeTeamData home_team) {
        this.home_team = home_team;
    }

    public VisitantTeamData getVisitor_team() {
        return visitor_team;
    }

    public void setVisitor_team(VisitantTeamData visitor_team) {
        this.visitor_team = visitor_team;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
