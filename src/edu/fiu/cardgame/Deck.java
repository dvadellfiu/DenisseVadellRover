/**
 * 
 */
package edu.fiu.cardgame;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * This is my fancy Deck class
 * @author mcdenisse
 *
 */
public class Deck implements SelfCheckCapable {

	String brand;
	String material;
	
	/**
	 * This is the shuffle method - it takes the cards and
	 * changes the order
	 */
	void shuffle() {
	
		
	}
	
	/**
	 * A draw that picls the top card from the deck
	 * @return the card that is drawn
	 */
	Card draw() {
		return null;
	}
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "My deck";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.25);
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
