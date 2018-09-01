package com.techlabs.sumofobject;

public class Rectangle {
	private int length, breadth,area;
	 

	public void setLength(int length) {
		this.length = checkParameter(length);

	}

	public void setBreadth(int breadth) {
		this.breadth = checkParameter(breadth);
	}

	public int checkParameter(int parameter) {
		if (parameter < 1)
			return 1;
		else if (parameter > 100)
			return 100;
		else
			return parameter;
	}

	int areaOfRectangle() {
		area=length * breadth;
		return area;
	}
	int sumOfRectangle(int sum) {
		sum=sum+area;
		return sum;
	}

}
