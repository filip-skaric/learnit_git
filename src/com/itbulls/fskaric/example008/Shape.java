package com.itbulls.fskaric.example008;

public abstract class Shape {
	
	abstract double calculateArea();
	
	public void checkSize (int a) {
		if (a <= 0) {
			throw new IllegalArgumentException();
		}
	}
}