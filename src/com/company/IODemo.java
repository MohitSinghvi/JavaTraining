package com.company;

import java.io.*;

public class IODemo {
    public static void main(String[] args) throws IOException {

//        InputStreamReader reader = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(reader);
//
//        String str = br.readLine();
//        System.out.println(str);
//        Console c = System.console();
//        String n = c.readLine();
//
//        System.out.println(n);
        PrintStream pout = new PrintStream(System.out); pout.println("Helloworld"); pout.print("This is PrintStream Example");

    }




}
