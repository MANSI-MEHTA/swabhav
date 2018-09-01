package com.techlabs.collegeapp;

public class Professor extends Person {
	private double expirence;
	private double salary;

	public Professor(int id, String name, String address, double expirence) {
		super(id, name, address);
		this.expirence = expirence;

	}

	public double getExpirence() {
		return expirence;
	}

	public void setExpirence(double expirence) {
		this.expirence = expirence;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
