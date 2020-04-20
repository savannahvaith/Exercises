package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	public Garage() {
	}

	// List of vehicles
	private List<Vehicle> vehicles = new ArrayList();

	// Add vehicles to the garage
	public boolean addVehicle(Vehicle v) {
		return this.vehicles.add(v);
	}

	// Remove vehicles from the garage
	public boolean removeVehicle(Vehicle v) {
		return this.vehicles.remove(v);
	}
	
	// Remove vehicle by type
	public void  removeVehicleType(Class<?> type) {
		List<Vehicle> toRemove = new ArrayList<>();
		for (Vehicle v : vehicles) {
			if (v.getClass() == type) {
				toRemove.add(v);
			}
		}
		vehicles.removeAll(toRemove);
	}
	
	
	// List all vehicles
	public void listAll() {
		for (Vehicle v : vehicles) {
			System.out.println(v.toString());
		}
	}

	// Empty garage
	public int emptyGarage() {
		this.vehicles.clear();
		return vehicles.size();
	}
	
	// Calculate bill 
	
	public float calcBill() {
		float initial = 0f; 
		
		return 0;
		
	}

}
