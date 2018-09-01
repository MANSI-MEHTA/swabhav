package com.techlabs.annotationtest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

@interface refractormethods {
	int value() default 10;
}

public class MethodsClass {
	@refractormethods

	public void firstMethod() {

		System.out.println("first method");
	}

	public void secondMethod() {
		System.out.println("second method");
	}

	public void thirdMethod() {
		System.out.println("third method");
	}

	public void fourthMethod() {
		System.out.println("fourth method");
	}

	@refractormethods

	public void fifthMethod() {
		System.out.println("fifth method");
	}

}
