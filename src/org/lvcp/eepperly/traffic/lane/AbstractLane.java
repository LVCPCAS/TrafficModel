package org.lvcp.eepperly.traffic.lane;

import org.lvcp.eepperly.traffic.driver.Driver;
import org.lvcp.eepperly.traffic.simulation.Traffic;
import org.lvcp.eepperly.traffic.vehicle.Vehicle;

import java.util.Iterator;
import java.util.List;

/**
 * Created by eepperly16 on 12/9/15.
 */
public abstract class AbstractLane {
	protected Traffic traffic;

	protected List<Driver> drivers;
	protected List<Vehicle> vehicles; //vehicles associated with the drivers
	protected double length;

	protected double speedLimit;

	protected AbstractLane comesFrom, goesTo, leftLane, rightLane;

	public void removeVehicle(Vehicle vehicle){
		vehicles.remove(vehicle);
		drivers.remove(vehicle.getDriver());
	}

	public void addVehicle(Vehicle vehicle){
		vehicles.add(vehicle);
		drivers.add(vehicle.getDriver()); //adds vehicle to end
	}
	public void advance(){ //iterate "backwards" through cars advancing them
		int numCars = vehicles.size();
		for (int i=numCars-1;i>=1;i--){
			drivers.get(i).advanceVehicle(vehicles.get(i-1));
		}
		drivers.get(0).advanceVehicle(null); //currently advances vehicle first in lane assuming no car in front
	}

	public double getSpeedLimit() {
		return speedLimit;
	}

	public double getLength() {
		return length;
	}
}
