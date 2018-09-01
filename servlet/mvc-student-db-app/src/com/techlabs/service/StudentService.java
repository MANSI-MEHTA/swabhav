package com.techlabs.service;

import java.util.List;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

public class StudentService {

	private static StudentService object;
	private static StudentRepository studentrepository = null;

	private StudentService() {
	}

	public static StudentService getInstance() {
		if (object == null) {
			object = new StudentService();
			createInstanceOfStudentRepository();

		}
		return object;
	}

	private static void createInstanceOfStudentRepository() {
		studentrepository = new StudentRepository();

	}

	public List<Student> getStudents() {
		return studentrepository.getStudents();
	}

	public void addStudent(Student student) {
		studentrepository.addStudent(student);
	}

	public Student getStudentById(int id) {
		return studentrepository.getStudentById(id);
	}

	public void updateStudent(Student student) {
		studentrepository.updateStudent(student);
		
		/*
		 * int rollno = student.getRollno();
		 * 
		 * for (Student x : listOfStudents) { if (x.getRollno() == rollno) {
		 * x.setFname(student.getFname()); x.setLname(student.getLname());
		 * x.setCgpi(student.getCgpi()); break; }
		 * 
		 * }
		 */
	}

}
