package com.company;
import java.util.*;

public class Assignment6 {
    public static void main(String[] args){
        System.out.println("Enter the status of coach");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(input.equals("Yes")){
            System.out.println("Keeping");
        }
        else if(input.equals("No")){
            System.out.println("Batting");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
