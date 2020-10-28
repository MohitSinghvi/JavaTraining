package com.company;

import java.awt.print.Book;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        List<Booking> bookingList = new ArrayList<>();
        List<Table> tableList = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        for(int i=0;i<num;i++){
            String[] bookingDetails = sc.nextLine().split(",");

            Date date = null;
            try {
                date = df.parse(bookingDetails[5]);
            } catch (ParseException e) {
                e.printStackTrace();
            }
//            Booking.createBooking(tableList,bookingList,bookingDetails);
            Booking booking1 = new Booking(Long.parseLong(bookingDetails[0]),bookingDetails[1],new Table(),Integer.parseInt(bookingDetails[3]),Double.parseDouble(bookingDetails[4]), date);

            bookingList.add(booking1);
        }
        System.out.format("%-20s %s\n","Date","Amount");
        Map<Date, Double> billingMap = Booking.calculateDayBilling(bookingList);
        for(Map.Entry<Date,Double> entry : billingMap.entrySet()){
            System.out.format("%-20s %s\n",df.format(entry.getKey()),entry.getValue());
        }
    }
}
