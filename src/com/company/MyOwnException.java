package com.company;

public class MyOwnException extends Throwable{

    MyOwnException(){
        System.out.println("MY OWN EXCEPTION");
    }
    MyOwnException(String s){
        System.out.println("MY OWN EXCEPTION");
    }
}
