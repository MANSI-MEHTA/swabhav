package com.techlabs.lsp.refractor;

public class Rectangle implements IPolygon{
	private int width;
	private int height;

	public Rectangle(int width, int height) {

		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width*height;
	}

}
