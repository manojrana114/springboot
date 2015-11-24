package com.impetus.springboot.seviceimpl;


import org.springframework.beans.factory.annotation.Autowired;

import com.impetus.springboot.entity.Employee;
import com.impetus.springboot.repository.EmployeeDao;
import com.impetus.springboot.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
@Autowired
	EmployeeDao employeeDao;
	@Override
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

}
