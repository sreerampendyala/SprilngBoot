package firstjavaapplication.springboot.employeelist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
	
	
	public Employee getEmployeeById(String Id) {
		return employees.stream().filter(emp -> emp.getEmpId().equals(Id)).findFirst().get();
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void addRecord(Employee emp) {
		employees.add(emp);
		
	}


	public String updateRecord(Employee emp, String id) {	
		for(int index = 0; index < employees.size(); index++) {
			
			Employee empObject = employees.get(index);
			if(empObject.getEmpId().equals(id)) {
				employees.set(index, emp);
				return "Updated";
			}
		}		
		return "Record not found";
	}
	
	public void deleteRecord(String id) {
		employees.removeIf(emp -> emp.getEmpId().equals(id));
		
	}
	
	
	private List<Employee> employees = new ArrayList<>();

}
