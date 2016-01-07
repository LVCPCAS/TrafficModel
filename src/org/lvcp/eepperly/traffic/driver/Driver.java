package org.lvcp.eepperly.traffic.driver;

import org.lvcp.eepperly.traffic.vehicle.Vehicle;

/**
 * Created by eepperly16 on 12/9/15.
 */
public abstract class Driver {
	protected Vehicle vehicle;
	public abstract void advanceVehicle();
}
