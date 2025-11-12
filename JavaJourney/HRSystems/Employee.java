package JavaJourney.HRSystems;

public class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void raiseSalary(double percent){
        salary += salary * percent / 100;
    }

    void  displayInfo(){
        System.out.println("ID: "+id+" | Name: " +name+"| Salayr: " +salary);
    }

    public static class EmployeeDemo{
        public static void main(String[] args){
            Employee emp = new Employee("Harry", 101, 100000.00);
            emp.raiseSalary(10);
            emp.displayInfo();

            Employee mgr = new Manager("Raghav", 102, 15000);
            mgr.raiseSalary(20);
            emp.displayInfo();

            Intern in = new Intern("Saket", 112, 20000);
            in.raiseSalary(5);
            in.displayInfo();
            in.durationInMonths();
        }
    }
}
