package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		Garage g = new Garage();
		Car c = new Car(1,2,3,4); 
		g.addVehicle(c);
		g.removeVehicleType(Car.class);
		g.listAll();
		System.out.println("________________");
		g.addVehicle(new Plane(1,2,3,400));
		g.addVehicle(new Plane(1,2,3,400));
		g.addVehicle(new Car(1,2,3,400));
		g.addVehicle(new Car(1,2,3,400));
		g.listAll();

	}
}
