package com.itbulls.fskaric.example005;

public class Square extends Shape {

    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.width = width;
    }

	Square (int x) {
		width = x;
	}
	
	Square () {
	}
	
    public int calculateArea() {
        return width * width;
    }
}
