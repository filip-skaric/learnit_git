package com.itbulls.fskaric.example005;

public class Rectangle extends Shape {

	private int height; 
	
    //protected int width;
	
	
	Rectangle (int x, int y) {
		width = x;
		height = y;
	}
	
	Rectangle () {
	}
	
    public int calculateArea() {
        return width * height;
    }

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
		
	}
}