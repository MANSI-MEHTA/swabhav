package com.techlabs.srp.violation;

public class Employee {
	private String name;
	private int id;
	private String designation;
	private double salary;
	public Employee(String name, int id, String designation, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.designation = designation;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void isPromoted() {
		System.out.println("this is a promotion method  ");
	}
	public void taxCalculation() {
		System.out.println("this is taxclaculation method");
	}

}
