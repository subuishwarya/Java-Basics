package basic_lvl;
import java.util.ArrayList;
import java.util.List;

class Employee {
    private int empId;
    private String empName;
    private String empPosition;
    private double empSalary;

    public Employee(int a,String b,String c,double d) {
        this.empId = a;
        this.empName = b;
        this.empPosition = c;
        this.empSalary = d;
    }

    // Getters and setters (optional)
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}

public class employeeTable {
    public static void main(String[] args) {
        // Creating a list to store employee data
        List<Employee> employeeList = new ArrayList<>();

        // Adding employee records to the list
        employeeList.add(new Employee(101, "John Doe", "Manager", 50000.0));
        employeeList.add(new Employee(102, "Jane Smith", "Developer", 40000.0));
        employeeList.add(new Employee(103, "Bob Johnson", "Tester", 35000.0));
        employeeList.add(new Employee(104, "Alice Williams", "Designer", 45000.0));

        // Printing the employee data in tabular format
        System.out.println("Employee ID\tEmployee Name\tPosition\tSalary");
        System.out.println("----------------------------------------------");
        for (Employee emp : employeeList) {
            System.out.printf("%-12d\t%-14s\t%-10s\t%.2f%n", emp.getEmpId(), emp.getEmpName(),
                    emp.getEmpPosition(), emp.getEmpSalary());
        }
    }
}
