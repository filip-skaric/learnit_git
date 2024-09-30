package com.itbulls.fskaric.example004.birdProblem;

public class Sparrow implements Bird {

	@Override
	public void fly() {
		System.out.println("Sparrow flies");
	}

	@Override
	public void eat() {
		System.out.println("Sparrow eats");
	}

}