package com.techlabs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Form extends ActionSupport implements
		ModelDriven<ValidationAction> {
	ValidationAction beam = new ValidationAction();
	
	@Override
	public String execute() throws Exception {
		System.out.print("working");

		return "success";
	}

	public String jsonExecute() throws Exception {
		
		return "success";
	}

	public ValidationAction getBeam() {
		return beam;
	}

	public void setBeam(ValidationAction beam) {
		this.beam = beam;
	}

//	public void validate() {
//		if (beam.getFname().length() < 3) {
//			addFieldError("fname", "First Name is mandatory");
//		}
//		if (beam.getLname().length() < 3) {
//			addFieldError("lname", "Last Name is mandatory");
//		}
//	}

	@Override
	public ValidationAction getModel() {

		return beam;
	}

}
