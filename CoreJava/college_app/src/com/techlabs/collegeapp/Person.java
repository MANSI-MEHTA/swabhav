package com.techlabs.collegeapp;

public class Person extends College {
	private int id;
	private String name;
	private String address;

	public Person(int id, String name, String address) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
