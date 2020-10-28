package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    private Long id;
    private String customerName;
    private Table table;
    private Integer memberPresent;
    private Double billAmount;
    private Date bookingTime;

//    static Long bookingId=100L;

    public Booking() {
    }
    public static Map<Date,Double> calculateDayBilling(List<Booking> bookings){
        Map<Date,Double> billingMap = new HashMap<>();
        for(Booking booking : bookings){
            if(!billingMap.containsKey(booking.getBookingTime())){
                billingMap.put(booking.getBookingTime(),booking.billAmount);
            }
            else{
                billingMap.put(booking.getBookingTime(),billingMap.get(booking.getBookingTime())+booking.billAmount);
            }

        }
        return billingMap;
    }

    public Booking(Long id, String customerName, Table table, Integer memberPresent, Double billAmount, Date bookingTime) {
        this.id = id;
        this.customerName = customerName;
        this.table = table;
        this.memberPresent = memberPresent;
        this.billAmount = billAmount;
        this.bookingTime = bookingTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Integer getMemberPresent() {
        return memberPresent;
    }

    public void setMemberPresent(Integer memberPresent) {
        this.memberPresent = memberPresent;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public static void createBooking(List<Table> tableList, List<Booking> bookingList, String line){
        String[] bookingDetails = line.split(",");
        Integer tableNumber = Integer.parseInt(bookingDetails[2]);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date date;
        boolean bookingDone =false;
        try {
             date = df.parse(bookingDetails[5]);
            for(Booking booking: bookingList){
                if(booking.getTable().getNumber().equals(tableNumber) && booking.getBookingTime().equals(date)){
                    System.out.println("Sorry, table not available");
                    return;
                }
            }
            for(Table table : tableList){
                if(table.getNumber()==tableNumber && table.getCapacity()>=Integer.parseInt(bookingDetails[3])){
                    Booking booking1 = new Booking(Long.parseLong(bookingDetails[0]),bookingDetails[1],table,Integer.parseInt(bookingDetails[3]),Double.parseDouble(bookingDetails[4]), date);
                    bookingList.add(booking1);
                    System.out.println("Booking Successful");
                    bookingDone=true;
                    table.setBooked(true);
                    break;
//                    return;
                }

            }
            if (!bookingDone)
                System.out.println("Sorry, table not available");
        } catch (ParseException e) {
            e.printStackTrace();
        }


//        Booking booking = new Booking(Long.parseLong(bookingDetails[0]),bookingDetails[0],Long.parseLong(bookingDetails[0]),bookingDetails[0],bookingDetails[0],bookingDetails[0]);

    }


}
