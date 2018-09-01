package com.techlabs.annotationtest;

import java.lang.reflect.Method;

public class AnnotationTest {
	public static void main(String args[]) {
		MethodsClass methodclass = new MethodsClass();
		@SuppressWarnings("rawtypes")
		Class cls = methodclass.getClass();
		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(refractormethods.class)) {
				System.out.println(method.getName());
			}

		}

	}
}
