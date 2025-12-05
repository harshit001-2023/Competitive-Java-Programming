/*
Assignment 02 :
---------------
Create a BLC class Employee class with properties

String firstName
String lastName
int employeeId
double salary
int noOfProject


Create a setEmployeeData() method with 5 parameters variables to initialize all the instance variables.

Write public void calculateSalary() method that will add extra amount in salary based on NoOfProject by using following criteria.

NoOfProject is more than 5 and less than 10 then add 5000 to the salary.
NoOfProject is more than 10 and less than 20 then add 10000 to the salary.
NoOfProject is more than 20 then add 15000 to the salary.

Take a method called public void displayDetails() to display the employee details with updated salary.

Take an ELC class Tester with main method to test your logic.
*/

package Basics.blc;

public class NewEmployee {
    String firstName;
    String lastName;
    int employeeId;
    double salary;
    int noOfProject;
    double newSal;

    public void setEmployeeData(String firstName, String lastName, int employeeId, double salary, int noOfProject){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.noOfProject = noOfProject;
    }

    public void calculateSalary(){
        if(noOfProject >= 5 && noOfProject < 10) newSal = salary + 5000;
        else if(noOfProject >= 10 && noOfProject < 20) newSal = salary + 10000;
        else if(noOfProject >= 20) newSal = salary + 15000;
    }

    @Override
    public String toString() {
        return "NewEmployee[" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", noOfProject=" + noOfProject +
                ", newSal=" + newSal +
                ']';
    }

    public void displayDetails(){
        IO.println(toString());
        //IO.println("Employee [id="+employeeId+", firstname="+firstName+", lastname="+lastName+", salary="+salary+", noOfProject = "+noOfProject+", newSal="+newSal+"]");
    }
}
