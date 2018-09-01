package com.tectlabs.test;

import java.util.*;

public class JobCandidate /* implements Comparable<JobCandidate> */ {
	private String name;
	private int salary;
	private int id;
	private int age;

	public JobCandidate(String name, int salary, int id, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * public int compareTo(JobCandidate candidate) { return
	 * this.getName().compareTo(candidate.getName()); }
	 */

}
