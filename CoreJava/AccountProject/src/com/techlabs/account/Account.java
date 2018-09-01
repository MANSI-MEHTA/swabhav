package com.techlabs.account;

abstract public class Account {
	private static double acc_no = 1022100;
	private String name;
	private double balance;

	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
		acc_no++;
	}

	public double getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(double acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	abstract public Boolean withdraw(double amount);

}
