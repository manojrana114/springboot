package com.impetus.springboot.repository.ws;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.impetus.springboot.entity.Employee;
@RepositoryRestResource(collectionResourceRel = "test", path = "test")
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long>{
	List<Employee> findByName(@Param("name") String name, Pageable pageable);
}
