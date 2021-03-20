/**
 * 
 */
package edu.fiu.dvrobot;

/**
 * @author mcdenisse
 *
 */
public class PowerUnit {
	int maxCapacity;
	int currentCapacity;
	
	/**
	 * Returns true if the battery is charging
	 * @return boolean
	 */
	boolean isCharging() {
		return true;
	}
	
	/**
	 * Returns the current percent of power
	 * @return int
	 */
	int getPctCharge() {
		return currentCapacity/maxCapacity * 100;
	}
	
	/** 
	 * Returns the current Max Capacity
	 * @return int
	 */
	int getMaxCapacity() {
		return maxCapacity;
	}
	
	/**
	 * Sets the battery Max Capacity
	 * 
	 */
	void setMaxCapacity(int newMaxCapacity) {
		maxCapacity = newMaxCapacity;
	}
	
	/** 
	 * Returns the current Capacity
	 * @return int
	 */
	int getCurrentCapacity() {
		return currentCapacity;
	}
	
	/**
	 * Sets the battery current Capacity
	 * 
	 */
	void setCurrentCapacity(int newCurrentCapacity) {
		currentCapacity = newCurrentCapacity;
	}

}
