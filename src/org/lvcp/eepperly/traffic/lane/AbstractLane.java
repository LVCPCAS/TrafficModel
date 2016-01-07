package org.lvcp.eepperly.traffic.lane;

import org.lvcp.eepperly.traffic.driver.Driver;
import org.lvcp.eepperly.traffic.vehicle.Vehicle;

import java.util.List;

/**
 * Created by eepperly16 on 12/9/15.
 */
public abstract class AbstractLane {
	protected List<Driver> drivers;
	protected List<Vehicle> vehicles; //vehicles associated with the drivers
	protected double length;

	protected AbstractLane comesFrom, goesTo, leftLane, rightLane;

	public void removeVehicle(Vehicle vehicle){
		vehicles.remove(vehicle);
		drivers.remove(vehicle.getDriver());
	}

	public void addVehicle(Vehicle vehicle){
		vehicles.add(vehicle);
		drivers.add(vehicle.getDriver());
	}
}
