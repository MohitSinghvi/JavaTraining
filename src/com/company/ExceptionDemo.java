package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
//        System.out.println("Starting main");
//
//        method1();
//
//        System.out.println("Ending main");


//        try {
//            throw new MyOwnException();
//        } catch (MyOwnException e) {
//            e.printStackTrace();
//        }






    }
    public static void method1(){
        System.out.println("Starting method1");

        try {
            System.out.println("Entered try of method1..");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            method2(a, b);
            System.out.println("Exiting try of method1..");
        }catch (InputMismatchException e){
            System.out.println("Catch of method 1");
        }

        System.out.println("Ending method1");

    }
    public static void method2(int a, int b) throws ArithmeticException{
        System.out.println("Starting method2");
        int output =0;

        output=a/b;

//        try {
//
//            System.out.println("Entered try of method 2");
//            output=a/b;
//
//            System.out.println("Exiting try of method 2");
//
//
//        }catch (ArithmeticException e){
//            System.out.println("Catch of method 2");
//        }

        System.out.println("Ending method2");

    }

}
