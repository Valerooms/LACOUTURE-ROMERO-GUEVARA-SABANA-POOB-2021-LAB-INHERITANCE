import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SabanaPayroll 
{
    double salary=0;
    private List<Department> departments=new ArrayList<>();
    public double calculateEmployeeSalary(UUID employeeId)
    {
        double salary = 0;
        for (Department d:this.departments)
        {
            salary=d.findEmployee(employeeId);
        }
        return salary;
    }
    public double calculateDeparmentSalaries(UUID departmentId)
    {
        double salary = 0;
        for (Department d:this.departments)
        {
            if (d.getId().equals(departmentId))
            {
                salary=d.calculateSalary();
            }
        }
        return salary;
    }
    public double calculateUniversitySalaries()
    {
        
        for (Department d : this.departments)
        {
            salary+=d.calculateSalary();
        }
        return salary;
    }
    public void printPayroll()
    {
     
    }
    public void setDepartments( List<Department> depa )
    {
        this.departments=depa;
    }
}
