package com.zycus.utils;

public class EmployeeCRUDOps {
    public static final String GET_ALL_EMPLOYEES = "SELECT * FROM employee";
    public static final String GET_EMPLOYEE="select * from employee where empId= ?";


    public static final String DELETE_EMP_QUERY= "delete from employee where empId = ?";
    public static final String UPDATE_EMP_QUERY="update employee set empName=?, city=?, salary=? where empId = ? ";

    public static final String SAVE_EMP_QUERY = "insert into employee(empId, empName,city,salary) values(?,?,?,?)";

}
