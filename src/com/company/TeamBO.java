package com.company;

public class TeamBO {
    public Team createTeam(String data, Player[] PlayerList){
        Team team = new Team();
        String[] data_arr = data.split(",");
        team.setName(data_arr[0]);
        Player p = new Player();

//        team.setCaptain(data_arr[1]);



        return null;
    }
}
