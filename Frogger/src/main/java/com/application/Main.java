package com.application;


import com.menu.*;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	private MenuView menuView = new MenuView();
	private Menu menu = new Menu();
	private MenuController menuCon = new MenuController(menu, menuView);
	
	public static void main(String[] args) {
		launch(args); 
	}
	
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setResizable(false);
		menuCon.setStage(primaryStage);
		menuView.view(menuCon);
	}
}
