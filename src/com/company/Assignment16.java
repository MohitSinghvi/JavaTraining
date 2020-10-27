//package com.company;
//import java.util.*;
//class Skill{
//    private String skillName;
//
//    Skill(String skillName){
//        this.skillName=skillName;
//    }
//
//    public String getSkillName() {
//        return skillName;
//    }
//
//    @Override
//    public String toString() {
//        return skillName ;
//    }
//}
//class Player{
//    private String name;
//    private String country;
//    private Skill skill;
//
//    Player(){
//
//    }
//    Player(String name, String country, Skill skill){
//        this.name=name;
//        this.country=country;
//        this.skill=skill;
//    }
//
//    public Skill getSkill() {
//        return skill;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return name+"\t"+country+"\t"+skill;
//    }
//}
//
//class PlayerBO{
//    void viewDetails(Player[] playerList){
//        for(int i=0;i<playerList.length;i++){
//            System.out.println(playerList[i].toString());
//        }
//    }
//    void printPlayerDetailWithSkill(Player[] playerList,String skill){
////        System.out.println("HIHIHI");
//        int count=0;
//        for(int i=0;i<playerList.length;i++){
//            if(playerList[i].getSkill().getSkillName().equals(skill)) {
//                System.out.println(playerList[i].toString());
//                count++;
//            }
//        }
//        if(count==0){
//            System.out.println("Not Found");
//        }
//    }
//}
//
//public class Assignment16 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no. of players");
////        sc.next();
//        int num_of_players= Integer.parseInt(sc.nextLine());
//        Object[] arr = new Object[num_of_players];
//
//        Player[] player_arr = new Player[num_of_players];
//
//        for(int i=0;i<num_of_players;i++){
//            System.out.print("Enter the player"+(i+1)+" details:\n");
//
//            System.out.println("Enter Player Name");
//
//            String playerName = sc.nextLine();
//
//
//            System.out.println("Enter country name");
////            sc.next();
//
//            String country = sc.nextLine();
//
//
//            System.out.println("Enter skill");
//            Skill skill = new Skill(sc.nextLine());
//
//
//
//            Player p = new Player(playerName,country,skill);
//            arr[i]=p;
//            player_arr[i]=p;
//        }
//        PlayerBO playerbo = new PlayerBO();
////        boolean exit=false;
//        int choice;
//        do{
//            System.out.println("Menu:\n1. View Details \n2. Filter Players with skill \n3. Exit");
//
//            choice = Integer.parseInt(sc.nextLine());
//
//            switch(choice){
//                case 1:
//                    System.out.println("Player\t Country\t Skill");
//                    playerbo.viewDetails(player_arr);
//
//                break;
//                case 2:
//                    System.out.println("Enter Skill: ");
//                    String skill = sc.nextLine();
//
//                    playerbo.printPlayerDetailWithSkill(player_arr,skill);
//
//                    break;
//                case 3:
////                    exit=true;
//                    break;
//            }
//        }while (choice!=3);
//    }
//}
