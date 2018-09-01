package com.techlabs.exceptiongeneration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExceptionGeneration {
	public static void main(String args[]) throws IOException {

		try {
			@SuppressWarnings("unused")
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			int array[] = new int[] { 2, 5, 402 };
			System.out.println(array[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			FileInputStream fin = new FileInputStream("record.csv");
			@SuppressWarnings({ "unused", "resource" })
			ObjectInputStream in = new ObjectInputStream(fin);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		try {
			@SuppressWarnings("unused")
			int a = Integer.parseInt("null");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		try {
			@SuppressWarnings("unused")
			int i = RecursiveMethod();
		} catch (StackOverflowError e) {
			System.out.println(e);
		}

	}

	private static int RecursiveMethod()
	{

         return RecursiveMethod();

     }

}
