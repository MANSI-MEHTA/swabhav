package com.techlabs.viewmodel;

public class EditStudentVM {
	private String fname;
	private String lname;
	private int rollno;
	private double cgpi;
	private String clg_id;
	private String gender;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getCgpi() {
		return cgpi;
	}

	public void setCgpi(double cgpi) {
		this.cgpi = cgpi;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClg_id() {
		return clg_id;
	}

	public void setClg_id(String clg_id) {
		this.clg_id = clg_id;
	}

}
