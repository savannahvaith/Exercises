package com.qa.garage;

/*
 * Abstract classes are mostly used to provide a base for sub class to extend & implement 
 * the abstract methods and override / use the implementation method in abstract class. 
 * An abstract class cannot be instantiated and therefore cannot be used directly. 
 */

public abstract class Vehicle {

	private int weight;
	private int topSpeed;
	private int noOfWheels;

	public Vehicle() {
		super();
	}

	public Vehicle(int weight, int topSpeed, int noOfWheels) {
		super();
		this.weight = weight;
		this.topSpeed = topSpeed;
		this.noOfWheels = noOfWheels;
	}

	/*
	 * Abstract method is declared without implementation - without {} If a class
	 * includes an abstract method, then the CLASS itself must be declared as
	 * abstract.
	 */
	public abstract float calcBill();

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	@Override
	public String toString() {
		return "Vehicle weight:" + weight + ", topSpeed:" + topSpeed + ", noOfWheels:" + noOfWheels;
	}
	
}
