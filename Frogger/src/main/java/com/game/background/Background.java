package com.game.background;


import com.application.MyStage;
import com.application.World;
import com.game.level.EndMessageView;
import com.game.level.Level;
import com.game.level.ProceedNextLevelView;
import com.game.player.Frogger;
import com.game.score.Score;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Background extends World{
	public MyStage myStage = new MyStage();

	private ProceedNextLevelView proceedNLv = new ProceedNextLevelView();
	private EndMessageView endMsgV = new EndMessageView();
	
	private Stage stage;
	private Score score;
	private Music music;
	private Frogger frogger;
	private Level level;
	private Button restartButton = new Button();
	
	private static int lvl = 1;
	
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
			
		}
	}

	
	
	public void runGameBackground() {	    
		
		BackgroundImage froggerback = new BackgroundImage("file:Resources/Images/froggerBackground.png");
		frogger = new Frogger();
		score = new Score(frogger, this);
		music = new Music(frogger);
		
		restartButton.setText("Restart");
		restartButton.setStyle("-fx-background-color: red, deeppink; "
				+ "-fx-text-fill: aqua; "
				+ "-fx-font-size: 18;");
		
		restartButton.setLayoutX(475);
		restartButton.setLayoutY(755);
		
		restartButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				restartLevel(event);
			} 
			
		});	
		
		
		myStage.add(froggerback);
		myStage.getChildren().add(restartButton);
		myStage.add(new End(10,94));
		myStage.add(new End(130,94));
		myStage.add(new End(130 + 130-10,94));
		myStage.add(new End(130 + 2*(130-10)+1,94));
		myStage.add(new End(130 + 3*(130-10)+3,94));
		
		myStage.add(new Digit(0, 30, 530, 25));
		startMusic();
		
	}
	
	
	public void runLevel(int l) {
		
		lvl = l;
		
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
		
		myStage.add(frogger);
		myStage.start();

		
	}
	
	
	public void restartLevel(ActionEvent event) {
		
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
		stopMusic();
		myStage.stop();
		score.stop();

		myStage = new MyStage();
		runGameBackground();
		runLevel(lvl);
		
		Scene gameScene = new Scene(myStage, 565, 798);
		currStage.setScene(gameScene);
		currStage.show();
		
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
	
 	
 	public Score getScore() {
 		return score;
 	}
 	
 	public void setMyStage(MyStage myStage) {
 		this.myStage = myStage;
 	}
 	
 	public MyStage getMyStage() {
 		return myStage;
 	}


	public static int getLevel() {
		return lvl;
	}


	public static void setLevel(int l) {
		lvl = l;
	}
 	
	
}
