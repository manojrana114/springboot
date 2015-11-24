package com.impetus.springboot.web.ws;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.impetus.springboot.dto.Employee;

@RestController
@RequestMapping(value="/employee")
public class EmployeeWS {
	@RequestMapping(value="/{id}")
	public Employee getEmployeeName(@PathVariable String id){
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName("manoj");
		employee.setSalary(2000);
		return employee;	
	} 
}
