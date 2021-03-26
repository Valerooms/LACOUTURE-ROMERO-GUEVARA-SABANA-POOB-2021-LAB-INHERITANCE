import java.util.UUID;

public class Employee
{
    public UUID id;
    public String name;
    public String lastName;
    public Department department;
    
    public Employee(String name, String lastName, UUID id, Department department)
    {
        this.name=name;
        this.lastName=lastName;
        this.id=id;
        this.department=department;
    }
    @Override
    public String toString()
    {
        return "a";
    }
}
