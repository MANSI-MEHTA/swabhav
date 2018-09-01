package com.techlabs.collegeapp;

import java.util.*;

public class College implements Isalary {
	Scanner sc = new Scanner(System.in);
	private ArrayList<Student> lstudent = new ArrayList<Student>();
	private ArrayList<Professor> lprofessor = new ArrayList<Professor>();

	@Override
	public void caculateSalary(ArrayList<Professor> professorlist) {
		for (Professor list : lprofessor) {
			list.setSalary(list.getExpirence() * 4000);
		}

	}

	public ArrayList<Student> getLstudent() {
		return lstudent;
	}

	public ArrayList<Professor> getLprofessor() {
		return lprofessor;
	}

	public void addStudent(Student student) {
		lstudent.add(student);
	}

	public void addProfessor(Professor professor) {
		lprofessor.add(professor);
	}

}
