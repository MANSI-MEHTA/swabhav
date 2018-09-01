package com.techlabs.services;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	private static List<Student> listOfStudents = new ArrayList<Student>();
	private static StudentService object;

	private StudentService() {
	}

	public static StudentService getInstance() {
		if (object == null) {
			object = new StudentService();

			listOfStudents.add(new Student("varshil", "mehta",1000, 101, 8, "male"));
			listOfStudents.add(new Student("manoj", "m",1002, 102, 9, "male"));
			listOfStudents
					.add(new Student("shubham", "vora",1001, 103, 8.5, "male"));

		}
		return object;
	}

	public List<Student> getStudents() {
		return listOfStudents;
	}

	public void addStudent(Student student) {
		listOfStudents.add(student);
	}

	public Student getStudentById(int id) {
		for (Student x : listOfStudents) {
			if (x.getRollno() == id) {
				return x;
			}

		}
		return null;
	}

	public void updateStudent(Student student) {
		int rollno = student.getRollno();
		
		for (Student x : listOfStudents) {
			if (x.getRollno() == rollno) {
				x.setFname(student.getFname());
				x.setLname(student.getLname());
				x.setCgpi(student.getCgpi());
				break;
			}

		}
	}
}
