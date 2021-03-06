package com.techlabs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {

	@Id
	@Column(name="acc_no")
	private long acc_no;
	
	@Column(name="balance")
	private double balance;
	
	@OneToOne(mappedBy="account",cascade = CascadeType.ALL)
	private User user;

	public Account(){
		
	}
	
	public Account(long acc_no, double balance) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
	}

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
