import java.util.LinkedList;
import java.util.*;

class Employee
{
	private String empName;
	private String empDesignation;
	private String empEmail;
	
	public Employee(String empName, String empDesignation, String empEmail) {
		super();
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empEmail = empEmail;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDesignation=" + empDesignation + ", empEmail=" + empEmail + "]";
	}
}

public class Example2LinkedList {

	public static void main(String[] args) {
		Employee e1 = new Employee("usha","Student","ushapasapala2006.com");
		Employee e2 = new Employee("nun","Rebel","nun@gmail.com");
		
		LinkedList<Employee> l1 =  new LinkedList<Employee>();
		l1.add(e1);
		l1.add(e2);
		
		for(Object obj : l1)
		{
			System.out.println(obj);
		}
		
	}

}
