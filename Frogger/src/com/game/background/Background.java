package com.game.background;


import com.application.ButtonController;
import com.application.MyStage;
import com.game.*;
import com.game.actor.Frogger;
import com.game.score.Score;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.PopupWindow;
import javafx.stage.Stage;

public class Background {
	public MyStage myStage = new MyStage();
	public Button startButton, insButton;
	public PopupWindow popup;
	public Score score;
	public Music music;
	private Frogger frogger;
	private Level level;
	private int lvl;
	
	
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
		
		startButtonCon.setButton("Start", 250, 250);
		insButtonCon.setButton("Instructions", 220, 300);
		
		myStage.getChildren().addAll(menubackV, startButton, insButton, froggerV);
		
		
	}
	
	
	public void runLevel(Stage stage, int lvl) {
		
		this.lvl = lvl;
		
		runGameBackground();
		
		level = new Level(stage, myStage, frogger);
		
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
		}
		
		
		myStage.add(new Digit(0, 30, 530, 25));
		myStage.add(frogger);
		myStage.start();
		music.startMusic();

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
