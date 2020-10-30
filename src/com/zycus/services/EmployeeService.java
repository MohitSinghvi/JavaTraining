package com.zycus.services;
import java.util.List;

import com.zycus.bo.Employee;
import com.zycus.dao.EmployeeDAO;

public class EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> getEmployees(){
        //get all employees using employeeDao
        List<Employee> list =  employeeDAO.getEmployees();
        //may perform some manipulation

        return list;
    }

    public Employee getEmployee(int id) {
        //get  employee using employeeDao
        Employee emp = employeeDAO.getEmployee(id);
        //may perform some manipulation

        return emp;
    }

    public Employee deleteEmployee(int id){
        Employee emp = employeeDAO.deleteEmployee(id);

        return emp;
    }

    public Employee updateEmployee(Employee emp){
        Employee emp1 = employeeDAO.updateEmployee(emp);

        return emp1;

    }

    public Employee saveEmployee(Employee emp){
        Employee emp1 = employeeDAO.saveEmployee(emp);

        return emp1;

    }


}
