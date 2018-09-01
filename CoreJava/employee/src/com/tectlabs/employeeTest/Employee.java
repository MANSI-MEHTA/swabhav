package com.tectlabs.employeeTest;

public class Employee {
	private String emp_name;
	private int id;
	private double experience;

	public Employee(String emp_name, int id, double experience) {
		super();
		this.emp_name = emp_name;
		this.id = id;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", id=" + id + ", experience=" + experience + "]";
	}

	public int salary() {
		return (int) experience * 10000;

	}

	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getExperience() {
		return experience;
	}

	public void setExperience(double experience) {
		this.experience = experience;
	}

}
