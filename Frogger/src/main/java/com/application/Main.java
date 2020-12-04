package com.application;

import java.io.File;
import java.util.List;

import com.game.actor.Frogger;
import com.game.background.Background;
import com.game.background.Digit;
import com.menu.*;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {
	
	MenuView menuView = new MenuView();
	Menu menu = new Menu();
	MenuController menuCon = new MenuController(menu, menuView);
	
	public static void main(String[] args) {
		launch(args); 
	}
	
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setResizable(false);
		menuCon.setStage(primaryStage);
		menuView.view(menuCon);
	}
}
