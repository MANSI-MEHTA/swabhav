package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {

	@Id
	@Column(name = "cart_id")
	private long cart_id;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "product_id")
	private int product_id;

	@ManyToOne
	@JoinColumn(name = "cust_id")
	private Customers customer;

	public Cart() {

	}

	public Cart(long cart_id, int quantity, int product_id,Customers customer ) {
		super();
		this.cart_id = cart_id;
		this.quantity = quantity;
		this.product_id = product_id;
		this.customer=customer;
	}

	public long getCart_id() {
		return cart_id;
	}

	public void setCart_id(long cart_id) {
		this.cart_id = cart_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

}
