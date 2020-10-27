package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Booking {
    private Long id;
    private String customerName;
    private Table table;
    private Integer memberPresent;
    private Double billAmount;
    private Date bookingTime;

    static Long bookingId=100L;

    public Booking() {
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
        try {
             date = df.parse(bookingDetails[5]);
            for(Booking booking: bookingList){
                if(booking.getTable().getNumber().equals(tableNumber) && booking.getBookingTime().equals(date)){
                    System.out.println("Sorry, table not available");
                }
                else{
//                    Booking booking1 = new Booking()
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


//        Booking booking = new Booking(Long.parseLong(bookingDetails[0]),bookingDetails[0],Long.parseLong(bookingDetails[0]),bookingDetails[0],bookingDetails[0],bookingDetails[0]);

    }


}
