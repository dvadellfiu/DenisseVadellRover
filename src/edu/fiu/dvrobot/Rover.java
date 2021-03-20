/**
 * 
 */
package edu.fiu.dvrobot;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author Denisse Vadell
 *
 */
public class Rover implements SelfCheckCapable {

	String name;
	int amountOfWheels;
	boolean isPaired;
	
	/**
	 * Moves the robot forward
	 * 
	 */
	void forward() {
		System.out.println("Going forward...");
	}
	
	/**
	 * Moves the robot backward
	 * 
	 */
	void backward() {
		System.out.println("Going backward...");
	}
	
	/**
	 * Makes the robot turn 90 degrees to the left
	 * 
	 */
	void turnleft() {
		System.out.println("Turning left...");	
	}
	
	/**
	 * Makes the robot turn 90 degrees to the right
	 * 
	 */
	void turnright() {
		System.out.println("Turning right...");	
	}
	
	/**
	 * Makes the robot rotate 180 degrees
	 * 
	 */
	void rotate(int degrees) {
		System.out.println("Rotating... " + degrees + "degrees");
	}
	
	/**
	 * Turns on the robot On
	 * 
	 */
	void powerOn() {
		System.out.println("Starting up");
	}
	
	/**
	 * Turns on the robot Off
	 * 
	 */
	void powerOff() {
		System.out.println("Shutting off");
	}
	
	/**
	 * Moves the robot to a specific position
	 * 
	 */
	void moveToPosition(int latitude, int longitude) {
		System.out.println("Getting to " + latitude + "," + longitude);
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
