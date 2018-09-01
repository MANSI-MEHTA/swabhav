package com.techlabs.ocp.violation;

public class FixedDeposit {
	private String name;
	private double principal;
	private int year;
	private FestivalType festival;

	public FixedDeposit(String name, double principal, int year, FestivalType festival) {
		super();
		this.name = name;
		this.principal = principal;
		this.year = year;
		this.festival = festival;
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

	public FestivalType getFestival() {
		return festival;
	}

	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}

	public double findRate() {
		switch (this.festival) {
		case HOLY:
			return 8.0;
		case DIWALI:
			return 9.0;
		case GANPATI:
			return 6.0;
		default:
			return 7.0;
		}
	}

	public double calculateInterest() {
		return (principal * findRate() * year) / 100;
	}

}
