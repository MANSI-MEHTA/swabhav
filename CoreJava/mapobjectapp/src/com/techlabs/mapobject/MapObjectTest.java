package com.techlabs.mapobject;

import java.util.*;
import java.util.Map.Entry;

public class MapObjectTest {
	public static void main(String args[]) {

		CHashMap hm = new CHashMap();
		CTreeMap tm = new CTreeMap();
		CLinkedHashMap lhm = new CLinkedHashMap();
		Student student1 = new Student("varshil", 21, 100);
		Student student2 = new Student("shubham", 21, 101);
		Student student3 = new Student("sanket", 21, 102);
		Student student4 = new Student("manoj", 21, 103);
		HashMap<Integer, Student> hashmap = new HashMap<Integer, Student>();

		hashmap = hm.addStudent(student1);
		hashmap = hm.addStudent(student2);
		hashmap = hm.addStudent(student3);

		display(hashmap);

		System.out.println("\nThe students in the treemap are:");
		TreeMap<Integer, Student> treemap = tm.addStudent(student1);
		treemap = tm.addStudent(student4);
		treemap = tm.addStudent(student2);
		treemap = tm.addStudent(student3);

		display(treemap);

		System.out.println("\nThe students in the linkedhashmap are:");
		LinkedHashMap<Integer, Student> linkedhashmap = lhm.addStudent(student2);
		linkedhashmap = lhm.addStudent(student1);
		linkedhashmap = lhm.addStudent(student4);
		linkedhashmap = lhm.addStudent(student3);

		display(linkedhashmap);

		System.out.println("The students in the hashmap after deletion:");
		hashmap = hm.deleteStudent(1);
		display(hashmap);

		System.out.println("The students in the treemap after deletion:");
		treemap = tm.deleteStudent(2);
		display(treemap);

		System.out.println("The students in the linkedhashmap after deletion:");
		linkedhashmap = lhm.deleteStudent(4);
		display(linkedhashmap);

		System.out.println("To check students is present in  hashmap or not  :");
		if (hm.searchStudent(student2))
			System.out.println("present");
		else
			System.out.println("Not present");

		System.out.println("\nTo check students is present in  treemap or not  :");
		if (tm.searchStudent(student1))
			System.out.println("present");
		else
			System.out.println("Not present");

		System.out.println("\nTo check students is present in  linkedhashmap or not  :");
		if (lhm.searchStudent(student1))
			System.out.println("present");
		else
			System.out.println("Not present");

		System.out.println("\nTo update students in hashmap:");
		hashmap = hm.updateStudent(3, 21, 22);
		display(hashmap);

		System.out.println("\nTo update students in treemap :");
		treemap = tm.updateStudent(3, 21, 22);
		display(treemap);

		System.out.println("\nTo update students in linkedhashmap :");
		linkedhashmap = lhm.updateStudent(2, 21, 22);
		display(treemap);

	}

	static void display(Map<Integer, Student> maps) {
		for (Entry<Integer, Student> entry : maps.entrySet()) {
			System.out.print(entry.getKey() + "\t\t");
			Student student = entry.getValue();
			System.out.print(student.getName() + "\t\t" + student.getAge() + "\t\t" + student.getRoll());
			System.out.println();

		}
	}

}
