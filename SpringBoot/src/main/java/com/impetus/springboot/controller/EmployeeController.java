package com.impetus.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.impetus.springboot.entity.Employee;
import com.impetus.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
@Autowired 
@Qualifier("employeeService")
EmployeeService employeeService;

@RequestMapping(value="/")
public String homePage(){
	return "index";
}
@RequestMapping(value="/login")
public String loginPage(){
	return "login";
}
@RequestMapping(value="/saveEmploye")
public String addEmployee(){
	Employee employee=new Employee("Manoj","up",2000);
	employeeService.save(employee);
	return "test";
	}
}
