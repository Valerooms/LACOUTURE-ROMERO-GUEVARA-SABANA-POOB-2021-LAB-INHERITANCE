import java.util.UUID;

public class EmployeeByHours extends Employee {
    private double hours = 0;
    public static final double CONSHORA = 3;
    public EmployeeByHours(String name, String lastName, Department department,double hours) {
        super(name, lastName, department);
        this.hours=hours;
    }
    @Override
    public double calculateSalary()
    {
        return this.hours*CONSHORA;
    }
}
