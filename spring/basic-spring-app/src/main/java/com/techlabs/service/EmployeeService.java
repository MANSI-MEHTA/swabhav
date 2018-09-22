package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Employee;
import com.techlabs.repository.EmployeeRepository;

@Service("employeeservice")
public class EmployeeService {

	@Autowired
	private EmployeeRepository emprepo;

	public EmployeeRepository getEmprepo() {
		return emprepo;
	}

	@Autowired
	public void setEmprepo(EmployeeRepository emprepo) {
		this.emprepo = emprepo;
	}

	public List<Employee> getAllEmployee() {
		return this.emprepo.getListofemployee();
	}

	public Employee getEmployeeById(int id) {
		return emprepo.getEmployeeById(id);
	}

}
