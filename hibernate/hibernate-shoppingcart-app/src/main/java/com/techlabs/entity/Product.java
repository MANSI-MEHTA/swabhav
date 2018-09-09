package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Product {

	@Id
	@Column(name="product_id")
	private int product_id;
	
	@Column(name="product_name")
	private String product_name;
	
	@Column(name="cost")
	private double cost;
	
	@Column(name="discount")
	private double discount;
	
	@OneToOne
	@JoinColumn(name="lineitem_id")
	private LineItem lineitem;

	
	public Product(int product_id, String product_name, double cost,
			double discount) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.cost = cost;
		this.discount = discount;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public LineItem getLineitem() {
		return lineitem;
	}

	public void setLineitem(LineItem lineitem) {
		this.lineitem = lineitem;
	}
	
	
}

