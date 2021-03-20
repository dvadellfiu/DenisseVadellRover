/**
 * 
 */
package edu.fiu.dvrobot;

/**
 * @author mcdenisse
 *
 */
public class Camera {
	String name;
	String position;
	int angle;
	
	/**
	 * Takes a picture
	 * @return Picture
	 */
	Picture takePicture() {
		Picture pict = new Picture();
		return pict;
	}
	
	/**
	 * Zoom ins the camera lens
	 * 
	 */
	void zoomIn() {
		System.out.print("Getting closer...");
	}
	
	/**
	 * Zoom out the camera lens
	 * 
	 */
	void zoomOut() {
		System.out.print("Getting farther away...");
	}
	
	/**
	 * Returns the current camera name
	 * @return String
	 */
	String getName() {
		return name;
	}
	
	/**
	 * Sets the camera name
	 * 
	 */
	void setName(String newName) {
		name = newName;
	}
	
	/**
	 * Returns the current camera position
	 * @return String
	 */
	String getPosition() {
		return position;
	}
	
	/**
	 * Sets the camera Position
	 * 
	 */
	void setPosition(String newPosition) {
		name = newPosition;
	}
	
	/**
	 * Returns the current camera angle
	 * @return int
	 */
	int getAngle() {
		return angle;
	}
	
	/**
	 * Sets the camera Position
	 * 
	 */
	void setAngle(int newAngle) {
		angle = newAngle;
	}

}
