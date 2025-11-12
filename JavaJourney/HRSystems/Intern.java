package JavaJourney.HRSystems;

public class Intern extends Employee{

    public Intern(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    void raiseSalary(double percent) {
        super.raiseSalary(percent);
    }

    void durationInMonths(){
        System.out.println("Duration of 6 Months");
    }
}
