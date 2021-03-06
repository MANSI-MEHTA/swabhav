package com.techlabs.viewmodel;

import java.util.HashMap;
import java.util.List;

import com.techlabs.model.College;

public class AddStudentVM {
	private int rollno;

	private String fname;
	private String lname;
	private String clg_id;
	private double cgpi;
	private String gender;
	private HashMap<String, String> hashOfColleges = new HashMap<String, String>();

	public void getCollegeForOption(List<College> listOfCollege) {
		for (College college : listOfCollege) {
			hashOfColleges.put(college.getClg_id(), college.getClg_name());
		}
	}

	public HashMap<String, String> getHashOfColleges() {
		return hashOfColleges;
	}

	public void setHashOfColleges(HashMap<String, String> hashOfColleges) {
		this.hashOfColleges = hashOfColleges;
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

	public String getClg_id() {
		return clg_id;
	}

	public void setClg_id(String clg_id) {
		this.clg_id = clg_id;
	}

	
}
