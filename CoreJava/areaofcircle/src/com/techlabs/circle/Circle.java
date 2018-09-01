package com.techlabs.circle;

public class Circle {
	public BorderStyle style;
	public int radius;
	public double area;
	
	public void setRadius(int radius) {
		this.radius=radius;
		
	}
	public int getRadius() {
		return radius;
	}
	public void setStyle(BorderStyle style) {
		this.style=style;
		
	}
	public double areaOfCircle(){
		area=3.14*radius*radius;
		return area;
	}
	public BorderStyle getStyle() {
		return style;
	}
	
}
