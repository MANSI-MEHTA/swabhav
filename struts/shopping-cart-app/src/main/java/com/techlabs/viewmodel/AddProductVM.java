package com.techlabs.viewmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techlabs.model.LineItem;
import com.techlabs.model.Product;

public class AddProductVM {

	private HashMap<String, String> hashofproducts = new HashMap<String, String>();
	private int quantity = 1;
	private String id;
	private double cost;
	private String name;
	List<Map<LineItem, Product>> listofproductsincart = new ArrayList<Map<LineItem, Product>>();

	public AddProductVM() {

	}

	public void setoptions(List<Product> list) {
		for (Product product : list) {
			hashofproducts.put(product.getId(), product.getName());
		}
	}

	public HashMap<String, String> getHashofproducts() {
		return hashofproducts;
	}

	public void setHashofproducts(HashMap<String, String> hashofproducts) {
		this.hashofproducts = hashofproducts;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Map<LineItem, Product>> getListofproductsincart() {
		return listofproductsincart;
	}

	public void setListofproductsincart(
			List<Map<LineItem, Product>> listofproductsincart) {
		this.listofproductsincart = listofproductsincart;
	}
	

}
