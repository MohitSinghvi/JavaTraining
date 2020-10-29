package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyDBConnect {
    private Connection con;
    private PreparedStatement saveEmployeePrepareStatement;
    private PreparedStatement getEmployeePrepareStatement;
    private PreparedStatement getAllEmployeePrepareStatement;
    private PreparedStatement updateEmployeePrepareStatement;
    private PreparedStatement deleteEmployeePrepareStatement;



    public MyDBConnect(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");
            String save_emp_query = "insert into employee(empId, empName,city,salary) values(?,?,?,?)";
            String get_emp_query = "select * from employee where empId= ?";
            String get_all_emp_query= "select * from employee";
            String delete_emp_query= "delete from employee where empId = ?";
            String update_emp_query="update employee set empName=?, city=?, salary=? where empId = ? ";

            saveEmployeePrepareStatement=con.prepareStatement(save_emp_query);
            getEmployeePrepareStatement=con.prepareStatement(get_emp_query);
            getAllEmployeePrepareStatement=con.prepareStatement(get_all_emp_query);
            deleteEmployeePrepareStatement=con.prepareStatement(delete_emp_query);
            updateEmployeePrepareStatement= con.prepareStatement(update_emp_query);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public Employee getEmployee(int id){
        try {
            getEmployeePrepareStatement.setInt(1,id);
            ResultSet emp_result= getEmployeePrepareStatement.executeQuery();
            emp_result.next();

            return getEmployeeObject(emp_result);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Employee getEmployeeObject(ResultSet emp_result){
        try {
            return new Employee(emp_result.getInt("empId"),emp_result.getString("empName"),emp_result.getString("city"),emp_result.getDouble("salary"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        try {
            ResultSet result = getAllEmployeePrepareStatement.executeQuery();
            while(result.next()){
                employeeList.add(getEmployeeObject(result));
            }

            return employeeList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Employee saveEmployee(Employee emp){
        try {
            saveEmployeePrepareStatement.setInt(1,emp.getEmpId());
            saveEmployeePrepareStatement.setString(2,emp.getEmpName());
            saveEmployeePrepareStatement.setString(3,emp.getCity());
            saveEmployeePrepareStatement.setDouble(4,emp.getSalary());

            int no_of_rows_affected = saveEmployeePrepareStatement.executeUpdate();
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
            updateEmployeePrepareStatement.setString(1,emp.getEmpName());
            updateEmployeePrepareStatement.setString(2,emp.getCity());
            updateEmployeePrepareStatement.setDouble(3,emp.getSalary());
            updateEmployeePrepareStatement.setInt(4,emp.getEmpId());

            if(updateEmployeePrepareStatement.executeUpdate()>0){
                System.out.println("Update Successful");
                return emp;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return null;
    }

    public Employee deleteEmployee(int id){

        try {
            deleteEmployeePrepareStatement.setInt(1,id);
            if(deleteEmployeePrepareStatement.executeUpdate()>0){
                return getEmployee(id);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }










}
