package com.company;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        Set<Employee> set = new HashSet<>();



//        set.add( new Employee(1,"Mohit",10));
//        set.add( new Employee(3,"Ash",10));
//        set.add( new Employee(2,"Emp2",10));
//        set.add( new Employee(4,"Emp3",10));
//
//        set.add( new Employee(4,"Emp3",10));
//
////        Employee e1 = new Employee(1,"Mohit",10);
////        Employee e2 = new Employee(1,"Mohit",10);
////        System.out.println(e1.hashCode()+", "+e2.hashCode());
//        System.out.println(set.contains(new Employee(4,"Emp3",10)));
//
//        System.out.println(set);


//        set = new LinkedHashSet<>();
//
//
//
//        set.add( new Employee(1,"Mohit",10));
//        set.add( new Employee(3,"Ash",10));
//        set.add( new Employee(2,"Emp2",10));
//        set.add( new Employee(4,"Emp3",10));
//
//        System.out.println(set);
//
        set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });



        set.add( new Employee(1,"Mohit",10));
        set.add( new Employee(3,"Ash",10));
        set.add( new Employee(2,"Emp2",10));
        set.add( new Employee(4,"Emp3",10));
        set.add( new Employee(4,"Emp3",10));


        System.out.println(set);




    }
}
