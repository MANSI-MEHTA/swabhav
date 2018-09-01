package com.techlabs.testoverloading;

public class TestOverloading {
	public static void main(String args[]) {
		print(20);
		print(40.0f);
		print("rfififr");
		print(50.0);

	}

	static void print(int n) {
		System.out.println(n + " Its an Integer");
	}

	static void print(double n) {
		System.out.println(n + " Its an double");

	}

	static void print(float n) {
		System.out.println(n + " Its an float");

	}

	static void print(String n) {
		System.out.println(n + " Its an String");

	}
}
