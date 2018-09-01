package com.tectlabs.refelctionTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionTest {
	public static void main(String args[]) throws Exception {
		int count = 0;
		Reflection reflection = new Reflection();
		Class cls = String.class;
		Constructor[] constructors = reflection.getNumberOfTheConstructor(cls);
		System.out.println("The number of constructor is " + constructors.length);
		for (Constructor constructor : constructors)
			System.out.println(constructor.toString());

		System.out.println("The public methods of class are : ");
		Method[] methods = reflection.getNumberOfTheMethods(cls);

		for (Method method : methods) {
			System.out.println(method.toString());

		}
		System.out.println("Number of methods in String class= " + methods.length);
		int getsetmethods = reflection.getNumberOfTheGetSetMethods(cls);

		System.out.println("Number of getter setter methods in String class= " + getsetmethods);

	}

}
