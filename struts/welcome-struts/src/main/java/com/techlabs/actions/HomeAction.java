package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {
	private String studentName = "varshil";

	@Override
	public String execute() throws Exception {
		System.out.println("working");
		return "success";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
