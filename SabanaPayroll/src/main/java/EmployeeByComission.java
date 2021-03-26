import java.util.UUID;

public class EmployeeByComission extends Employee {
    public static final double COMISSION = 2;
    private int productos;
    public EmployeeByComission(String name, String lastName, Department department, int productos) {
        super(name, lastName, department);
        this.productos=productos;
    }
    @Override
    public double calculateSalary()
    {
        return this.productos*COMISSION;
    }
}
