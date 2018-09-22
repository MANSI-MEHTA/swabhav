package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Car;
import com.techlabs.model.Employee;
import com.techlabs.model.House;
import com.techlabs.model.Office;

@Repository("employeerespository")
public class EmployeeRepository {

	private List<Employee> listofemployee = new ArrayList<Employee>();

	public EmployeeRepository() {
		System.out.println("Employee respository constructor instantiated");
		listofemployee.add(new Employee(101, "varshil", "virar",new Car("Desire","Swift"),new Office("andheri"),new House("virar")));
		listofemployee.add(new Employee(102, "manoj", "andheri",new Car("wagon","xw"),new Office("andheri"),new House("andheri")));
		
	}

	public List<Employee> getListofemployee() {
		return listofemployee;
	}

	public void setListofemployee(List<Employee> listofemployee) {
		this.listofemployee = listofemployee;
	}
	
	public Employee getEmployeeById(int id){
		for(Employee employee:listofemployee){
			if(employee.getId()==id){
				return employee;
			}
		}
		return null;
	}
	
	

}
