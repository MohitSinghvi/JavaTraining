package JDBC;

public class dbDemo {
    public static void main(String[] args) {
        MyDBConnect db = new MyDBConnect();
//        System.out.println(db.getEmployee(101));
        Employee emp = new Employee(105,"Deepak","Mumbai",5000);

        db.saveEmployee(emp);
        System.out.println(db.getAllEmployees());

    }


}
