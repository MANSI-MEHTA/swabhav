package com.techlabs.model;

public class Student {
	private int rollno;
	private String fname;
	private String lname;
	private String clg_id;
	private double cgpi;
	private String gender;

	public Student() {
	}

	public Student(int rollno,String fname, String lname,String clg_id, double cgpi,
			String gender) {
		super();
		this.rollno = rollno;
		this.fname = fname;
		this.lname = lname;
		this.clg_id=clg_id;
		this.cgpi = cgpi;
		this.gender = gender;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

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
