package com.techlabs.area;

public class Rectangle {
	private int length, breadth;
	String red="RED"; String green="GREEN"; String blue="BLUE";
	 

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

	public String checkColor(String standard) {
	/*	switch(standard){
		case "RED": return "red";
		case "BLUE": return "blue";
		case "GREEN": return "green";
		default: return "red";
		}*/
		if(red.equalsIgnoreCase(standard))
			return standard;
		else if(green.equalsIgnoreCase(standard))
			return standard;
		else if(blue.equalsIgnoreCase(standard))
			return standard;
		else 
			return red;
	}
	public int getLength() {
		return length;
	}

	public int getbreadth() {
		return breadth;
	}

	int areaOfRectangle() {
		return length * breadth;
	}

}
