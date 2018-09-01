package com.techlabs.area;

import java.util.Scanner;

public class Rectangletest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length, breadth;
		System.out.println("Enter length");
		length = sc.nextInt();
		System.out.println("Enter breadth");
		breadth = sc.nextInt();
		String color="ReD";
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(length);
		rectangle.setBreadth(breadth);
		//String standard=color.equalsIgnoreCase(anotherString)
		color=rectangle.checkColor(color);
		
		int area = rectangle.areaOfRectangle();
		System.out.println("Area of Rectangle is:");

		System.out.println(area);
		System.out.println(color);

		sc.close();
	}

}
