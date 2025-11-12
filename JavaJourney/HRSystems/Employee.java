package JavaJourney.HRSystems;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void raiseSalary(double percent){
        salary += salary * percent / 100;
    }

    public void displayInfo(){
        System.out.println("ID: " + id + " | Name: " + name + " | Salary: " + salary);
    }

    // Getters for subclasses to access protected data
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}