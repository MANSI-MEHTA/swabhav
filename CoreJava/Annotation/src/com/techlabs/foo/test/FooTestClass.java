package com.techlabs.foo.test;

import java.lang.reflect.Method;

import com.techlabs.foo.Foo;
import com.techlabs.foo.ProTest;

public class FooTestClass {
	public static void main(String args[]) throws Exception {
		int proTestPass = 0;
		int proTestFailed = 0;
		Foo foo = new Foo();
		@SuppressWarnings("rawtypes")
		Class cls = foo.getClass();
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(ProTest.class)) {
				if ((boolean) method.invoke(foo))
					proTestPass++;
				else
					proTestFailed++;
			}
		}
		System.err.println("Number of Annotation method Failed are " + proTestFailed);
		System.out.println("\nNumber of Annotation method passed are " + proTestPass);

	}
}
