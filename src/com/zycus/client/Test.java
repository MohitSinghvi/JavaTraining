package com.zycus.client;

import com.zycus.bo.Employee;
import com.zycus.dao.EmployeeDAO;
import com.zycus.services.EmployeeService;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService(new EmployeeDAO());

//        employeeService.getEmployees();
        int choice = 0;

        do{
            System.out.println("Enter choice\n1. Get All Employees\n2. Get Employee by id\n3. Save Employee\n4. Update Employee\n5. Delete Employee\n6. Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println(employeeService.getEmployees());
                    break;

                case 2:
                    System.out.println("Enter ID");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println(employeeService.getEmployee(id));
                    break;

                case 3:
                    System.out.println("Enter Employee details as: id,name,city,salary");
                    String[] lineArr=sc.nextLine().split(",");
                    employeeService.saveEmployee(new Employee(Integer.parseInt(lineArr[0]),lineArr[1],lineArr[2],Double.parseDouble(lineArr[3])));
                    break;

                case 4:
                    System.out.println("Enter Employee details as: id,name,city,salary");
                    String[] lineArr2=sc.nextLine().split(",");
                    employeeService.updateEmployee(new Employee(Integer.parseInt(lineArr2[0]),lineArr2[1],lineArr2[2],Double.parseDouble(lineArr2[3])));
                    break;

                case 5:
                    System.out.println("Enter ID");
                    int id1 = Integer.parseInt(sc.nextLine());
                    System.out.println(employeeService.deleteEmployee(id1));
                    break;

                case 6:

                    break;
            }

        }while(choice<6);


    }

}
