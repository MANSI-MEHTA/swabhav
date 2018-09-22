package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entity.Employee;
import com.techlabs.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository emp_repo;

	public List<Employee> getAllEmployees(){
		return this.emp_repo.getAllEmployees();
	}
	public void addEmployee(Employee emp){
		emp_repo.addEmployee(emp);
	}
	public Employee getEmployeeById(long id){

		return this.emp_repo.getEmployeeById(id);
	}
	public void updateEmployeeById(Employee employee){
		this.emp_repo.updateEmployeeById(employee);
	}
	public EmployeeRepository getEmp_repo() {
		return emp_repo;
	}

	public void setEmp_repo(EmployeeRepository emp_repo) {
		this.emp_repo = emp_repo;
	}
	
	
}
