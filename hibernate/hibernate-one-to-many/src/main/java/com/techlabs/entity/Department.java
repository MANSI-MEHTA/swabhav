package com.techlabs.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	private int dept_id;

	@Column(name = "dept_name")
	private String dept_name;

	@OneToMany(mappedBy = "dept")
	private Set<Employee> empSet = new HashSet<Employee>();

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public Set<Employee> getEmpSet() {
		return empSet;
	}

	public void setEmpSet(Set<Employee> empSet) {
		this.empSet = empSet;
	}

}
