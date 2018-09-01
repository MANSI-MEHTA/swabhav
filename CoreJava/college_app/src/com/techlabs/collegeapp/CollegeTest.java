package com.techlabs.collegeapp;

import java.util.ArrayList;

public class CollegeTest {
	public static void main(String args[]) {
		College college = new College();
		Student student=new Student(1, "varshil", "ejnjerfnjenr", Branch.Comps);
		college.addStudent(student);
		Professor professor=new Professor(101, "shubham", "ndnfnffnr", 3);
		college.addProfessor(professor);
		ArrayList<Professor> lp = college.getLprofessor();


		System.out.println("\nInfo about student");
		System.out.println("Id\t\tName\t\taddress\t\tbranch");
		ArrayList<Student> ls = college.getLstudent();
		for (Student list : ls) {
			System.out.println(
					list.getId() + "\t\t" + list.getName() + "\t\t" + list.getAddress() + "\t\t" + list.getBranch());
		}
		
		college.caculateSalary(lp);
		System.out.println("\nInfo about professor");
		System.out.println("Id\t\tName\t\taddress\t\tsalary");
		for (Professor list : lp) {
			System.out.println(
					list.getId() + "\t\t" + list.getName() + "\t\t" + list.getAddress() + "\t\t" + list.getSalary());
		}
	}
}
