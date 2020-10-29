package JDBC;

import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Load Database driver
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");


            //Create Statement Object
//            Statement statement = con.createStatement();


            //Execute the SQL statement

            // insert
//            String sql = "Insert into employee(empId,empName,city,salary) VALUES(103,'Vishal','Pune',10000)";

            //Delete
//            String sql = "delete from employee";

            //Update
//            String sql = "update employee set salary = 7000 where empName ='Vishal'";


//            int result = statement.executeUpdate(sql);
//
//            if(result>0){
//                System.out.println("Record Inserted");
//            }


            //Select

            String query = "Insert into employee(empId,empName,city,salary) VALUES(?,?,?,?)";
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()){
//                int id = resultSet.getInt("empId");
//                String name = resultSet.getString("empName");
//                String city = resultSet.getString("city");
//                double salary = resultSet.getDouble("salary");
//                System.out.println(id+" "+name+" "+city+" "+salary);
//            }
            int id = 108;
            String en = "Aakash";
            String ct = "Mumbai";
            double sal = 2200.00;



//            PreparedStatement preparedStatement = con.prepareStatement(query);
//            preparedStatement.setInt(1,id);
//            preparedStatement.setString(2,en);
//            preparedStatement.setString(3,ct);
//            preparedStatement.setDouble(4,sal);

//            preparedStatement.executeUpdate();

            String query2 = "select * from employee";
            PreparedStatement preparedStatement =  con.prepareStatement(query2);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getDouble(4 ));
            }








        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
