import java.util.UUID;

public class Department 
{
    public UUID id;
    public String name;
    //private Employee employees;
    public Department (String name, UUID id)
    {
        this.id = id;
        this.name = name;
    }
    public double calculateSalary()
    {
        return 1.23;
    }
    public UUID getId()
    {
        return this.id;
    }
}
