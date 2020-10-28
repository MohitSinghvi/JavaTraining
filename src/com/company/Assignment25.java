package com.company;

import java.util.*;

public class Assignment25 {
    public static void getAvailableTables(List<Table> tableList){
        for(Table table : tableList){
            if(table.isBooked()){
                System.out.println(table);
            }
        }
    }

    public static void main(String[] args) {

        Set<Table> bookedTableSet = new HashSet<>();
        System.out.println("Enter the no. of tables");
        Scanner sc = new Scanner(System.in);

        int numOfTables = Integer.parseInt(sc.nextLine());
        List<Booking> bookingList = new ArrayList<>();
        List<Table> tableList = new ArrayList<>();
        for(int i=0;i<numOfTables;i++){
            String[] tableArr = sc.nextLine().split(",");
            Table table = new Table(Long.parseLong(tableArr[0]),Integer.parseInt(tableArr[1]),Integer.parseInt(tableArr[2]));
            tableList.add(table);
        }

        String choice;
        do{
            System.out.println("Enter Booking Details");
            String bookingLine = sc.nextLine();
            Booking.createBooking(tableList,bookingList,bookingLine);

            System.out.println("Continue? yes/no: ");
            choice =sc.nextLine();
            System.out.println("Available Tables are: ");
            System.out.format("%-5s %-10s %s\n","ID","Number","Capacity");
            getAvailableTables(tableList);
        }while(choice.equals("yes"));

    }
}
