package com.application;

import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;

import java.util.ArrayList;


/**
 * Parent class of all the game objects in {@link com.game.background}
 * except {@link com.game.background.Background} 
 * and {@link com.game.background.BackgroundImage}.
 * 
 */
public abstract class Actor extends ImageView{

	/**
	 * Moves the position of Frogger in the game.
	 * @param dx distance in x-axis.
	 * @param dy distance in y-axis.
	 */
    public void move(double dx, double dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    
    /**
     * Gets parent's object as a {@link com.application.World} object.
     */
    public World getWorld() {
        return (World) getParent();
    }
    
    
    /**
     * Checks if the current object is intersecting with other objects.
     * @param cls Other object's class.
     * @see com.game.player.DeathController#checkDeath()
     *
     */
    public <A extends Actor> java.util.List<A> getIntersectingObjects(java.lang.Class<A> cls){
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
            }
        }
        return someArray;
    }
    
    
    /**
     * To be overwritten by child classes.
     */
    public abstract void act(long now);

}
