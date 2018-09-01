package com.techlabs.test;

import java.util.*;
import java.io.*;
public class Test {
	public static void main(String args[]) throws Exception{
		Database db = new Database();
		Student student=new Student("vars", 103, "mehta");
		db.serialize(student);
		display(db.deSerialize());
		FileWriter oneline = new FileWriter("product.csv");
		
		oneline.append(student.getFirstName());
        oneline.append(",");
        oneline.append(String.valueOf(student.getRoll()));
        oneline.append(",");
        oneline.append(student.getSurName());
        oneline.append('\n');
        oneline.flush();
        oneline.close();
	}
	
	static void display(Student s) {
		System.out.println(s.getFirstName());
		System.out.println(s.getRoll());
		System.out.println(s.getSurName());
		
	}
}
