package com.techlabs.shoppingcart;

public class Product {
	private String product_name;
	private int product_id;
	private double cost;
	private double discount;
	private double costAfterDiscount;

	public Product(String product_name, int product_id, double cost, double discount) {
		super();
		this.product_name = product_name;
		this.product_id = product_id;
		this.cost = cost;
		this.discount = discount;
	}

	public Product() {
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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

	public double getCostAfterDiscount() {
		return costAfterDiscount;
	}

	public void setCostAfterDiscount(double costAfterDiscount) {
		this.costAfterDiscount = costAfterDiscount;
	}

	public double costAfterDiscount() {
		this.costAfterDiscount = cost - (cost * (discount / 100));
		return costAfterDiscount;
	}

}
