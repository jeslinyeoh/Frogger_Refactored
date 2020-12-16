package com.application;


import java.io.IOException;

import com.menu.MenuView;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * Launches the application.
 * @author hcywy2
 *
 */
public class Main extends Application {
	
	/**
	 * Static variable storing the primaryStage.
	 */
	private static Stage pStage;

	/**
	 * The first function that is launched when the program runs.
	 * @param args Unused.
	 */
	public static void main(String[] args) {
		launch(args); 
	}
	
	
	/**
	 * Called when the program is launched.
	 * Assigns primaryStage to a static variable 
	 * and displays the menu by calling {@link com.menu.MenuView#displayMenu(Stage)}. 
	 * @exception IOException On file not found. 
	 */
	public void start(Stage primaryStage) throws IOException {
		
		pStage = primaryStage;
		
		MenuView menuV = new MenuView();
		
		primaryStage.setTitle("Frogger Arcade Game");
		primaryStage.setResizable(false);
		primaryStage.setX(455);
		primaryStage.setY(50);
		
		menuV.displayMenu(primaryStage);
		
	}
	
	
	/**
	 * Allows other classes to have access to the primaryStage.
	 * @return primaryStage
	 */
	public static Stage getPrimaryStage() {
		return pStage;
	}
	

}
