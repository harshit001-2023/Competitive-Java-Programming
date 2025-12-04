package Basics.blc;

public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;


    public void setEmployeeData(int id, String name, double price){
        employeeId = id;
        employeeName = name;
        employeeSalary = price;
    }

    public void getEmployeeInfo(){
        IO.println("Employee ID : "+employeeId);
        IO.println("Employee name : "+employeeName);
        IO.println("Employee Price : "+ employeeSalary);
    }


}
