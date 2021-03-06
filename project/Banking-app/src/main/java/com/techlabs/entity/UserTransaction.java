package com.techlabs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "UserTransaction")
public class UserTransaction {

	@Id
	@Column(name = "transaction_id")
	private long transaction_id;

	@Column(name="narration")
	private String narration;
	
	@Column(name = "amount")
	private double amount;

	@Column(name = "transaction_type")
	private String transaction_type;

	@Column(name = "transaction_date")
	private Date transaction_date;

	@ManyToOne
	@JoinColumn(name = "acc_no")
	private User user;

	public UserTransaction() {

	}

	public UserTransaction(long transaction_id, String narration,
			double amount, String transaction_type, Date transaction_date,
			User user) {
		super();
		this.transaction_id = transaction_id;
		this.narration = narration;
		this.amount = amount;
		this.transaction_type = transaction_type;
		this.transaction_date = transaction_date;
		this.user = user;
	}

	public long getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}

	public Date getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}
	

}
