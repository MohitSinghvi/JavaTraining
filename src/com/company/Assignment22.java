package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Assignment22 {
    public static Customer createCustomer(String line) throws ParseException {

        String[] c1_details = line.split(",");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Customer customer = new Customer(Long.parseLong(c1_details[0]),c1_details[1],c1_details[2],dateFormat.parse(c1_details[3]),Double.parseDouble(c1_details[4]),Double.parseDouble(c1_details[5]),dateFormat.parse(c1_details[6]),Double.parseDouble(c1_details[7]));
        return customer;


    }
    public static List<Customer> findCustomer(List<Customer> customerList, String name ){
        List<Customer> result = new ArrayList<>();
        for(Customer customer : customerList){
            if(customer.getName().equals(name)){
                result.add(customer);
            }
        }
        return result;
    }
    public static List<Customer> findCustomer(List<Customer> customerList, Date birth){
        List<Customer> result = new ArrayList<>();
        for(Customer customer : customerList){
            if(customer.getBirthdate().equals(birth)){
                result.add(customer);
            }
        }
        return result;
    }
    public static List<Customer> findCustomer(List<Customer> customerList,Double rating){
        List<Customer> result = new ArrayList<>();
        for(Customer customer : customerList){
            if(customer.getRating().equals(rating)){
                result.add(customer);
            }
        }
        return result;
    }
    public static void displayResult(List<Customer> customerList){
        if(customerList.size()==0){
            System.out.println("No Customers found");
            return;
        }
        System.out.println("Id\tName\tMob\tDOB\tAvg.Spent\tTotal Amount\tRating");
        for(Customer c : customerList){
            System.out.println(c);
        }
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of Customers?");
        int no_of_customers= Integer.parseInt(sc.nextLine());
        List<Customer> customerList = new ArrayList<>();
        for(int i=0;i<no_of_customers;i++){
            String custDetails=sc.nextLine();
            Customer customer = createCustomer(custDetails);
            customerList.add(customer);
        }
        System.out.println("Enter the Search Type:\n1.By name\n2.By Birth date\n.By Rating");
        int choice = Integer.parseInt(sc.nextLine());
        List<Customer> searchResult;
        switch (choice){
            case 1:
                System.out.println("Enter the name of customer: ");
                String name = sc.nextLine();
                searchResult = findCustomer(customerList,name);
                displayResult(searchResult);
                break;

            case 2:
                System.out.println("Enter the birth date of the customer to be searched:");
                String date = sc.nextLine();
                Date date1 = dateFormat.parse(date);
                searchResult = findCustomer(customerList,date1);
                displayResult(searchResult);

                break;
            case 3:
                System.out.println("Enter the rating of the customer to be searched:");
                double rating=sc.nextDouble();
                searchResult = findCustomer(customerList,rating);
                displayResult(searchResult);



                break;

        }


    }
}
