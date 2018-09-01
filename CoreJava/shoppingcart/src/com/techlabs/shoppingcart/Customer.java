package com.techlabs.shoppingcart;

import java.util.List;

public class Customer {
	private String name;
	private String address;
	private Order order;

	public Customer(String name, String address) throws Exception {
		super();
		this.name = name;
		this.address = address;
		this.order = new Order();
	}

	public void addToCart(LineItems lineitem) {
		List<LineItems> list = this.order.getOrderitems();
		list.add(lineitem);
		this.order.setOrderitems(list);

	}

	public void removeFromcart(int lineItemID) {
		List<LineItems> list = order.getOrderitems();
		for (LineItems lineitem : list) {
			if (lineitem.getLineItemID() == lineItemID) {
				list.remove(lineitem);

				break;
			}
		}
		order.setOrderitems(list);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
