package com.techlabs.lsp.refractor.test;

import com.techlabs.lsp.refractor.Square;

public class SquareTestClass {
	public static void main(String args[]) {
		Square square = new Square(200);
		System.out.println(square.calculateArea());
	}
}
