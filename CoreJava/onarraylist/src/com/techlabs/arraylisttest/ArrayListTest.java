package com.techlabs.arraylisttest;

import java.util.*;

public class ArrayListTest {
	public static void main(String args[]) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("A", 20));
		list.add(new Student("B", 100));
		list.add(new Student("c", 300));
		 list.remove(2);
		System.out.println("Contents of list:");
		
		for (Student items : list) {
			System.out.println("Name: "+items.getName()+" And Age :"+items.getAge());
			
		}
	}
}
