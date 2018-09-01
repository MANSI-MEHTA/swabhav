package com.techlabs.ocp.refractor;

public class FixedDeposit {
	private String name;
	private double principal;
	private int year;
	private IRate rate;

	public FixedDeposit(String name, double principal, int year, IRate rate) {
		super();
		this.name = name;
		this.principal = principal;
		this.year = year;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double calculateInterest() {
		double roi = rate.findRate();
		return (principal * roi * year) / 100;
	}

}
