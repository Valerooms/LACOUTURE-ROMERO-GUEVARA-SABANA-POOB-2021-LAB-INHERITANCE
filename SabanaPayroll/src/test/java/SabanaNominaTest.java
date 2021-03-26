import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SabanaNominaTest 
{
    public static SabanaPayroll s1= new SabanaPayroll();
    public static Department d1= new Department("Ingenieria",UUID.randomUUID());
    public static Department d2= new Department("Medicina",UUID.randomUUID());
    public static Department d3= new Department("Psicologia",UUID.randomUUID());
    public static EmployeeByComission ec1=new EmployeeByComission("Juan","Valderrama",d1,1);;
    public static EmployeeByHours eh1 = new EmployeeByHours("Mia","Lacouture",d2,5);
    public static EmployeeBySalary es1= new EmployeeBySalary("Valentina","Romero",d3,1);

    @Test
    public void shouldCalculateEmployeeSalaryBySalary()
    {
       assertTrue(Double.compare(0.92,es1.calculateSalary()) ==0);
    }
    @Test
    public void shouldCalculateEmployeeSalaryByHours()
    {
        assertTrue(Double.compare(15,eh1.calculateSalary()) ==0);
    }
    @Test
    public void shouldCalculateEmployeeSalaryByComission()

    {
        System.out.println(ec1.calculateSalary());
        //assertEquals(2,2);
        assertEquals(0, Double.compare(2, ec1.calculateSalary()));
    }
    @Test
    public void shouldCalculateEmployeeSalary()
    {
        assertTrue(Double.compare(12,s1.calculateEmployeeSalary(ec1.getId())) ==0);
        assertTrue(Double.compare(12,s1.calculateEmployeeSalary(eh1.getId())) ==0);
        assertTrue(Double.compare(12,s1.calculateEmployeeSalary(es1.getId())) ==0);
    }

    @Test
    public void shouldCalculateDepartmentSalary()
    {
        assertTrue(Double.compare(12,s1.calculateDeparmentSalaries(d1.getId())) ==0);
        assertTrue(Double.compare(12,s1.calculateDeparmentSalaries(d2.getId())) ==0);
        assertTrue(Double.compare(12,s1.calculateDeparmentSalaries(d3.getId())) ==0);
        
    }
    @Test
    public void shouldCalculateUniversitytSalary()
    {
        assertTrue(Double.compare(12,s1.calculateUniversitySalaries()) ==0);
    }
    /*
    @Test
    public void shouldPrintPayroll()
    {
        assertEquals(String.format("%s %s, departamento %s, salario %s, pago por comisión",ec1.name,ec1.lastName,ec1.department,ec1.calculateSalary())+
                String.format("%s %s, departamento %s, salario %s, pago por horas",ec1.name,ec1.lastName,ec1.department,ec1.calculateSalary())+
                String.format("%s %s, departamento %s, salario %s, pago por comisión",ec1.name,ec1.lastName,ec1.department,ec1.calculateSalary()),s1.printPayroll());
        
    }

     */
    
}
