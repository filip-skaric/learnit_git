package com.itbulls.fskaric.example007.solution;

import java.util.List;

public class ShapeCalculator {
	
	public double calculateTotalArea(List<Shape> shapes) {
		
		 double totalArea = 0;
		for (Shape shape : shapes) {
			if (shapes == null || shapes.size() == 0) {
				return totalArea;
			}
			totalArea += shape.calculateArea();
		}
		return totalArea;
	}
}