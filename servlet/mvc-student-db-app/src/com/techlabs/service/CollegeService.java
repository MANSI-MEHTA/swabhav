package com.techlabs.service;

import java.util.List;

import com.techlabs.model.College;
import com.techlabs.model.Student;
import com.techlabs.repository.CollegeRepository;

public class CollegeService {
	private static CollegeService object;
	private static CollegeRepository collegerepository = null;

	private CollegeService() {

	}

	public static CollegeService getInstanceOf() {
		if (object == null) {
			object = new CollegeService();
			createInstanceOfCollegeRepository();

		}
		return object;
	}

	public static void createInstanceOfCollegeRepository() {
		collegerepository = new CollegeRepository();

	}

	public List<College> getColleges() {
		return collegerepository.getColleges();
	}

	public College getCollegeById(int id) {
		return collegerepository.getCollegeById(id);
	}

	public List<Student> getStudentsByCollegeId(int id) {
		return collegerepository.getStudentByCollegeId(id);
	}

	public List<College> getNameAndIdOfColleges() {
		return collegerepository.getNameAndIdOfColleges();
	}
}
