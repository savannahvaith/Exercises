package com.qa.garage;

public class Plane extends Vehicle{

	private int noOfWings; 
	
	public Plane(int weight, int topspeed, int noOfWheels, int noOfWings) { 
		super(weight, topspeed, noOfWheels);
		this.noOfWings = noOfWheels;
	}
	
	public int getWings() { 
		return noOfWings; 
	}
	
	public void setWings(int noOfWings) {
		this.noOfWings = noOfWings;
	}
		
	
	@Override
	public float calcBill() {
		return noOfWings * 55;
	}

	
}
