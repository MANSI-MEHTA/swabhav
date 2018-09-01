package com.techlabs.area;

import java.util.Scanner;

public class Rectangletest {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int length, breadth;
		System.out.println("Enter length");
		length = sc.nextInt();
		System.out.println("Enter breadth");
		breadth = sc.nextInt();
		//String color="ReD";
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle1=(Rectangle)rectangle.clone();
		
		rectangle.setLength(length);
		rectangle.setBreadth(breadth);
		rectangle1.setLength(length);
		rectangle1.setBreadth(breadth);
		if(rectangle.hashCode()==rectangle1.hashCode()) {
			if(rectangle.equals(rectangle1)) {
				System.out.println("equals");
			}
			else
				System.out.println("notequals");
			
			
		}
		else
		System.out.println("both object are not equals");
		
		//String standard=color.equalsIgnoreCase(anotherString)
		//color=rectangle.checkColor(color);
		
		//int area = rectangle.areaOfRectangle();
		//System.out.println("Area of Rectangle is:");

		//System.out.println(area);
		//System.out.println(color);

		sc.close();
	}

}
