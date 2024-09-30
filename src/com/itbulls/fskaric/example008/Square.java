package com.itbulls.fskaric.example008;

public class Square extends Shape {

	protected int width;
	
	public Square () {
	}
	
	public Square (int width) {
		this.width = width;
    	checkSize(width);
	}
	
	@Override
	double calculateArea() {
		return width * width;
	}
}