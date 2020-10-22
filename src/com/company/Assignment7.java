package com.company;
import java.util.*;
public class Assignment7 {
    public static void main(String[] args) {
        System.out.println("Enter Current over, current ball, total overs");
        Scanner sc = new Scanner(System.in);
        int current_over,current_ball,total_over;

        current_over=sc.nextInt();
        current_ball=sc.nextInt();
        total_over=sc.nextInt();

        if((current_over*6+current_ball)<(0.75*(total_over*6))){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }


    }
}
