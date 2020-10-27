package com.company;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Customer implements Serializable,Comparable<Customer> {
    private Long id;
    private String name;
    private String mobileNumber;
    private Date birthdate;
    private Double averageSpendAmount;
    private Double totalAmount;
    private Date dateEnrolled;
    private Double rating;

    public Customer() {
    }

    public Customer(Long id, String name, String mobileNumber, Date birthdate, Double averageSpendAmount, Double totalAmount, Date dateEnrolled, Double rating) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.birthdate = birthdate;
        this.averageSpendAmount = averageSpendAmount;
        this.totalAmount = totalAmount;
        this.dateEnrolled = dateEnrolled;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Double getAverageSpendAmount() {
        return averageSpendAmount;
    }

    public void setAverageSpendAmount(Double averageSpendAmount) {
        this.averageSpendAmount = averageSpendAmount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(Date dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
//        return
//                "\n" + id +
//                "\t" + name +
//                "\t" + mobileNumber +
//                "\t" + df.format(birthdate) +
//                "\t" + averageSpendAmount +
//                "\t" + totalAmount +
//                "\t" + df.format(dateEnrolled )+
//                "\t" + rating
//                ;
        return String.format("%-5s %-15s %-15s %-15s %-20s %-15s %-15s %s\n", id,name,mobileNumber,df.format(birthdate),averageSpendAmount,totalAmount,df.format(dateEnrolled ),rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return name.toLowerCase().equals(customer.name.toLowerCase()) &&
                mobileNumber.equals(customer.mobileNumber) &&
                birthdate.equals(customer.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobileNumber, birthdate);
    }


    @Override
    public int compareTo(Customer o) {
//        return 0;
        return name.compareTo(o.getName());
    }

}
