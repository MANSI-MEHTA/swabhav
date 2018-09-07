package com.techlabs.services;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.College;

public class CollegeService {
	private static CollegeService object;
	private static List<College> listOfColleges=new ArrayList<College>();
	private CollegeService() {

	}
	public static CollegeService getInstancesOf(){
		if(object==null){
			object=new CollegeService();
			listOfColleges.add(new College("1001","VJTI","matunga"));
			listOfColleges.add(new College("1002","SPIT","andheri"));
			listOfColleges.add(new College("1003","DJSanghvi","vileparle"));
			listOfColleges.add(new College("1004","Somaiya","sion"));
			listOfColleges.add(new College("1005","SAKEC","Chembur"));
			
			
		}
		return object;
	}
	public List<College> getColleges(){
		return listOfColleges;
	}
}
