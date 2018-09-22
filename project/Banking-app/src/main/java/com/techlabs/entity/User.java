package com.techlabs.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "user_id")
	private long user_id;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "email")
	private String email;

	@Column(name = "contact")
	private int contact;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "address")
	private String address;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name="state")
	private String state; 
	
	@OneToOne
	@JoinColumn(name = "acc_no")
	@MapsId
	private Account account;

	@OneToMany(mappedBy="user",cascade = CascadeType.ALL)
	private Set<UserTransaction> usertransactions=new HashSet<UserTransaction>();
	
	public User() {

	}

	
	
	public User(String name, String lname, String email, int contact, Date dob,
			String address, String username, String password, String state,Account account) {
		super();
		this.fname = name;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.dob = dob;
		this.address = address;
		this.username = username;
		this.password = password;
		this.state = state;
		this.account=account;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public long getUser_id() {
		return user_id;
	}


	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return fname;
	}


	public void setName(String name) {
		this.fname = name;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public Set<UserTransaction> getUsertransactions() {
		return usertransactions;
	}


	public void setUsertransactions(Set<UserTransaction> usertransactions) {
		this.usertransactions = usertransactions;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}
	
	

}
