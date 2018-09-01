package com.tectlabs.employeeTest;

//A simple Java program to demonstrate the use of reflection
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class EmployeeTest {
	public static void main(String args[]) throws Exception {
		int count = 1;
		Employee emp = new Employee("varshil", 5, 10);
		Class cls = emp.getClass();
		System.out.println("The name of class is " + cls.getName());

		Constructor[] constructors = cls.getDeclaredConstructors();
		System.out.println("The name of constructor is " + constructors.length);
		for (Constructor constructor : constructors)
			System.out.println(constructor.toString());

		System.out.println("The public methods of class are : ");
		Method[] methods = cls.getMethods();

		for (Method method : methods) {
			if (method.getName().startsWith("get") || method.getName().startsWith("set")) {
				count++;
			}
			System.out.println(method.getName());

		}
		System.out.println(--count);

	}

}
