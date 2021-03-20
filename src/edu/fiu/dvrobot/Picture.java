/**
 * 
 */
package edu.fiu.dvrobot;

/**
 * @author Denisse Vadell
 *
 */
public class Picture {
	int size;
	int resolution;
	String format;
	
	
	/**
	 * Rotates the current picture
	 * 
	 */
	Picture rotates() {
		System.out.println("Rotating the picture...");
		return this;
	}
	
	/**
	 * Returns the current picture size
	 * @return int
	 */
	int getSize() {
		return size;
	}
	
	/**
	 * Sets the picture size
	 * 
	 */
	void setSize(int newSize) {
		size = newSize;
	}
	
	/**
	 * Returns the current picture resolution
	 * @return int
	 */
	int getResolution() {
		return resolution;
	}
	
	/**
	 * Sets the picture resolution
	 * 
	 */
	void setResolution(int newResolution) {
		size = newResolution;
	}
	
	/**
	 * Returns the current picture format
	 * @return String
	 */
	String getFormat() {
		return format;
	}
	
	/**
	 * Sets the picture format
	 * 
	 */
	void setFormat(int newFormat) {
		size = newFormat;
	}
}
