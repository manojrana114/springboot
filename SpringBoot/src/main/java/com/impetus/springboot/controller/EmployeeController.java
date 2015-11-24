package com.impetus.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.impetus.springboot.repository.EmployeeDao;

@Controller
public class EmployeeController {
@Autowired EmployeeDao employeeDao;
	public void addEmployee(){}
}
