package firstjavaapplication.springboot.employeelist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeListController {
	
	@RequestMapping("/employees")
	public List<Employee> getEmployees() {
		return emp_service.getEmployees();
	}
	
	@RequestMapping("/employees/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") String id) {
		return emp_service.getEmployeeById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public String addEmployee(@RequestBody  Employee emp) {
		emp_service.addRecord(emp);
		return "Success";
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
	public String updateEmployee(@RequestBody  Employee emp, @PathVariable String id) {
		return emp_service.updateRecord(emp, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
	public String deleteEmployee(@PathVariable String id) {
		emp_service.deleteRecord(id);
		return "Success";
	}
	
	@Autowired
	private ServiceClass emp_service;
}
