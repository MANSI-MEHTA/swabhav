package com.techlabs.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.model.College;
import com.techlabs.services.CollegeService;

public class ShowCollegeAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private CollegeService collegeservice = CollegeService.getInstancesOf();
	private List<College> listOfColleges = new ArrayList<College>();

	@Override
	public String execute() throws Exception {
		System.out.println("Working");
		listOfColleges = collegeservice.getColleges();
		return "success";
	}

	public CollegeService getCollegeservice() {
		return collegeservice;
	}

	public void setCollegeservice(CollegeService collegeservice) {
		this.collegeservice = collegeservice;
	}

	public List<College> getListOfColleges() {
		return listOfColleges;
	}

	public void setListOfColleges(List<College> listOfColleges) {
		this.listOfColleges = listOfColleges;
	}

}
