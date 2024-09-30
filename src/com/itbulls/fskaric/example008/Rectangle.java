package com.itbulls.fskaric.example008;

public class Rectangle extends Shape {

    protected int width;
    protected int height;
    
    public Rectangle () {
    }
    
    public Rectangle (int width, int height) {
    	this.width = width;
    	this.height = height;
    	checkSize(width);
    	checkSize(height);
    }
    
    public void setWidth(int width) {
        this.width = width;
    	checkSize(width);
    }

    public void setHeight(int height) {
        this.height = height;
    	checkSize(height);
    }

    public double calculateArea() {
        return width * height;
    }
}