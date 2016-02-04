package org.lvcp.eepperly.traffic.vehicle;

import org.lvcp.eepperly.traffic.driver.Driver;
import org.lvcp.eepperly.traffic.lane.AbstractLane;
import org.lvcp.eepperly.traffic.simulation.Traffic;

/**
 * Created by eepperly16 on 2/4/16.
 */
public class Car extends Vehicle {
	public Car(Traffic traffic, AbstractLane lane, Driver driver, double position, double velocity, double maxAccel, double maxDecel){
		this.traffic = traffic;
		this.driver = driver;
		this.lane = lane;
		this.position = position;
		this.velocity = velocity;
		this.maxAccel = maxAccel;
		this.maxDecel = maxDecel;
	}
}
