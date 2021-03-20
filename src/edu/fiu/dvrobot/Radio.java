/**
 * 
 */
package edu.fiu.dvrobot;

/**
 * @author Denisse Vadell
 *
 */
public class Radio {
	int frequency;
	
	/**
	 * Receives and return a message
	 * @return String
	 */
	String receiveMessage() {
		return "This is a message...";
	}
	
	/**
	 * Sends a message
	 * 
	 */
	void sendMessage(String message) {
		System.out.println("Sending message...");
	}
	
	/**
	 * Gets the current frecuency
	 * @return int
	 */
	int getFrecuency() {
		return frequency;
	}
	
	/**
	 * Sets the frequency
	 * 
	 */
	void setFrequency(int newFrequency) {
		frequency = newFrequency;
	}
}
