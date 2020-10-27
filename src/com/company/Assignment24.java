package com.company;

import java.text.ParseException;
import java.util.*;

public class Assignment24 {
    public static void main(String[] args) throws ParseException {
        List<Customer> customerList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

//        customerList.add(new Customer(3L,"mohit","9191919191",new Date(),3000.0,30000.0,new Date(),5.0));
//        customerList.add(new Customer(1L,"ncust2","8181818191",new Date(),2000.0,20000.0,new Date(),1.0));
//        customerList.add(new Customer(2L,"singhvi","7191919191",new Date(),4000.0,40000.0,new Date(),4.0));
//
        Comparator<Customer> amountComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if(o1.getAverageSpendAmount()>o2.getAverageSpendAmount()) return 1;
                if(o1.getAverageSpendAmount()==o2.getAverageSpendAmount()) return 0;
                else return -1;
            }
        };
//
        Comparator<Customer> ratingComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if(o1.getRating()>o2.getRating()) return 1;
                if(o1.getRating()==o2.getRating()) return 0;
                else return -1;
            }
        };
//
////        Collections.sort(customerList);
////        Collections.sort(customerList,amountComparator);
//        Collections.sort(customerList,ratingComparator);
//        System.out.println(customerList);


        System.out.println("Enter the no. of Customers");

        int noOfCustomers = Integer.parseInt(sc.nextLine());

        for(int i=0;i<noOfCustomers;i++){
            String line = sc.nextLine();
            Customer customer = Assignment22.createCustomer(line);
            customerList.add(customer);

        }
        System.out.println("Sort Choice\n1.Name\n2.AmountSpent\n3.Rating");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                Collections.sort(customerList);
                Assignment22.displayResult(customerList);
                break;
            case 2:
                customerList.sort(amountComparator);
                Assignment22.displayResult(customerList);
                break;
            case 3:
                customerList.sort(ratingComparator);
                Assignment22.displayResult(customerList);
                break;
            default:
                System.out.println("Wrong Choice");

        }







    }
}
