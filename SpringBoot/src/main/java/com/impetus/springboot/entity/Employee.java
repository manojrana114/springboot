package com.impetus.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String state;

	@Column(nullable = false)
	private float salary;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getState() {
		return state;
	}

	public float getSalary() {
		return salary;
	}

	protected Employee() {
	}

	public Employee(String name, String state,float salary) {
		super();
		this.name = name;
		this.state = state;
		this.salary=salary;
	}
	
	
}
