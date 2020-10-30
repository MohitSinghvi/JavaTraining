package JDBC;

public class DbDemo {
    public static void main(String[] args) {
        MyDBConnect db = new MyDBConnect();
//        System.out.println(db.getEmployee(101));
        Employee emp = new Employee(101,"Deepak","Mumbai",5000);

//        db.saveEmployee(emp);
//        db.deleteEmployee(105);
//        System.out.println(db.updateEmployee(emp));

//        System.out.println(db.getAllEmployees());
        System.out.println(db.getEmployee(102));
        db.closeDB();



    }


}
