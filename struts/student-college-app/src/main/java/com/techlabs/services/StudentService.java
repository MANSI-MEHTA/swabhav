package com.techlabs.services;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
	private static List<Student> Studentlist = new ArrayList<Student>();

	private static StudentService object;

	private StudentService() {
	}

	public static StudentService getInstanceOf() {
		if (object == null) {
			object = new StudentService();
			Studentlist.add(new Student(101, "varshil", "mehta", "1005", 8.5,
					"male"));
			Studentlist.add(new Student(102, "manoj", "m", "1001", 9, "male"));
			Studentlist.add(new Student(103, "shubham", "vora", "1002", 9.5,
					"male"));

		}
		return object;
	}

	public static List<Student> getStudents() {
		return Studentlist;
	}

	public void addStudent(Student student) {
		Studentlist.add(student);
		System.out.print("Student added:" + Studentlist);
	}

	public Student getStudentById(int id) {
		for (Student student : Studentlist) {
			if (student.getRollno() == id) {
				return student;
			}
		}
		return null;
	}
	
	public void updateStudentById(Student updatedstudent) {

		for (Student student : Studentlist) {
			if (student.getRollno() == updatedstudent.getRollno()) {

				student.setFname(updatedstudent.getFname());
				student.setLname(updatedstudent.getLname());
				student.setCgpi(updatedstudent.getCgpi());
				student.setGender(updatedstudent.getGender());
			}
		}

	}

	public void deleteStudent(Student student) {

		Studentlist.remove(student);
	}

	public static List<Student> getStudentlist() {
		return Studentlist;
	}

	public static void setStudentlist(List<Student> studentlist) {
		Studentlist = studentlist;
	}

}
