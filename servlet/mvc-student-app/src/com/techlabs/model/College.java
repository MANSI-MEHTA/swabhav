package com.techlabs.model;

public class College {
	private int clg_ID;
	private String clg_Name;
	private String location;

	public College(int clg_ID, String clg_Name, String location) {
		super();
		this.clg_ID = clg_ID;
		this.clg_Name = clg_Name;
		this.location = location;
	}

	public int getClg_ID() {
		return clg_ID;
	}

	public void setClg_ID(int clg_ID) {
		this.clg_ID = clg_ID;
	}

	public String getClg_Name() {
		return clg_Name;
	}

	public void setClg_Name(String clg_Name) {
		this.clg_Name = clg_Name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
