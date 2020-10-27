package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

//class A{
//    public void m1(){
//        System.out.println("m1 of A");
//    }
//}
//class B extends A{
//    public void m1(){
//        System.out.println("m1 of B");
//    }
//    public void m2(){
//        System.out.println("m2 of B");
//    }
//}
public class Assignment23 {

    public static void main(String[] args) throws ParseException {
//        A a = new B();
//        a.m2();
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        int choice=0;
        do{
            System.out.println("Menu\n1. Validate Age \n2. Validate Name\n3. Lucky Number\n4. Exit \nChoice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.println("Enter the Birth Date: ");
                    Date date = df.parse(sc.nextLine());
                    if(validateAge(date)){
                        System.out.println("Valid Age");
                    }
                    else{
                        System.out.println("Invalid Age");
                    }
                    break;

                case 2:
                    System.out.println("Enter Name:");
                    if(validateName(sc.nextLine())){
                        System.out.println("Name Valid");
                    }
                    else{
                        System.out.println("Name Invalid");
                    }
                    break;

                case 3:
                    System.out.println("Enter Number");
                    if(validateLuckCustomer(sc.nextLine())){
                        System.out.println("Lucky Customer");

                    }else{
                        System.out.println("Unlucky customer");
                    }
                    break;

                default:
                    choice =4;
                    break;
            }

        }while(choice !=4);

    }

    public static boolean validateAge(Date birthDate) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = df.parse("02-02-2018");
        int diff=currentDate.getYear()-birthDate.getYear();
        if(diff>18){
            return true;
        }else if(diff==18){

            if(currentDate.getMonth()>birthDate.getMonth()){
                return true;
            }
            else if(currentDate.getMonth()==birthDate.getMonth()){
                return currentDate.getDate() >= birthDate.getDay();
            }
            else{
                return false;
            }

        }
        else{
            return false;
        }

    }
    public static boolean validateName(String name){
        for(int i=0;i<name.length();i++){
            if(!Character.isLetter(name.charAt(i))){
                return false;
            }

        }
        return true;
    }
    public static boolean validateLuckCustomer(String mobile){

        int sum =0;

        if(mobile.length()==1){
            if(Integer.parseInt(mobile)==1){
                return true;
            }
            return false;
        }
        for(int i=0;i<mobile.length();i++){
            int num=Character.getNumericValue(mobile.charAt(i));
            sum+=num;
        }
        return validateLuckCustomer(Integer.toString(sum));
    }


}
