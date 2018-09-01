package com.techlabs.test;

import java.util.*;

public class Analyser {
	public int totalEmployeeByDesignation(ArrayList<Employee> employeelists, String designation) {
		int i = 0;
		for (Employee list : employeelists) {
			if (list.getDesignation().equals(designation)) {
				System.out.println(list.getName());
				i++;
			}
		}
		return i;

	}

	public int totalEmployeeByDepartment(ArrayList<Employee> employeelists, int department_no) {
		int i = 0;
		for (Employee list : employeelists) {
			if (list.getDepartment_no() == (department_no)) {
				i++;
			}
		}
		return i;

	}

	public int getHighestSalary(ArrayList<Employee> employeelist) {
		TreeSet<Employee> employeetreeset = new TreeSet<Employee>(employeelist);
		return (int) employeetreeset.last().getSalary();

	}

}
