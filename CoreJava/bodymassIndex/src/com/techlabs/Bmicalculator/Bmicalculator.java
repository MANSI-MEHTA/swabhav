package com.techlabs.Bmicalculator;

public class Bmicalculator {
	private double weight, height, BMI;
 
	public void setWeight(double weight) {
		this.weight = weight;

	}

	public void setHeight(double height) {
		this.height = height;

	}
	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;

	}
	public double getBMI() {
		return BMI;

	}
	public void eat() {
		weight+=2;
	}
	public void workout() {
		weight-=1;
	}
	public String calculate() {
		BMI = ((weight / height) / height);
		if (0 < BMI && BMI < 18.5)
			return "underweight";
		else if (18.5 <= BMI && BMI < 25.0)
			return "normal";
		else
			return "overweight";

	}

}
