package firstjavaapplication.springboot.employeelist;

public class Employee {
	
	public Employee() {
		
	}
	
	public Employee(String empName, String empId) {
		this.EmpName = empName;
		this.EmpId = empId;
	}
	
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	private String EmpName;
	private String EmpId;
	private String firstName;
	
}
