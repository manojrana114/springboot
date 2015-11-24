package com.impetus.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.impetus.springboot.entity.Employee;
import com.impetus.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
@Autowired EmployeeService employeeService;
	public void addEmployee(@ModelAttribute Employee employee){
		employeeService.save(employee);
	}
}
