package com.techlabs.mutable;

public class MutableTest {
	public static void main(String args[]) {
		int i=10;
		Integer x=i;
		mutexInteger(x);
		i=x.intValue();
		System.out.println(i);
	}
	
	static void mutexInteger(Integer x) {
		x=20;
	
	}
}
