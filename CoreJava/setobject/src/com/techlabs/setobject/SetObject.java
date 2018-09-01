package com.techlabs.setobject;

import java.util.*;

public class SetObject {
	public static void main(String args[]) {
		CHashSet hs = new CHashSet();
		CTreeSet ts = new CTreeSet();
		CLinkedHashSet lhs = new CLinkedHashSet();
		HashSet<Student> hashset = null;
		TreeSet<Student> treeset = null;
		LinkedHashSet<Student> linkedhashset = null;
		Student student1 = new Student("varshil", 21, 100);
		Student student2 = new Student("shubham", 21, 101);
		Student student3 = new Student("sanket", 21, 102);
		Student student4 = new Student("manoj", 21, 103);

		System.out.println("The students in the hashSet after addition:");
		hashset = hs.addStudent(student3);
		hashset = hs.addStudent(student1);
		hashset = hs.addStudent(student2);
		hashset = hs.addStudent(student4);
		display(hashset);

		System.out.println("\nThe students in the treeSet after adddition:");
		treeset = ts.addStudent(student3);
		treeset = ts.addStudent(student2);
		treeset = ts.addStudent(student1);
		treeset = ts.addStudent(student4);
		display(treeset);

		System.out.println("\nThe students in the linkedhashSet after addition:");
		linkedhashset = lhs.addStudent(student2);
		linkedhashset = lhs.addStudent(student1);
		linkedhashset = lhs.addStudent(student4);
		linkedhashset = lhs.addStudent(student3);
		display(linkedhashset);

		System.out.println("The students in the hashSet after deletion:");
		hashset = hs.deleteStudent(student1);
		display(hashset);

		System.out.println("The students in the treeSet after deletion:");
		treeset = ts.deleteStudent(student2);
		display(treeset);

		System.out.println("The students in the linkedhashSet after deletion:");
		linkedhashset = lhs.deleteStudent(student4);
		display(linkedhashset);

		System.out.println("To check students is present in  hashset or not  :");
		if (hs.searchStudent(student2))
			System.out.println("present");
		else
			System.out.println("Not present");

		System.out.println("\nTo check students is present in  treeset or not  :");
		if (ts.searchStudent(student1))
			System.out.println("present");
		else
			System.out.println("Not present");

		System.out.println("\nTo check students is present in  linkedhashset or not  :");
		if (lhs.searchStudent(student1))
			System.out.println("present");
		else
			System.out.println("Not present");
		
		System.out.println("\nTo update students in hashset:");
		hashset=hs.updateStudent(student2,22);
		display(hashset);

		System.out.println("\nTo update students in treeset :");
		treeset=ts.updateStudent(student1,22);
		display(treeset);

		System.out.println("\nTo update students in linkedhashset :");
		linkedhashset=lhs.updateStudent(student2,22);
		display(treeset);

	}

	static void display(Set<Student> sets) {
		for (Student set : sets) {
			System.out.print(set.getName() + "\t\t");
			System.out.print(set.getAge() + "\t\t");
			System.out.print(set.getRoll() + "\t\t\n");

		}
	}
}
