package com.company;

public class PlayerBO {
    public PlayerBO() {
    }

    public Player createPlayer(String data){

        String[] data_arr= data.split(",");
        Player player = new Player();
        player.setName(data_arr[0]);
        player.setCountry(data_arr[1]);
        player.setSkill(data_arr[2]);



        return player;
    }
}
