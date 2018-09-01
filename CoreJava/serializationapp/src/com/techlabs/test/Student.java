package com.techlabs.test;

import java.io.Serializable;

public class Student implements Serializable {
	private String firstname;
	private int roll;
	private String surname;

	public Student(String firstname, int roll, String surname) {
		this.firstname = firstname;
		this.roll = roll;
		this.surname = surname;
	}

	public String getFirstName() {
		return firstname;
	}

	public int getRoll() {
		return roll;
	}

	public String getSurName() {
		return surname;
	}
}
