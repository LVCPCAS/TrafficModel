package org.lvcp.eepperly.traffic.driver;

import org.lvcp.eepperly.traffic.simulation.Traffic;
import org.lvcp.eepperly.traffic.vehicle.Vehicle;

/**
 * Created by eepperly16 on 1/27/16.
 */
public class IDMDriver extends Driver {
	private double desiredSpacing;
	private double timeSpacing;

	public void advanceVehicle(Vehicle inFront){ //implemented first with euler's method
		double acceleration;
		if (null == inFront){
			acceleration = getFreeAcceleration(vehicle.getPosition(), vehicle.getVelocity());
		} else {
			acceleration = getAcceleration(vehicle.getPosition(), vehicle.getVelocity(), inFront);
		}
		vehicle.setPosition(vehicle.getPosition() + vehicle.getVelocity() * traffic.getDt());
		vehicle.setVelocity(vehicle.getVelocity() + acceleration * traffic.getDt());
	}
	public double desiredSpeed(){
		return lane.getSpeedLimit();
	}
	private double getAcceleration(double position, double velocity, Vehicle inFront){
		double spacing = inFront.getPosition() - inFront.getLength() - position;
		double velocityDifference = velocity - inFront.getVelocity();
		double distanceParam = desiredSpacing + velocity * timeSpacing +
				velocity * velocityDifference / 2 / Math.sqrt(vehicle.getMaxAccel()*vehicle.getMaxDecel());
		return vehicle.getMaxAccel()*(1-Math.pow(velocity/desiredSpeed(), Traffic.drivingExponent)-distanceParam*distanceParam/spacing/spacing);
	}
	private double getFreeAcceleration(double position, double velocity){
		return vehicle.getMaxAccel() * (1 - Math.pow(velocity/desiredSpeed(),Traffic.drivingExponent));
	}
}
