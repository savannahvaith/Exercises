package com.qa.garage;

public class Car extends Vehicle {
	
	private int noOfEngines; 
	
	public Car(int weight, int topSpeed, int noOfWheels, int noOfEngines) {
		super(weight, topSpeed, noOfWheels); 
		this.noOfEngines = noOfEngines; 
	}
	
	public int getEngine() {
		return noOfEngines; 
	}
	
	public void setEngine(int noOfEngines) {
		this.noOfEngines = noOfEngines; 
	}

	@Override
	public float calcBill() {
		return 0;
	}

}