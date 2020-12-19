package com.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.game.player.Frogger;

import javafx.embed.swing.JFXPanel;

/**
 * 
 * Tests {@link com.game.player.Frogger} class.
 * 
 * @author hcywy2
 *
 */
public class FroggerTest {
	/**
	 * Initialises internal graphics.
	 */
	private JFXPanel panel = new JFXPanel();
	private Frogger frogger;

	
	/**
	 * Tests if the level is cleared when 5 Froggers has reached the end point.
	 */
	@Test
	public void testGameEnd() {
        frogger = new Frogger();
        
        frogger.addEnd();
		frogger.addEnd();
		frogger.addEnd();
		frogger.addEnd();
		frogger.addEnd();
		
		assertEquals(true,frogger.getStop());
    }
	
	
	/**
	 * Tests the adding points mechanism.
	 */
	@Test
	public void testAddPoints() {
		frogger = new Frogger();
		frogger.setPoints(50);
		frogger.addPoints(50);
		
		assertEquals(100, frogger.getPoints());
	}
	
	
	/**
	 * Tests if the points are deducted accordingly 
	 * when the current score is more than 50.
	 */
	@Test
	public void testMinusPointsMoreThan50() {
		frogger = new Frogger();
		frogger.setPoints(60);
		frogger.minusPoints();
		
		assertEquals(10, frogger.getPoints());
	}
	
	
	/**
	 * Tests if the current score is lesser than or equal to 50, 
	 * then the score will be assigned to 0.
	 */
	@Test
	public void testMinusPointsNotMoreThan50() {
		frogger = new Frogger();
		frogger.setPoints(40);
		frogger.minusPoints();
		
		assertEquals(0, frogger.getPoints());
	}
	
	
}
