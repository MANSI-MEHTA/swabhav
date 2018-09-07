package com.techlabs.viewmodel;

public class ShowCollegeVM {
	private String clg_id;
	private String clg_name;
	private String location;

	public ShowCollegeVM() {

	}

	public ShowCollegeVM(String clg_id, String clg_name, String location) {
		super();
		this.clg_id = clg_id;
		this.clg_name = clg_name;
		this.location = location;
	}

	public String getClg_id() {
		return clg_id;
	}

	public void setClg_id(String clg_id) {
		this.clg_id = clg_id;
	}

	public String getClg_name() {
		return clg_name;
	}

	public void setClg_name(String clg_name) {
		this.clg_name = clg_name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
