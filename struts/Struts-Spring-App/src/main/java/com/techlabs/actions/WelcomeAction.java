package com.techlabs.actions;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action{

	@Override
	public String execute() throws Exception {
		System.out.println("Welcome to struts-spring app");
		return SUCCESS;
	}

}
