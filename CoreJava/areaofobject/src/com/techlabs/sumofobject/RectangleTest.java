package com.techlabs.sumofobject;


public class RectangleTest {
	public static void main(String args[]) {
		int length[], breadth[],sum=0;
		length = new int[] { 1, 5, 10 };
		breadth = new int[] { 1, 5, 10 };
		Rectangle rectangle[] = new Rectangle[3];

		for (int i = 0; i < 3; i++) {
			rectangle[i]=new Rectangle();
			rectangle[i].setLength(length[i]);

			rectangle[i].setBreadth(breadth[i]);

			int area = rectangle[i].areaOfRectangle();
			System.out.println("Area of "+ (i+1)+ "Rectangle is:" + area);
			sum=rectangle[i].sumOfRectangle(sum);
			
		}
		System.out.println("sum of Rectangle is:" + sum);
		

	}

}
