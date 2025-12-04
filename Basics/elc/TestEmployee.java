package Basics.elc;

import Basics.blc.Employee;
import Basics.blc.Product;

public class TestEmployee {
    static void main() {
        int employeeId = Integer.parseInt(IO.readln("Enter Employee ID : "));
        String employeeName = IO.readln("Enter Name of the Employee : ");
        double employeePrice = Double.parseDouble(IO.readln("Enter Employee Salary : "));

        Employee employee = new Employee();
        employee.setEmployeeData(employeeId, employeeName, employeePrice);
        employee.getEmployeeInfo();
    }
}
