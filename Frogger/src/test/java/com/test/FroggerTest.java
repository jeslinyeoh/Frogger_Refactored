package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.game.player.DeathController;
import com.game.player.Frogger;

import javafx.animation.AnimationTimer;
import javafx.embed.swing.JFXPanel;

public class FroggerTest {
	private JFXPanel panel = new JFXPanel();
	private Frogger frogger;
	private DeathController deathCon;
	private AnimationTimer animTimer;
	private long lastUpdate;

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
	
	
	@Test
	public void testAddPoints() {
		frogger = new Frogger();
		frogger.setPoints(50);
		frogger.addPoints(50);
		
		assertEquals(100, frogger.getPoints());
	}
	
	
	@Test
	public void testMinusPointsMoreThan50() {
		frogger = new Frogger();
		frogger.setPoints(60);
		frogger.minusPoints();
		
		assertEquals(10, frogger.getPoints());
	}
	
	
	@Test
	public void testMinusPointsLessThanOrEqualTo50() {
		frogger = new Frogger();
		frogger.setPoints(40);
		frogger.minusPoints();
		
		assertEquals(0, frogger.getPoints());
	}
	
	
}
