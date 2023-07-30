package basic_lvl;
import java.util.List;
import java.util.ArrayList; 
class EmpolyeeTable {
	private int EmpID;
	private String EmpName;
	private String EmpPosition;
	private double EmpSalary;
	public EmpolyeeTable(int a, String b, String c, double d) {
		this.EmpID=a;
		this.EmpName=b;
		this.EmpPosition=c;
		this.EmpSalary=d;
	}
	public int getEmpID() {
		return EmpID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public String getEmpPosition() {
		return EmpPosition;
	}
	public double getEmpSalary() {
		return EmpSalary;
	}
}
public class workout {
	public static void main(String[] args) {
		List<Employee> employeeList=new ArrayList<>();
		employeeList.add(new Employee(102, "keerthi", "manager", 50000));
		employeeList.add(new Employee(103, "ram", "tester", 50000));
		employeeList.add(new Employee(104, "amar", "designer", 50000));
		employeeList.add(new Employee(105, "dhana", "developer", 50000));
	
	for(Employee emp : employeeList) {
		System.out.printf("%10d,%15s,%15s,%.2f",emp.getEmpID(),emp.getEmpName(),emp.getEmpPosition(), emp.getEmpSalary());
	}
	}
}
