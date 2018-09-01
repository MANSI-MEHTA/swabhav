package com.techlabs.model;

public class Student {
	private String fname;
	private String lname;
	private int rollno;
	private double cgpi;
	private int clg_Id;
	private String gender;

	public Student(String fname, String lname, int clg_Id, int rollno,
			double cgpi, String gender) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.clg_Id = clg_Id;
		this.rollno = rollno;
		this.cgpi = cgpi;
		this.gender = gender;
	}

	public int getClg_Id() {
		return clg_Id;
	}

	public void setClg_Id(int clg_Id) {
		this.clg_Id = clg_Id;
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

}
