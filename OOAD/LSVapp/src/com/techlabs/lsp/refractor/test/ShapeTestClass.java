package com.techlabs.lsp.refractor.test;

import com.techlabs.lsp.refractor.Rectangle;

public class ShapeTestClass {
	public static void main(String args[]) {
		shoudNotChangeWidthWhenHeightIsChanged(new Rectangle(100, 150));

	}

	public static void shoudNotChangeWidthWhenHeightIsChanged(Rectangle r) {
		int beforeWidth = r.getWidth();
		r.setHeight(r.getHeight() + 10);
		int afterWidth = r.getWidth();
		System.out.println("before Width is " + beforeWidth + " And After width is " + afterWidth);

	}

}
