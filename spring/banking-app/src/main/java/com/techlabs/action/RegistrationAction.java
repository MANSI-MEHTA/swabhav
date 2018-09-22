package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.viewmodel.RegistrationVM;

public class RegistrationAction extends ActionSupport implements ModelDriven<RegistrationVM>{
	private RegistrationVM userBean = new RegistrationVM();

	@Override
	public String execute() {
		return null;

	}

	public String RegisterUser() {
		return null;
	}

	@Override
	public RegistrationVM getModel() {

		return userBean;
	}

}
