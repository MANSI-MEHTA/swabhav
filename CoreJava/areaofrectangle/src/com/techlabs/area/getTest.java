package com.techlabs.area;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getTest {

	@Test
	void test() {
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(5);
		rectangle.setBreadth(10);
		int setlength=rectangle.getLength();
		int setbreadth=rectangle.getbreadth();
		
		assertEquals(5,setlength);
		assertEquals(10,setbreadth);
		
		
	}
	@Test
	void checkparameter() {
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(50);
		rectangle.setBreadth(10);
		int one=1;
		int hundred=100;
		int length=rectangle.getLength();
		int breadth=rectangle.getbreadth();
		assertTrue(one<length && length<hundred);
		assertTrue(one<breadth && breadth<hundred);
		
		
	}
	void checkArea() {
		Rectangle rectangle=new Rectangle();
		rectangle.setLength(50);
		rectangle.setBreadth(10);
		int one=1;
		int thousand=100;
		int area=(int )rectangle.areaOfRectangle();
		assertTrue(one<area && area<thousand);
		
		
	}
	

}
