package com.zycus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zycus.bo.Employee;
import com.zycus.utils.DBConnect;
import com.zycus.utils.EmployeeCRUDOps;

public class EmployeeDAO {

    Connection connection;
    private PreparedStatement saveEmpPS;
    private PreparedStatement getEmpPS;
    private PreparedStatement getAllEmpPS;
    private PreparedStatement updateEmpPS;
    private PreparedStatement deleteEmpPS;

    public EmployeeDAO(){

        try {
            connection = DBConnect.getConnection();
            if(connection!=null) {
                getAllEmpPS = connection.prepareStatement(EmployeeCRUDOps.GET_ALL_EMPLOYEES);
                getEmpPS=connection.prepareStatement(EmployeeCRUDOps.GET_EMPLOYEE);
                updateEmpPS=connection.prepareStatement(EmployeeCRUDOps.UPDATE_EMP_QUERY);
                deleteEmpPS=connection.prepareStatement(EmployeeCRUDOps.DELETE_EMP_QUERY);
                saveEmpPS=connection.prepareStatement(EmployeeCRUDOps.SAVE_EMP_QUERY);

            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public Employee getEmployeeObject(ResultSet emp_result){
        try {
            return new Employee(emp_result.getInt("empId"),emp_result.getString("empName"),emp_result.getString("city"),emp_result.getDouble("salary"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Employee getEmployee(int id){
        try {
            getEmpPS.setInt(1,id);
            ResultSet emp_result= getEmpPS.executeQuery();
            emp_result.next();

            return getEmployeeObject(emp_result);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList();
        ResultSet result = null;

        try {
            result = getAllEmpPS.executeQuery();
            while(result.next()){
                employeeList.add(getEmployeeObject(result));
            }

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;

    }

    public Employee saveEmployee(Employee emp){
        try {
            saveEmpPS.setInt(1,emp.getEmpId());
            saveEmpPS.setString(2,emp.getEmpName());
            saveEmpPS.setString(3,emp.getCity());
            saveEmpPS.setDouble(4,emp.getSalary());

            int no_of_rows_affected = saveEmpPS.executeUpdate();
            if(no_of_rows_affected>0){
//                System.out.println("Employee Saved!");
                return emp;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



        return null;
    }

    public Employee updateEmployee(Employee emp){
        try {
            updateEmpPS.setString(1,emp.getEmpName());
            updateEmpPS.setString(2,emp.getCity());
            updateEmpPS.setDouble(3,emp.getSalary());
            updateEmpPS.setInt(4,emp.getEmpId());

            if(updateEmpPS.executeUpdate()>0){
//                System.out.println("Update Successful");
                return emp;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    public Employee deleteEmployee(int id){

        try {
            Employee emp =getEmployee(id);
            deleteEmpPS.setInt(1,id);
            if(deleteEmpPS.executeUpdate()>0){
                return emp;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void closeDB(){
            DBConnect.closeConnection(connection);
    }




    //..

}
