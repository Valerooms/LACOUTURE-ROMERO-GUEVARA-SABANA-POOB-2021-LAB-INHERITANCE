import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;
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
    public static EmployeeBySalary es1= new EmployeeBySalary("Vale","Romero",d3,1);
    public  List<Department> departments = new ArrayList<>();
    public  List<Employee> employees = new ArrayList<>();




    @Test
    @DisplayName("GIVEN the ID of an employee by salary WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryBySalary()
    {
       assertTrue(Double.compare(0.92,es1.calculateSalary()) ==0);
    }
    @Test
    @DisplayName("GIVEN the ID of an employee by hours WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryByHours()
    {
        assertTrue(Double.compare(15,eh1.calculateSalary()) ==0);
    }
    @Test
    @DisplayName("GIVEN the ID of an employee by comission WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalaryByComission()

    {
        assertEquals(0, Double.compare(2, ec1.calculateSalary()));
    }
    @Test
    @DisplayName("GIVEN the ID of an employee WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateEmployeeSalary()
    {
        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);

        List<Employee> employees = new ArrayList<>();
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        assertTrue(Double.compare(2,s1.calculateEmployeeSalary(ec1.getId())) ==0);
        assertTrue(Double.compare(15,s1.calculateEmployeeSalary(eh1.getId())) ==0);
        assertTrue(Double.compare(0.92,s1.calculateEmployeeSalary(es1.getId())) ==0);
    }

    @Test
    @DisplayName("GIVEN the ID of a department WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateDepartmentSalary()
    {
        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);

        assertTrue(Double.compare(2,s1.calculateDeparmentSalaries(d1.getId())) ==0);
        assertTrue(Double.compare(15,s1.calculateDeparmentSalaries(d2.getId())) ==0);
        assertTrue(Double.compare(0.92,s1.calculateDeparmentSalaries(d3.getId())) ==0);



        
    }
    @Test
    @DisplayName("GIVEN a university WHEN trying to calculate his salary THEN should calculate it")
    public void shouldCalculateUniversitytSalary()
    {

        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);
        assertTrue(Double.compare(17.92,s1.calculateUniversitySalaries()) ==0);

    }
    @Test
    @DisplayName("GIVEN the payrolls of each employee WHEN trying to print it THEN print it")
    public void shouldPrintPayroll() {
        departments.add(d1);
        departments.add(d2);
        departments.add(d3);
        employees.add(ec1);
        employees.add(eh1);
        employees.add(es1);
        s1.setDepartments(departments);
        d1.setEmployees(employees);
        d2.setEmployees(employees);
        d3.setEmployees(employees);
        s1.printPayroll();

    }


        



    
}
