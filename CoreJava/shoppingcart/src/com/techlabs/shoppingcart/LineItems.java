package com.techlabs.shoppingcart;

public class LineItems {
	private int lineItemID;
	private int quantity;
	private Product product;

	public LineItems(int lineItemID, int quantity,Product product) {
		super();
		this.lineItemID = lineItemID;
		this.quantity = quantity;
		this.product =product;
	}

	public int getLineItemID() {
		return lineItemID;
	}

	public void setLineItemID(int lineItemID) {
		this.lineItemID = lineItemID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double totalCostItem() {
		return getProduct().costAfterDiscount() * quantity;
	}

}