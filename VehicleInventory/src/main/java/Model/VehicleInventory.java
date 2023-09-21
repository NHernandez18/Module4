package Model;

import java.util.Arrays;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 19, 2023
 */
public class VehicleInventory {
	
	private String cars;

	public VehicleInventory(String cars) {
		super();
		this.cars = cars;
		setCars(cars);
	}

	public VehicleInventory() {
		super();
	}

	public String getCars() {
		return cars;
	}

	public void setCars(String cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "VehicleInventory [cars=" + cars + "]";
	}
	 
	public String toString2() {
		return cars + " has been removed from your inventory.";
	}

}
