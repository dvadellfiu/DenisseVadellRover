/**
 * 
 */
package edu.fiu.dvrobot;

/**
 * @author Denisse Vadell
 *
 */
public class Arm {
	
	String position;
	int angle;
	
	/**
	 * Picks an object in front of the arm
	 * 
	 */
	void pickObject() {
		System.out.println("Picking an object...");
	}
	
	/**
	 * Drops an object in front of the arm
	 * 
	 */
	void dropObject() {
		System.out.println("Droping an object...");
	}
	
	/**
	 * Extends the arm in the current position
	 * 
	 */
	void extend() {
		System.out.println("Stretching my arm...");
	}
	
	/**
	 * Retracts the arm in the current position
	 * 
	 */
	void retracts() {
		System.out.println("Stretching my arm...");
	}
	
	/**
	 * Returns the current angle degree
	 * @return int
	 */
	int getAngle() {
		return angle;
	}
	
	/**
	 * Returns the current angle degree
	 * 
	 */
	void setAngle(int newAngle) {
		angle = newAngle;
	}
}
