package com.techlabs.setobject;

import java.util.*;

public class CTreeSet {
	TreeSet<Student> treeset = new TreeSet<Student>();

	public TreeSet<Student> addStudent(Student student) {
		treeset.add(student);
		return treeset;

	}
	public TreeSet<Student> deleteStudent(Student student) {
		treeset.remove(student);
		return treeset;

	}
	public Boolean searchStudent(Student student) {
		return treeset.contains(student);
	}
	public TreeSet<Student> updateStudent(Student student, int age) {
		if (treeset.contains(student)) {
			treeset.remove(student);
			student.setAge(age);
			treeset.add(new Student(student.getName(),student.getAge(),student.getRoll()));

		}
		return treeset;
	}



}
