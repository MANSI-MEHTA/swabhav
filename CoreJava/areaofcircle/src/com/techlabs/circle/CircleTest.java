package com.techlabs.circle;

public class CircleTest {
	public static void main(String args[]) {
		int radius;
		BorderStyle border;
		border = BorderStyle.DOTTED;
		radius = 1;
		Circle circle = new Circle();
		circle.setRadius(radius);
		circle.setStyle(border);
		circle.areaOfCircle();
		BorderStyle style = circle.getStyle();
		printDetails(circle);

	}

	static void printDetails(Circle c1) {
		System.out.println(c1.area);
		System.out.println(c1.style);

	}

}
