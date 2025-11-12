package JavaJourney.HRSystems;

public class Manager extends Employee{
    public Manager(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    void raiseSalary(double percent) {
        super.raiseSalary(percent);
    }
}
