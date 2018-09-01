package com.techlabs.lsp.violation.test;

import com.techlabs.lsp.violation.Rectangle;
import com.techlabs.lsp.violation.Square;

public class ShapeTestClass {
	public static void main(String args[]) {
		shoudNotChangeWidthWhenHeightIsChanged(new Rectangle(100, 150));
		shoudNotChangeWidthWhenHeightIsChanged(new Square(200));

	}

	public static void shoudNotChangeWidthWhenHeightIsChanged(Rectangle r) {
		int beforeWidth = r.getWidth();
		r.setHeight(r.getHeight() + 10);
		int afterWidth = r.getWidth();
		System.out.println("before Width is " + beforeWidth + " And After width is " + afterWidth);

	}
}
