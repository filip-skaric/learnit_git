package com.itbulls.fskaric.example004.birdSolution;

public class Sparrow implements FlyingBird {

	@Override
	public void fly() {
		System.out.println("Sparrow flies");
	}

	@Override
	public void eat() {
		System.out.println("Sparrow eats");
	}

}