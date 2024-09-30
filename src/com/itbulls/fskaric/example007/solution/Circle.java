package com.itbulls.fskaric.example007.solution;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

	@Override
	double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}