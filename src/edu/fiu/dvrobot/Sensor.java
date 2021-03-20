/**
 * 
 */
package edu.fiu.dvrobot;

/**
 * @author Denisse Vadell
 *
 */
public class Sensor {
	int range;
	
	/**
	 * Returns true if there is an obstacle ahead
	 * @return boolean
	 */
	boolean obstacleAhead() {
		return true;
	}
	
	/**
	 * Looks at the object ahead and identify a form from a predetermined list of forms
	 */
	void identifyForm() {
		System.out.println("Identifying the form...");
		
	}
	
	/**
	 * Returns the current range
	 * @return range
	 */
	int getRange() {
		return range;
	}

	/**
	 * Sets the current range
	 * 
	 */
	void setRange(int newRange) {
		range = newRange;
	}
}
