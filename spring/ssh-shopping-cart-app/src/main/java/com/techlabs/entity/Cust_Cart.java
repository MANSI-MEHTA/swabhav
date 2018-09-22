package com.techlabs.entity;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="Cust_Cart")
public class Cust_Cart implements Serializable{

	@Id
	@Column(name="cust_id")
	private UUID cust_id;
	
	@Id
	@Column(name="cart_id")
	private long cart_id;

	public Cust_Cart(){
		
	}
	public UUID getCust_id() {
		return cust_id;
	}

	public void setCust_id(UUID cust_id) {
		this.cust_id = cust_id;
	}

	public long getCart_id() {
		return cart_id;
	}

	public void setCart_id(long cart_id) {
		this.cart_id = cart_id;
	}
	
}