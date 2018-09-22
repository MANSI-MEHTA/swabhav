package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.EmployeeService;

public class TestDI {
	public static void main(String args[]) {
		try {
			ApplicationContext cxt = new ClassPathXmlApplicationContext(
					"applicationcontext.xml");

			EmployeeService empservice1 = (EmployeeService) cxt
					.getBean(EmployeeService.class);

			System.out.println("Number of Employees: "+empservice1.getAllEmployee().size());
			System.out.println("Car name: "+empservice1.getEmployeeById(101).getCar()
					.getCompanyname());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
