package org.lvcp.eepperly.traffic.driver;

import org.lvcp.eepperly.traffic.lane.AbstractLane;
import org.lvcp.eepperly.traffic.simulation.Traffic;
import org.lvcp.eepperly.traffic.vehicle.Vehicle;

/**
 * Created by eepperly16 on 12/9/15.
 */
public abstract class Driver {
	protected Traffic traffic;
	protected Vehicle vehicle;
	protected AbstractLane lane;
	public abstract void advanceVehicle(Vehicle inFront);
	public Driver(Traffic traffic, Vehicle vehicle, AbstractLane lane){
		this.traffic = traffic;
		this.vehicle = vehicle;
		this.lane = lane;
	}
}
