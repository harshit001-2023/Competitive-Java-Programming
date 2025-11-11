package JavaJourney;

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
        }
    }
}
