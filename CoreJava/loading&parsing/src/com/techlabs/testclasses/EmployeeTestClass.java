package com.techlabs.testclasses;

import com.techlabs.test.Employee;

public class EmployeeTestClass {
	public static void main(String args[]) {
		Employee employee = new Employee(5, "smith", "manager", "1233", "1-may-1998", 2850, 30);
		display(employee);

	}

	static void display(Employee employee) {
		System.out.println(employee.getId() + "," + employee.getName() + "," + employee.getDesignation() + ","
				+ employee.getManager_id() + "," + employee.getDoj() + "," + employee.getSalary() + ","
				+ employee.getDepartment_no());
	}

}
