package org.lvcp.eepperly.traffic.lane;

import org.lvcp.eepperly.traffic.simulation.Traffic;

/**
 * Created by eepperly16 on 2/4/16.
 */
public class Lane extends AbstractLane {
	public Lane(Traffic traffic, double length, double speedLimit, AbstractLane comesFrom, AbstractLane goesTo, AbstractLane leftLane, AbstractLane rightLane) {
		super(traffic, length, speedLimit, comesFrom, goesTo, leftLane, rightLane);
	}
}
