import java.util.UUID;

public class Department 
{
    public UUID id;
    public String name;
    public Department(UUID id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public double calculateSalary()
    {
        return 1.23;
    }
}
