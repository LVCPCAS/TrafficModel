package org.lvcp.eepperly.traffic.simulation;

import org.lvcp.eepperly.traffic.lane.AbstractLane;

import java.util.Iterator;
import java.util.List;

/**
 * Created by eepperly16 on 1/7/16.
 */
public class Traffic {
	private List<AbstractLane> lanes;
	private double dt;
	public static final double drivingExponent = 4;
	public void advance(){
		Iterator<AbstractLane> itr = lanes.iterator();
		while (itr.hasNext()){
			itr.next().advance();
		}
	}

	public double getDt() {
		return dt;
	}

	public double getDrivingExponent() {
		return drivingExponent;
	}
}
