package com.techlabs.lsp.refractor.test;

import com.techlabs.lsp.refractor.Rectangle;

public class RectangleTestClass {
	public static void main(String args[]) {
		Rectangle rectangle=new Rectangle(200,500);
		System.out.println(rectangle.calculateArea());
	}
}
