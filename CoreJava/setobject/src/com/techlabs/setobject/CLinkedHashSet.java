package com.techlabs.setobject;

import java.util.LinkedHashSet;

public class CLinkedHashSet {
	private LinkedHashSet<Student> linkedhashset = new LinkedHashSet<Student>();

	public LinkedHashSet<Student> addStudent(Student student) {
		linkedhashset.add(student);
		return linkedhashset;

	}

	public LinkedHashSet<Student> deleteStudent(Student student) {
		linkedhashset.remove(student);
		return linkedhashset;

	}
	public Boolean searchStudent(Student student) {
		return linkedhashset.contains(student);
	}
	public LinkedHashSet<Student> updateStudent(Student student, int age) {
		if (linkedhashset.contains(student)) {
			linkedhashset.remove(student);
			student.setAge(age);
			linkedhashset.add(new Student(student.getName(),student.getAge(),student.getRoll()));

		}
		return linkedhashset;
	}


}
