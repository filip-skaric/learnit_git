package com.itbulls.fskaric.example009;

//Classes implementing the segregated interfaces
public class Employee implements Workable, Eatable, Sleepable {
  
	public void work() {
		System.out.println("Employee is working");
	}

	@Override
	public void eat() {
		System.out.println("Employee is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Employee is sleeping");
	}
}