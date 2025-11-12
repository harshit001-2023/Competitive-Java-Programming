package JavaJourney.HRSystems;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo() {
        double totalSalary = getSalary() + bonus;
        System.out.println("ID: " + getId() + " | Name: " + getName() +
                " | Base Salary: " + getSalary() +
                " | Bonus: " + bonus +
                " | Total Salary: " + totalSalary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}