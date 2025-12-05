package Basics.elc;

import Basics.blc.NewEmployee;

public class TestNewEmployee {
    static void main() {
        String firstName = IO.readln("Enter first name : ");
        String lastName = IO.readln("Enter last name : ");
        int employeeId = Integer.parseInt(IO.readln("Enter employee id : "));
        double salary = Double.parseDouble(IO.readln("Enter salary : "));
        int noOfProject = Integer.parseInt(IO.readln("Enter No of Projects : "));

        NewEmployee newEmployee = new NewEmployee();
        newEmployee.setEmployeeData(firstName, lastName, employeeId, salary, noOfProject);
        newEmployee.calculateSalary();
        newEmployee.displayDetails();
    }
}
