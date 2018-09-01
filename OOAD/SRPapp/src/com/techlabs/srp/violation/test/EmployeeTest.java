package com.techlabs.srp.violation.test;

import com.techlabs.srp.violation.Employee;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee employee=new Employee("varshil",55,"fresher",21515);
		employee.isPromoted();
		employee.taxCalculation();
	}
}
