package com.techlabs.test;

import java.util.*;

public class Test {
	public static void main(String args[]) throws Exception {
		UrlLoader urlloader = new UrlLoader();
		DiskLoader diskloader = new DiskLoader();
		Analyser analyser = new Analyser();
		Parser parser = new Parser(diskloader);

		ArrayList<Employee> employeelist = (ArrayList<Employee>) parser.getRecord();
		System.out.println("Total employees of manager designation are: "
				+ analyser.totalEmployeeByDesignation(employeelist, "'MANAGER'"));
		System.out.println("Total employees of President designation are: "
				+ analyser.totalEmployeeByDesignation(employeelist, "'PRESIDENT'"));
		System.out.println("Total employees of Salesman designation are: "
				+ analyser.totalEmployeeByDesignation(employeelist, "'SALESMAN'"));
		System.out.println("Total employees of clerk designation are: "
				+ analyser.totalEmployeeByDesignation(employeelist, "'CLERK'"));
		System.out.println("Total employees of Analyst designation are: "
				+ analyser.totalEmployeeByDesignation(employeelist, "'ANALYST'"));
		System.out.println(
				"Total employees in department number 10 are: " + analyser.totalEmployeeByDepartment(employeelist, 10));
		System.out.println(
				"Total employees in department number 20 are: " + analyser.totalEmployeeByDepartment(employeelist, 20));

		System.out.println(
				"Total employees in department number 30 are: " + analyser.totalEmployeeByDepartment(employeelist, 30));
		System.out.println("Highest salary is :" + analyser.getHighestSalary(employeelist));

	}

}
