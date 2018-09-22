package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LineItem")
public class LineItem {

	@Id
	@Column(name = "lineitem_id", nullable = false)
	private long lineitem_id;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	private Order order;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public LineItem() {

	}

	public LineItem(long lineitem_id, int quantity, Order order, Product product) {
		super();
		this.lineitem_id = lineitem_id;
		this.quantity = quantity;
		this.order = order;
		this.product = product;
	}

	public long getLineitem_id() {
		return lineitem_id;
	}

	public void setLineitem_id(long lineitem_id) {
		this.lineitem_id = lineitem_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
