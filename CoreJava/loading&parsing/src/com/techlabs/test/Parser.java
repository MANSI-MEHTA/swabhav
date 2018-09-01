package com.techlabs.test;

import java.util.*;

public class Parser {
	private ILoader iloader;

	public Parser(ILoader iloader) {
		this.iloader = iloader;

	}

	public ArrayList<Employee> getRecord() throws Exception {
		ArrayList<String> recordlist = iloader.load();
		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		for (String list : recordlist) {
			String[] single = list.split(",");
			int id = Integer.parseInt(single[0]);
			String name = single[1];
			String designation = single[2];
			String mag_id = single[3];
			String doj = single[4];
			double salary = Double.parseDouble(single[5]);
			int department_no = Integer.parseInt(single[7]);
			Employee employee = new Employee(id, name, designation, mag_id, doj, salary, department_no);
			employeelist.add(employee);
		}
		return employeelist;
	}
}
