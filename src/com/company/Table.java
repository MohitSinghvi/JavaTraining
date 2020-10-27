package com.company;

import java.util.Comparator;
import java.util.List;

public class Table implements Comparable<Table> {
    private Long id;
    private Integer number;
    private Integer capacity;


    public Table() {

    }

    public Table(Long id, Integer number, Integer capacity) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }


    @Override
    public int compareTo(Table o) {
        return number-o.getNumber();
    }

    public static Table createTable(String line){
        String [] lineArr=line.split(",");
        return new Table(Long.parseLong(lineArr[0]),Integer.parseInt(lineArr[1]),Integer.parseInt(lineArr[2]));

    }




}
