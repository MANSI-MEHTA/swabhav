package com.techlabs.services;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.College;

public class CollegeService {
	private static List<College> listOfColleges=new ArrayList<College>();
	private static CollegeService object;
	private CollegeService(){
		
	}
	public static CollegeService getInstanceOf(){
		if(object==null){
			listOfColleges.add(new College(1000,"sakec","Chembur,Mumbai"));
			listOfColleges.add(new College(1001,"vjti","Matunga,Mumbai"));
			listOfColleges.add(new College(1002,"sj","palghar,Mumbai"));
			object=new CollegeService();
		}
		return object;
	}
	public College getCollegeById(int id){
		for(College college:listOfColleges){
			if(college.getClg_ID()==id)
				return college;
		}
		return null;
	}
}
