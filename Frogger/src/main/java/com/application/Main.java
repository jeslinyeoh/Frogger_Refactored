package com.application;


import java.io.IOException;

import com.menu.MenuView;

import javafx.application.Application;
import javafx.stage.Stage;


/**
 * 
 * Launches the application.
 * 
 * @author hcywy2
 *
 */
public class Main extends Application {
	
	MenuView menuV = new MenuView();
	
	/**
	 * Static variable storing the primaryStage.
	 */
	private static Stage pStage;

	
	/**
	 * The first function that is run when the program launches.
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
		
		primaryStage.setTitle("Frogger Arcade Game");
		primaryStage.setResizable(false);
		primaryStage.setX(455);
		primaryStage.setY(50);
		
		menuV.displayMenu(primaryStage);
		
	}
	
	
	/**
	 * Allows other classes to have access to the primaryStage.
	 * @return primaryStage
	 * 
	 * @see com.game.background.Background#mainStage
	 * @see com.game.level.ProceedNextLevelController#mainStage
	 * @see com.game.level.EndMessageController#mainStage
	 * 
	 */
	public static Stage getPrimaryStage() {
		return pStage;
	}
	

}
