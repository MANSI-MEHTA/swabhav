package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateLineItemAction extends ActionSupport {
	private long id;
	
	private int quantity;

//	private List<JsonData> jsondata;
	
	
//	public List<JsonData> getJsondata() {
//		return jsondata;
//	}
//
//
//	public void setJsondata(List<JsonData> jsondata) {
//		this.jsondata = jsondata;
//	}


	@Override
	public String execute() {
		
		
		System.out.println("id:" + id + "\nquanity is " + quantity);
		return "success";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		System.out.println("setters of quantity");
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		System.out.println("setters of id");
		this.id = id;
	}
	
}
