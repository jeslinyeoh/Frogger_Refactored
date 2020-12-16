package com.application;


import java.util.ArrayList;
import java.util.List;

import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


/**
 * Parent class of {@link com.game.background.Background}.
 * 
 */
public abstract class World extends Pane {
    private AnimationTimer timer;
    private long lastUpdate = 0;
    
    /**
	 * Initialises a listener to make sure that the application
	 * detects the player's input and handles it accordingly.
	 */
    public World() {
    	
    	sceneProperty().addListener(new ChangeListener<Scene>() {
    		
    		@Override
    		public void changed(ObservableValue<? extends Scene> observable, Scene oldValue, Scene newValue) {
    			if (newValue != null) {
    				newValue.setOnKeyReleased(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyReleased() != null) 
								getOnKeyReleased().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyReleased() != null) {
									anActor.getOnKeyReleased().handle(event);
								}
							}
						}
						
					});
					
					newValue.setOnKeyPressed(new EventHandler<KeyEvent>() {

						@Override
						public void handle(KeyEvent event) {
							if(getOnKeyPressed() != null) 
								getOnKeyPressed().handle(event);
							List<Actor> myActors = getObjects(Actor.class);
							for (Actor anActor: myActors) {
								if (anActor.getOnKeyPressed() != null) {
									anActor.getOnKeyPressed().handle(event);
								}
							}
						}
						
					});
    			}
				
    		}
    		
    	});
    }

    
    /**
     * Calls the act() method in every frame when it is started. 
     * Conditions were added to slow down the refresh rate of the AnimationTimer.
     */
    public void createTimer() {
        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	
            	if(now - lastUpdate >= 1_000_000) {
            		act(now);
            		List<Actor> actors = getObjects(Actor.class);
                
            		for (Actor anActor: actors) {
            			anActor.act(now);
            		}
            		
            		lastUpdate = now;
            	}
            }
        };
    }

    /**
     * Starts the AnimationTimer.
     */
    public void start() {
    	createTimer();
        timer.start();
    }

    
    /**
     * Stops the AnimationTimer.
     */
    public void stop() {
        timer.stop();
    }
    
    
    /**
     * Adds child object.
     * @param actor Object of classes that inherits the {@link com.application.Actor} class.
     */
    public void add(Actor actor) {
        getChildren().add(actor);
    }

    
    /**
     * Removes child object.
     * @param actor Object of classes that inherits the {@link com.application.Actor} class.
     */
    public void remove(Actor actor) {
        getChildren().remove(actor);
    }

    
    /**
     * Get an ArrayList object of a class.
     * @see #World()
     * @see #createTimer()
     * @return Array containing {@link com.application.Actor} objects.
     */
    public <A extends Actor> List<A> getObjects(Class<A> cls) {
        ArrayList<A> someArray = new ArrayList<A>();
        
        for (Node n: getChildren()) {
            if (cls.isInstance(n)) {
                someArray.add((A)n);
            }
        }
        
        return someArray;
    }

    
    /**
     * To be overwritten by child classes.
     */
    public abstract void act(long now);
}
