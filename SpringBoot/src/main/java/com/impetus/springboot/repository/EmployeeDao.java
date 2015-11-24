package com.impetus.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.impetus.springboot.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long>{

}
