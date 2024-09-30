package com.itbulls.fskaric.example004.birdProblem;

public class LiskovSubstitutionPrincipleDemo {

	public static void main(String[] args) {
		Bird[] birds = new Bird[] { new Crow(), new Sparrow(), new Ostrich() };
		for (Bird bird : birds) {
			bird.fly();
		}
	}
}