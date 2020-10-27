package com.company;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment21 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details of Customer 1");
        String cust1Details=sc.nextLine();

        System.out.println("Enter the details of Customer 2");
        String cust2Details=sc.nextLine();

        String[] c1_details = cust1Details.split(",");
        String[] c2_details = cust2Details.split(",");

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMyyyy");

        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Details of customer1");
        Customer c1 = new Customer(Long.parseLong(c1_details[0]),c1_details[1],c1_details[2],dateFormat1.parse(c1_details[3]),Double.parseDouble(c1_details[4]),Double.parseDouble(c1_details[5]),dateFormat2.parse(c1_details[6]),Double.parseDouble(c1_details[7]));
        System.out.println(c1);

        System.out.println("Details of customer1");
        Customer c2 = new Customer(Long.parseLong(c2_details[0]),c2_details[1],c2_details[2],dateFormat1.parse(c2_details[3]),Double.parseDouble(c2_details[4]),Double.parseDouble(c2_details[5]),dateFormat2.parse(c2_details[6]),Double.parseDouble(c2_details[7]));
        System.out.println(c2);

        if(c1.equals(c2)){
            System.out.println("Customers are same");
        }
        else{
            System.out.println("Customers are Different");
        }
    }
}
