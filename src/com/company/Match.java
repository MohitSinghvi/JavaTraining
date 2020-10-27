package com.company;

public class Match {
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Team getTeamone() {
        return teamone;
    }

    public void setTeamone(Team teamone) {
        this.teamone = teamone;
    }

    public Team getTeamtwo() {
        return teamtwo;
    }

    public void setTeamtwo(Team teamtwo) {
        this.teamtwo = teamtwo;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    private String date;
    private Team teamone;
    private Team teamtwo;
    private String venue;
    private Team team;


}
