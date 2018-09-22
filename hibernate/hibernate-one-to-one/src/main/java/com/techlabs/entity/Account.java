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
	
	@Column(name="acc_type")
	private String acc_type;
	
	@Column(name="balance")
	private double balance;
	
	@OneToOne(mappedBy="account",cascade=CascadeType.ALL)
	private Customer customer;

	public Account(){
		
	}
	public Account(long acc_no, String acc_type, double balance) {
		super();
		this.acc_no = acc_no;
		this.acc_type = acc_type;
		this.balance = balance;
		
	}

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getAcc_type() {
		return acc_type;
	}

	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	


}
