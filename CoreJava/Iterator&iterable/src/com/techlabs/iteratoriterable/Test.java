package com.techlabs.iteratoriterable;

public class Test {

	public static void main(String args[]) throws Exception {

		IteratorClass itr = new IteratorClass();
		itr.addStudent();
		while (itr.hasNext()) {

			Student student = itr.next();

			System.out.println(student.getId() + "\t\t" + student.getName());
		}

	}
}
