package com.tectlabs.test;

import java.util.ArrayList;

public class Test {
	public static void main(String args[]) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("varshil", 101, 21));
		list.add(new Student("shubham", 102, 21));
		list.add(new Student("manoj", 103, 21));
		try {
			find(list, 104);
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());

		}

	}

	static int find(ArrayList<Student> lists, int id) throws StudentNotFoundException {
		for (Student list : lists) {
			if (list.getId() == id) {
				System.out.println("student found");
				return 1;
			}
		}
		throw new StudentNotFoundException("student id " + id + " Not Found");

	}

}
