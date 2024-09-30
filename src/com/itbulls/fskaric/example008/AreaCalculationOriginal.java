package com.itbulls.fskaric.example008;

/**
 * In this file you will find violation of LSP. You need to refactor this code.
 */
public class AreaCalculationOriginal {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Area: " + rectangle.calculateArea());
    }
}

