package com.techlabs.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Employee;
import com.techlabs.service.EmployeeService;

public class AddEmployeeAction extends ActionSupport {
	private WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());
	
	private EmployeeService employeeservice = context
			.getBean(EmployeeService.class);

	private long emp_id;
	private String emp_name;
	private double salary;

	@Override
	public String execute() {

		return "success";
	}

	public String executePost() {
		System.out.println("id is " + emp_id);
		 employeeservice.addEmployee(new Employee(emp_id,
		 emp_name, salary));
		return "success";
	}

	public void validate() {

	}

	public EmployeeService getEmployeeservice() {
		return employeeservice;
	}

	public void setEmployeeservice(EmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
