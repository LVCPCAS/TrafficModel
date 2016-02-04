package org.lvcp.eepperly.traffic.vehicle;

import org.lvcp.eepperly.traffic.driver.Driver;
import org.lvcp.eepperly.traffic.lane.AbstractLane;
import org.lvcp.eepperly.traffic.simulation.Traffic;

/**
 * Created by eepperly16 on 2/4/16.
 */
public class Car extends Vehicle {
	public Car(Traffic traffic, AbstractLane lane, Driver driver, double position, double velocity, double maxAccel, double maxDecel, double length) {
		super(traffic, lane, driver, position, velocity, maxAccel, maxDecel, length);
	}
}
