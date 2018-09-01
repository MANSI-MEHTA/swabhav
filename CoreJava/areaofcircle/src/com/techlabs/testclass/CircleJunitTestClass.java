package com.techlabs.testclass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.circle.BorderStyle;
import com.techlabs.circle.Circle;

class CircleJunitTestClass {

	@Test
	public void checkParameter() {
		Circle c=new Circle();
		c.setRadius(20);
		int radius=c.getRadius();
		assertEquals(20,radius);
	}
	@Test
	public void checkArea() {
		Circle c=new Circle();
		c.setRadius(20);
		int area=(int)c.areaOfCircle();
		assertEquals(1256,area);
	}
	@Test
	public void checkBorderStyle() {
		BorderStyle border=BorderStyle.SOLID;
		Circle c=new Circle();
		c.setStyle(border);
		BorderStyle b=c.getStyle();
		assertEquals(BorderStyle.SOLID,b);
		}

}
