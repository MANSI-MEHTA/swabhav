package com.techlabs.iteratoriterable;

import java.util.Iterator;

public class IteratorClass implements Iterator<Student> {
	private Student student[] = new Student[4];
	private static int count = -1;

	public void addStudent() {
		student[0] = new Student(101, "varshil");
		student[1] = new Student(102, "shubham");
		student[2] = new Student(103, "manoj");
	}


	@Override
	public boolean hasNext() {
		if (student[++count] != null)
			return true;

		else
			return false;
	}

	@Override
	public Student next() {
		return student[count];
	}

}
