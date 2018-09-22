package com.techlabs.model;

public class LineItem {
	private long id;
	private int quantity;
	private double total_price;
	private String product_id;
	
	public LineItem(){
		
	}
	public LineItem(long id, int quantity, double total_price,
			String product_id) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.total_price = total_price;
		this.product_id = product_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	
}
