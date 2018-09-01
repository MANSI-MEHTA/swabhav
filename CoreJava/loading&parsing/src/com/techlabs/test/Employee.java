package com.techlabs.test;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String designation;
	private String manager_id;
	private String doj;
	private double salary;
	private int department_no;

	public Employee(int id, String name, String designation, String manager_id, String doj, double salary,
			int department_no) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.manager_id = manager_id;
		this.doj = doj;
		this.salary = salary;
		this.department_no = department_no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getManager_id() {
		return manager_id;
	}

	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDepartment_no() {
		return department_no;
	}

	public void setDepartment_no(int department_no) {
		this.department_no = department_no;
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.salary == employee.getSalary()) {
			return 0;
		} else if (this.salary < employee.getSalary()) {
			return -1;
		}
		return 1;
	}

}
