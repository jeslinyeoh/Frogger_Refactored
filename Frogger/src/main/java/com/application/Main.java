package com.application;


import com.menu.MenuView;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	

	
	public static void main(String[] args) {
		launch(args); 
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		MenuView menuV = new MenuView();
		
		primaryStage.setTitle("Frogger Arcade Game");
		primaryStage.setResizable(false);
		primaryStage.setX(455);
		primaryStage.setY(50);
		
		menuV.displayMenu(primaryStage);
		
		
	}
}
