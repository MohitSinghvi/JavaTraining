package JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MyDBConnect {
    private Connection con;
    private PreparedStatement saveEmpPS;
    private PreparedStatement getEmpPS;
    private PreparedStatement getAllEmpPS;
    private PreparedStatement updateEmpPS;
    private PreparedStatement deleteEmpPS;



    public MyDBConnect(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");

            String save_emp_query = "insert into employee(empId, empName,city,salary) values(?,?,?,?)";
            String get_emp_query = "select * from employee where empId= ?";
            String get_all_emp_query= "select * from employee";
            String delete_emp_query= "delete from employee where empId = ?";
            String update_emp_query="update employee set empName=?, city=?, salary=? where empId = ? ";

            saveEmpPS =con.prepareStatement(save_emp_query);
            getEmpPS =con.prepareStatement(get_emp_query);
            getAllEmpPS =con.prepareStatement(get_all_emp_query);
            deleteEmpPS =con.prepareStatement(delete_emp_query);
            updateEmpPS = con.prepareStatement(update_emp_query);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

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
            ResultSet result = getAllEmpPS.executeQuery();
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
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
