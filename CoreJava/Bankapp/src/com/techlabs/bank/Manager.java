package com.techlabs.bank;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Manager implements Serializable {
	private static final long serialVersionUID = -6470090944414208496L;
	
	private String name;
	private long code;
	private Specialisation specalised;
	private Date dob;
	private Date doj;
	private double ctc;

	public Manager(String name, Specialisation specalised, Date DOB, Date DOJ, double ctc) {
		super();
		this.name = name;
		this.code = uniqueCodeGenerator();
		this.specalised = specalised;
		this.dob = DOB;
		this.doj = checkDateOfJoiningAndBirth(DOJ);
		this.ctc = checkCTC(ctc);
	}

	public double checkCTC(double ctc) {
		if (ctc < 0)
			throw new ManagerCantBeStoredException("The CTC is in negative");
		else
			return ctc;
	}

	public Date checkDateOfJoiningAndBirth(Date doj) {
		if (this.dob.after(doj))
			throw new ManagerCantBeStoredException("The DOJ is less than DOB");
		else
			return doj;
	}

	public long uniqueCodeGenerator() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDateTime todaysdate = LocalDateTime.now();
		String splitByDate[] = dtf.format(todaysdate).toString().split("/");
		String date = splitByDate[0] + splitByDate[1] + splitByDate[2];

		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss");
		LocalDateTime currenttime = LocalDateTime.now();
		String splitByTime[] = dtf1.format(currenttime).toString().split(":");
		String time = date + splitByTime[0] + splitByTime[1]+ splitByTime[2];

		return Long.parseLong(time);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public Specialisation getSpecalised() {
		return specalised;
	}

	public void setSpecalised(Specialisation specalised) {
		this.specalised = specalised;
	}

	public Date getDOB() {
		return dob;
	}

	public void setDOB(Date dOB) {
		dob = dOB;
	}

	public Date getDOJ() {
		return doj;
	}

	public void setDOJ(Date dOJ) {
		doj = dOJ;
	}

	public double getCTC() {
		return ctc;
	}

	public void setCTC(double ctc) {
		this.ctc = ctc;
	}

}
