package com.techlabs.collegeapp;

public class StudentTest {
	public static void main(String args[]) {
		Student student1=new Student(1,"varshil","dsffdsf",Branch.Electronic);
		System.out.println(student1.getName());
		System.out.println(student1.getId());
		System.out.println(student1.getAddress());
		System.out.println(student1.getBranch());
		
	
	}


}
