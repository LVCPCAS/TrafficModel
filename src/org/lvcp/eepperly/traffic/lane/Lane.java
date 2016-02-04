package org.lvcp.eepperly.traffic.lane;

import org.lvcp.eepperly.traffic.simulation.Traffic;

/**
 * Created by eepperly16 on 2/4/16.
 */
public class Lane extends AbstractLane {
	public Lane(Traffic traffic, double length, AbstractLane comesFrom, AbstractLane goesTo, AbstractLane leftLane, AbstractLane rightLane){
		this.traffic = traffic;
		this.length = length;
		this.comesFrom = comesFrom;
		this.goesTo = goesTo;
		this.leftLane = leftLane;
		this.rightLane = rightLane;
	}
}
