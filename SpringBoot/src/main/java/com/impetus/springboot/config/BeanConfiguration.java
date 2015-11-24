package com.impetus.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.impetus.springboot.seviceimpl.EmployeeServiceImpl;

@Configuration
public class BeanConfiguration {
@Bean(name="employeeService")
public EmployeeServiceImpl getEmployeeServiceImpl(){
return new EmployeeServiceImpl();
}
}

