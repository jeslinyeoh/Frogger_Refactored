package com.game.player;


import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

/**
 * Handles and reflects player's input.
 * @author hcywy2
 *
 */
public class Frogger extends FroggerProperties{
	
	private int points = 0;
	int end = 0;
	
	private boolean stop = false;
	boolean noMove = false;
	boolean carDeath = false;
	boolean waterDeath = false;
	boolean changeScore = false;

	double w = 800;
	
	/**
     * Conditions the refresh rate of the AnimationTimer.
     */
	private long lastUpdate = 0;

	private MovementController moveCon;
	private DeathController deathCon;

	
	/**
	 * Initialises the initial Frogger image
	 * and calls {@link #initialiseClasses()}.
	 */
	public Frogger() {
		setImage(imgW1);
		setX(270);
		setY(679.8+ moveY);
		
		initialiseClasses();

	} // end of constructor
	
	
	/**
	 * Initialises {@link com.game.player.MovementController}
	 * and {@link com.game.player.DeathController} objects.
	 */
	public void initialiseClasses() {
		moveCon = new MovementController(this);
		deathCon = new DeathController(this);
	}
	
	
	/**
	 * Calls {@link com.game.player.MovementController}'s methods. 
	 * to handle player's input.
	 */
	public void checkKeyEntered() {
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event){
				moveCon.handleKeyPressed(event);

			}
		});
		
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				moveCon.handleKeyReleased(event);
			}
		});
	}
	
	
	/**
	 * Continuously handles player's input and checks if death conditions are met.
	 * Calls {@link #checkKeyEntered()}, 
	 * {@link com.game.player.DeathController#handleDeath(long)} and
	 * {@link com.game.player.DeathController#checkDeath()}
	 * Conditions were added to slow down the refresh rate of the AnimationTimer.
	 * @param now The timestamp of the current frame given in nanoseconds.
	 */
	@Override
	public void act(long now) {
		
		if(now - lastUpdate >= 35_000_000) {
			checkKeyEntered();
			
			if (getY() < 0 || getY() > 734) {
				setX(300);
				setY(679.8 + moveY);
			}
			
			if (getX() < 0) {
				move(moveY*2, 0);
			}

			
			if (getX() > 530) {
				move(-moveY*2, 0);
			}
			
			if (getX() == 240 && getY() == 82) {
				stop = true;
			}
			
			lastUpdate = now;
		}
		
		deathCon.checkDeath();
		deathCon.handleDeath(now);
		
		
	}
	
	
	/**
	 * Check if the score is changed.
	 * @return {@link Frogger#changeScore}.
	 */
	public boolean getChangeScore() {
		return changeScore;
	}
	
	
	/**
	 * Add points to current score.
	 * @param p Points to add.
	 */
	public void addPoints(int p) {
		points += p;
	}
	
	
	/**
	 * Checks if current score is more than 50 and minus points accordingly.
	 */
	public void minusPoints() {
		
		if(points > 50) {
			points -= 50;
		}
		
		else {
			points = 0;
		}
		
	}
	
	
	/**
	 * Sets {@link Frogger#points}.
	 * @param points New Points.
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	
	
	/**
	 * Gets {@link Frogger#points}.
	 */
	public int getPoints() {
		return points;
	}
	
	/**
	 * Check if the level is cleared.
	 * @return True when all 5 Froggers has reached the end point.
	 */
	public boolean getStop() {
		return end == 5;
	}
	
	
	/**
	 * Adds {@link Frogger#end}.
	 */
	public void addEnd() {
		end++;
	}
	


	
	
	
}