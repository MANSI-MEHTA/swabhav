package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Credential")
public class Credential {

	@Id
	@Column(name = "cust_id")
	private long cust_id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name="state")
	private String state;
	
	@MapsId
	@OneToOne
	@JoinColumn(name = "tenant_id")
	private Tenant tenant;

	public Credential() {

	}

	public Credential(String username, String password,String state,
			Tenant tenant) {
		super();
		this.username = username;
		this.password = password;
		this.state=state;
		this.tenant = tenant;
	}

	public long getCust_id() {
		return cust_id;
	}

	public void setCust_id(long cust_id) {
		this.cust_id = cust_id;
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

	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	
	

}
