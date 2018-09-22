package com.techlabs.model;

public class Car {
	private String model;
	private String Companyname;
	
	public Car(String model, String companyname) {
		super();
		this.model = model;
		Companyname = companyname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyname() {
		return Companyname;
	}
	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}
		
}
