package com.game.background;


import java.io.IOException;

import com.application.MyStage;
import com.application.World;
import com.game.level.EndMessageView;
import com.game.level.Level;
import com.game.level.PopUpNextLevel;
import com.game.level.ProceedNextLevelController;
import com.game.level.ProceedNextLevelView;
import com.game.player.Frogger;
import com.game.score.Score;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Background extends World{
	public MyStage myStage = new MyStage();

	private PopUpNextLevel popupNextLevel = new PopUpNextLevel();
	private ProceedNextLevelView proceedNLv = new ProceedNextLevelView();
	private EndMessageView endMsgV = new EndMessageView();
	
	private Stage stage;
	private Score score;
	private Music music;
	private Frogger frogger;
	private Level level;
	private int lvl = 0;
	
	@Override
	public void act(long now) {	
	}
	
	
	/** display pop up window to access next level if player no on last level 
	 *  display "End of Game"
	 * @throws Exception 
	 * @see com.game.score.Score*/
	public void checkNextLevel() throws Exception {
		
		if(lvl < 10) {	
			Stage popupNL = new Stage();
			
			popupNL.setResizable(false);
			popupNL.setTitle("Instructions");
			popupNL.setX(510);
			popupNL.setY(465);
			proceedNLv.displayPopUp(popupNL);
			
		}
		
		else {
			
			Stage endS = new Stage();
			
			endS.setResizable(false);
			endS.setTitle("End of Game");
			endS.setX(510);
			endS.setY(465);
			
			endMsgV.displayPopUp(endS);
			
			/*
			Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setTitle("End");
    		alert.setX(555);
    		alert.setY(460);
    		alert.setHeaderText("End of Game");
    		alert.setContentText("Thank you for Playing!");
    		alert.show();*/
		}
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
	
	public Stage getStage() {
		return stage;
	}
	
	
	public void startMusic() {
		music.startMusic();
	}
	
	
	public void stopMusic(){
		music.stopMusic();
	}
	
 	
 	public int getLevel() {
 		return lvl;
 	}
 	
 	public void setLevel(int lvl) {
 		this.lvl = lvl;
 	}
 	
 	public Score getScore() {
 		return score;
 	}
 	
 	public void setMyStage(MyStage myStage) {
 		this.myStage = myStage;
 	}
 	
 	public MyStage getMyStage() {
 		return myStage;
 	}
 	
	
}
