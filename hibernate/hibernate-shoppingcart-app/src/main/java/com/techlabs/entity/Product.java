package com.techlabs.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {

	@Id
	@Column(name = "product_id",nullable=false)
	private int product_id;

	@Column(name = "product_name",nullable=false)
	private String product_name;

	@Column(name = "cost",nullable=false)
	private double cost;

	@Column(name = "discount",nullable=false)
	private double discount;

	@OneToMany(mappedBy = "product",cascade=CascadeType.ALL)
	private Set<LineItem> setlineitem=new HashSet<LineItem>();

	public Product(){
		
	}
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
	public Set<LineItem> getSetlineitem() {
		return setlineitem;
	}
	public void setSetlineitem(Set<LineItem> setlineitem) {
		this.setlineitem = setlineitem;
	}
	
	
	
	
}
