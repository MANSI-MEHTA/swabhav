package com.techlabs.model;

public class Employee {
	private int id;
	private String name;
	private String address;
	private Car car;
	private Office office;
	private House house;
	
	public Employee() {

	}

	
	public Employee(int id, String name, String address, Car car,
			Office office, House house) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.car = car;
		this.office = office;
		this.house = house;
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


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}


	public Office getOffice() {
		return office;
	}


	public void setOffice(Office office) {
		this.office = office;
	}


	public House getHouse() {
		return house;
	}


	public void setHouse(House house) {
		this.house = house;
	}
	

}
