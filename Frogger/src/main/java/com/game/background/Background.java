package com.game.background;


import com.application.MyStage;
import com.game.actor.Frogger;
import com.game.level.Level;
import com.game.level.PopUpNextLevel;
import com.game.score.Score;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Background {
	public MyStage myStage = new MyStage();
	public Button startButton, insButton;

	private PopUpNextLevel popupNextLevel = new PopUpNextLevel();
	private Stage stage;
	private Score score;
	private Music music;
	private Frogger frogger;
	private Level level;
	private int lvl = 0;
	
	
	
	
	public void popNextLevel() {
		
		popupNextLevel.display();
		
		popupNextLevel.yesButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				
				score.getPopUpHighscore().closePopUp();
				myStage = new MyStage();
				lvl += 1;
				runLevel(lvl);
				Scene scene = new Scene(myStage, 565, 798);
				stage.setScene(scene);
				popupNextLevel.close();

			} 
			
		});	
		
		
		popupNextLevel.noButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				popupNextLevel.close();
				score.getPopUpHighscore().closePopUp();
				stage.close();
				Platform.exit();
			} 
			
		});	
		
	}
	
	
	
	
	public void runGameBackground() {	    
		
		BackgroundImage froggerback = new BackgroundImage("file:Images/froggerBackground.png");
		frogger = new Frogger();
		score = new Score(frogger, this);
		music = new Music(frogger);
		
		myStage.add(froggerback);
		myStage.add(new End(10,94));
		myStage.add(new End(130,94));
		myStage.add(new End(130 + 130-10,94));
		myStage.add(new End(130 + 2*(130-10)+1,94));
		myStage.add(new End(130 + 3*(130-10)+3,94));
		
	}
	
	
	public void runMenuBackground() {
		
		Image menuback = new Image("file:Images/menuBackground.gif");
		ImageView menubackV = new ImageView();
		
		menubackV.setImage(menuback);
		preserveImage(menubackV);
		
		
		Image froggerTxt = new Image("file:Images/froggerTxt.png");
		ImageView froggerV = new ImageView();
		
		froggerV.setImage(froggerTxt);
		froggerV.setFitWidth(500);
		froggerV.setFitHeight(450);
		preserveImage(froggerV);
		froggerV.setX(30);
		froggerV.setY(80);
		startButton = new Button();
		insButton = new Button();
		ButtonController startButtonCon = new ButtonController(startButton);
		ButtonController insButtonCon = new ButtonController(insButton);
		
		startButtonCon.setButton("Start", 250, 250, "pink, #b6e7c9", 20);
		insButtonCon.setButton("Instructions", 220, 300, "pink, #b6e7c9", 20);
		
		myStage.getChildren().addAll(menubackV, startButton, insButton, froggerV);
	
	}
	
	
	public void runLevel(int lvl) {
		
		this.lvl = lvl;
		
		runGameBackground();
		
		level = new Level(myStage);
		
		switch(lvl) {
		
			case 1: level.runLevel1();
				break;
				
			case 2: level.runLevel2();
				break;
			
			case 3: level.runLevel3();
				break;
				
			case 4: level.runLevel4();
				break;
				
			case 5: level.runLevel5();
				break;
				
			case 6: level.runLevel6();
				break;
				
			case 7: level.runLevel7();
				break;
				
			case 8: level.runLevel8();
				break;
				
			case 9: level.runLevel9();
				break;
				
			case 10: level.runLevel10();
				break;
		}
		
		
		myStage.add(new Digit(0, 30, 530, 25));
		myStage.add(frogger);
		myStage.start();
		startMusic();
	}
	
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	
	public void startMusic() {
		music.startMusic();
	}
	
	
	public void stopMusic(){
		music.stopMusic();
	}
	
	
	
	public void preserveImage(ImageView imgV) {
		imgV.setPreserveRatio(true);
		imgV.setSmooth(true);
		imgV.setCache(true);
	}

 	
 	public int getLevel() {
 		return lvl;
 	}
 	
	
}
