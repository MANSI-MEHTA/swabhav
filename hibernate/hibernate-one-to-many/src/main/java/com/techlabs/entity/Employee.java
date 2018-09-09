package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int emp_id;

	@Column(name = "emp_name")
	private String emp_name;

	@Column(name = "salary")
	private double salary;

	@ManyToOne
	@JoinColumn(name = "dept_id", nullable = false)
	private Department dept;

	
	public Employee(int emp_id, String emp_name, double salary, Department dept) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	

}
