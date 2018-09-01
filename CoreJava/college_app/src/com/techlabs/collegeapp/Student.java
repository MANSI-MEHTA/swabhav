package com.techlabs.collegeapp;

public class Student extends Person {
	private Branch branch;

	public Student(int id, String name, String address, Branch branch) {
		super(id, name, address);
		this.branch = branch;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
