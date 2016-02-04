package org.lvcp.eepperly.traffic.vehicle;

import org.lvcp.eepperly.traffic.lane.AbstractLane;
import org.lvcp.eepperly.traffic.driver.Driver;
import org.lvcp.eepperly.traffic.simulation.Traffic;

/**
 * Created by eepperly16 on 12/9/15.
 */
public abstract class Vehicle {
	protected Traffic traffic;

	protected double position;
	protected double velocity;

	protected double length;

	protected double maxAccel;
	protected double maxDecel;

	protected Driver driver;

	protected AbstractLane lane;

	public Vehicle(Traffic traffic, AbstractLane lane, Driver driver, double position, double velocity, double maxAccel, double maxDecel, double length){
		this.traffic = traffic;
		this.driver = driver;
		this.lane = lane;
		this.position = position;
		this.velocity = velocity;
		this.maxAccel = maxAccel;
		this.maxDecel = maxDecel;
		this.length = length;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setLane(AbstractLane newLane){
		this.lane.removeVehicle(this);
		newLane.addVehicle(this);
		this.lane = newLane;
	}

	public double getPosition() {
		return position;
	}

	public double getVelocity() {
		return velocity;
	}

	public double getLength() {
		return length;
	}

	public double getMaxAccel() {
		return maxAccel;
	}

	public double getMaxDecel() {
		return maxDecel;
	}

	@Override
	public String toString(){
		return "("+getPosition()+", "+getVelocity()+")";
	}
}
