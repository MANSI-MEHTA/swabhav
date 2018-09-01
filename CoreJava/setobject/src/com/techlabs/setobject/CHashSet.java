package com.techlabs.setobject;

import java.util.HashSet;

public class CHashSet {
	private HashSet<Student> hashset = new HashSet<Student>();

	public HashSet<Student> addStudent(Student student) {
		hashset.add(student);
		return hashset;

	}

	public HashSet<Student> deleteStudent(Student student) {
		hashset.remove(student);
		return hashset;

	}

	public Boolean searchStudent(Student student) {
		return hashset.contains(student);
	}

	public HashSet<Student> updateStudent(Student student, int age) {
		if (hashset.contains(student)) {
			hashset.remove(student);
			student.setAge(age);
			hashset.add(new Student(student.getName(),student.getAge(),student.getRoll()));

		}
		return hashset;
	}
}
