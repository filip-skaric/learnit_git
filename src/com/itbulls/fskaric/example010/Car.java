package com.itbulls.fskaric.example010;

public class Car {
    
	private Engine electricEngine;
	private Engine gasolineEngince;

    public Car() {
        this.electricEngine = new ElectricEngine();
        this.gasolineEngince = new GasolineEngine();
    }

    public void start() {
    	electricEngine.start();
    	gasolineEngince.start();
    }
}