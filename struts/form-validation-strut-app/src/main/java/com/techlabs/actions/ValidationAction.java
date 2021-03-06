package com.techlabs.actions;

public class ValidationAction {
	private String fname;
	private String lname;
	private String password;
	private int rollno;

	public ValidationAction() {

	}

	public ValidationAction(String fname, String lname, String password,
			int rollno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.rollno = rollno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		return "success";
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

}
