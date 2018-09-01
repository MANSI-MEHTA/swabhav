package com.techlabs.setobject;
public class Student  implements Comparable<Student> {
	private String name;
	private int age;
	private int roll;

	public Student(String name, int age, int roll) {
		super();
		this.name = name;
		this.age = age;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public int compareTo(Student student) {
		if (this.roll == student.getRoll()) {
			return 0;
		} else if (this.roll < student.getRoll()) {
			return -1;
		}
		return 1;
	}


}
