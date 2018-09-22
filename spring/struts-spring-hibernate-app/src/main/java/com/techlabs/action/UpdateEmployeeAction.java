package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.entity.Employee;
import com.techlabs.service.EmployeeService;

public class UpdateEmployeeAction extends ActionSupport {
	private WebApplicationContext context = WebApplicationContextUtils
			.getRequiredWebApplicationContext(ServletActionContext
					.getServletContext());
	private List<Employee> listofemployees = new ArrayList<Employee>();
	private EmployeeService employeeservice = context
			.getBean(EmployeeService.class);
private Employee employee;
	@Override
	public String execute() {
		long id=Long.parseLong(ServletActionContext.getRequest().getParameter("id"));
		employee=employeeservice.getEmployeeById(id);
		System.out.println(employee);
		return "success";
		
	}
	public String executePost(){
		employeeservice.updateEmployeeById(employee);
		return "success";
	}
	public List<Employee> getListofemployees() {
		return listofemployees;
	}
	public void setListofemployees(List<Employee> listofemployees) {
		this.listofemployees = listofemployees;
	}
	public EmployeeService getEmployeeservice() {
		return employeeservice;
	}
	public void setEmployeeservice(EmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
