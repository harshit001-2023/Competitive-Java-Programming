package JavaJourney.HRSystems;

public class Intern extends Employee {
    private int durationInMonths;

    public Intern(String name, int id, double salary, int durationInMonths) {
        super(name, id, salary);
        this.durationInMonths = durationInMonths;
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + " | Name: " + getName() +
                " | Salary: " + getSalary() +
                " | Duration: " + durationInMonths + " months");
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }
}