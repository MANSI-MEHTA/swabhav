package com.techlabs.actions;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action {
	private Date date;
	private String methodtype = "Get";
	private boolean postback = false;

	public boolean isPostback() {
		return postback;
	}

	public void setPostback(boolean postback) {
		System.out.println(postback);
		

		setMethodtype("post");
		this.postback = postback;
	}

	public String getMethodtype() {
		return methodtype;
	}

	public void setMethodtype(String methodtype) {

		this.methodtype = methodtype;
	}

	public String getDate() {
		System.out.print("working");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/YYYY");
		date = new Date();
		return formatter.format(date);
	}

	@Override
	public String execute() throws Exception {

		return "success";
	}

}
