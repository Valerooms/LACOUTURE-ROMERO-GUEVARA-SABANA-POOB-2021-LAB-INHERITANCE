import java.util.UUID;

public class Employee
{
    public UUID id;
    public String name;
    public String lastName;
    public Department department;
    
    public Employee(String name, String lastName, Department department)
    {
        this.name=name;
        this.lastName=lastName;
        this.id=UUID.randomUUID();
        this.department=department;
    }
    @Override
    public String toString()
    {
        return "a";
    }
    public UUID getId()
    {
        return this.id;
    }
    public double calculateSalary()
    {
        return 1.23;
    }
}
