package JavaJourney.HRSystems;

import java.util.ArrayList;

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create ArrayList of Employee objects
        ArrayList<Employee> employees = new ArrayList<>();

        // Add multiple objects (mix of all types)
        employees.add(new Employee("Harry", 101, 100000.00));
        employees.add(new Manager("Raghav", 102, 150000.00, 25000.00));
        employees.add(new Intern("Saket", 103, 30000.00, 6));
        employees.add(new Manager("Priya", 104, 180000.00, 30000.00));
        employees.add(new Intern("Ankit", 105, 25000.00, 3));
        employees.add(new Employee("Neha", 106, 80000.00));

        // Apply salary raises
        employees.get(0).raiseSalary(10); // Harry gets 10% raise
        employees.get(1).raiseSalary(20); // Raghav gets 20% raise
        employees.get(2).raiseSalary(5);  // Saket gets 5% raise

        System.out.println("=== Employee Information ===");

        // Loop through and call displayInfo() polymorphically
        for (Employee emp : employees) {
            emp.displayInfo(); // This will call the appropriate displayInfo() method
        }

        System.out.println("\n=== Detailed Breakdown ===");

        // Additional demonstration of polymorphism
        for (Employee emp : employees) {
            System.out.print(emp.getClass().getSimpleName() + ": ");
            emp.displayInfo();
        }
    }
}