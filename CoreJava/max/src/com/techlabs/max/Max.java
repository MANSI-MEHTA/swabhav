package com.techlabs.max;

import java.util.*;

public class Max {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int firstmax, secondmax;
		System.out.println("Enter how many numbers");
		int n = sc.nextInt();
		System.out.println("Enter number one by one and then press enter after typing 1 integer");
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		firstmax = array[0];
		secondmax = array[0];

		for (int i = 1; i < n; i++) {
			if (array[i] >= firstmax && secondmax <= firstmax) {
				secondmax = firstmax;
				firstmax = array[i];
			} else if (array[i] >= secondmax) {
				secondmax = array[i];

			}
		}
		System.out.println(firstmax);
		System.out.println(secondmax);
		sc.close();
	}

}
