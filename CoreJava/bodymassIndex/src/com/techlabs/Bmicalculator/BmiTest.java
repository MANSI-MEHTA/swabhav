package com.techlabs.Bmicalculator;

public class BmiTest {
	public static void main(String args[]) {
		double weight = 68, height = 1.78;
		Bmicalculator bmi = new Bmicalculator();
		bmi.setWeight(weight);
		bmi.setHeight(height);
		System.out.println("Before Lunch and Workout");
		printDetails(bmi);
		System.out.println("have you done lunch");
		boolean lunch = true;
		if (lunch) {
			System.out.println("After lunch before workout");
			bmi.eat();
			printDetails(bmi);

		}
		System.out.println("have you done your Workout");
		boolean workout = true;
		if (workout) {
			System.out.println("After lunch after workout");
			bmi.workout();
			printDetails(bmi);

		}

	}

	static void printDetails(Bmicalculator bmi) {
		System.out.println("status: " + bmi.calculate());
		System.out.println("Your BMI is " + bmi.getBMI() + " kg/m^2");

	}

}
