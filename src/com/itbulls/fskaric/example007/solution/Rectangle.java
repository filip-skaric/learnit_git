package com.itbulls.fskaric.example007.solution;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
       
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return height * width;
	}
}