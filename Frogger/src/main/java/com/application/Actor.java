package com.application;

import javafx.scene.image.ImageView;

import java.util.ArrayList;


/**
 * Parent class of all the game objects in {@link com.game.background}
 * except {@link com.game.background.Background}
 * and {@link com.game.background.MyStage}. 
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
     * @param <A> Class that extends Actor.
     * @param cls Other object's class.
     * @return ArrayList containing intersecting objects.
     * 
     * @see com.game.player.DeathController#checkDeath()
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
     * Checks if the current object is intersecting with other objects.
     * @param <A> Class that extends Actor.
     * @param cls Other object's class.
     * @return The first object of the intersecting object ArrayList.
     * 
     * @see com.game.player.DeathController#checkDeath()
     */
    public <A extends Actor> A getOneIntersectingObject(java.lang.Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        for (A actor: getWorld().getObjects(cls)) {
            if (actor != this && actor.intersects(this.getBoundsInLocal())) {
                someArray.add(actor);
                break;
            }
        }
        return someArray.get(0);
    }
    
    
    /**
     * To be overwritten by child classes.
     */
    public abstract void act(long now);

}
