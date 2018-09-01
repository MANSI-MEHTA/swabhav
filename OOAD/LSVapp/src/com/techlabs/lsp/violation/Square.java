package com.techlabs.lsp.violation;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
		this.height = width;
	}

	@Override
	public void setHeight(int height) {
		this.width = height;
		this.height = height;
	}

}
