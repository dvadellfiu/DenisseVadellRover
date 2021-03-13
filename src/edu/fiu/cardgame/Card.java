/**
 * 
 */
package edu.fiu.cardgame;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author mcdenisse
 *
 */
public class Card implements SelfCheckCapable {
	
	int value;
	int suit;
	
	/**
	 * Shows the card on the display
	 */
	void show() {	
	}

	/**
	 * Flips the card so it can not be seen
	 */
	void flip() {
		
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
