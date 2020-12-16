package com.game.background;


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

/**
 * This class renders all the objects during the game 
 * including {@link com.game.score.Score} 
 * and {@link com.game.background.Music} objects.
 * 
 * @author hcywy2
 *
 */
public class Background extends World{
	
	/**
	 * Made public to be accessible 
	 * from the {@link com.game.level.Level} class.
	 *  
	 */
	public MyStage myStage = new MyStage();

	private ProceedNextLevelView proceedNLv = new ProceedNextLevelView();
	private EndMessageView endMsgV = new EndMessageView();
	
	private Stage stage;
	private Score score;
	private Music music;
	private Frogger frogger;
	private Level level;
	private Button restartButton = new Button();
	
	/**
	 * Keeps track of the current level across the application.
	 */
	private static int lvl = 1;
	
	
	
	/** 
	 * Display a pop-up window after clearing each level. 
	 * 
	 * If player is not on the last level, 
	 * prompts player to proceed to the next level; 
	 * else prompts player to play again. 
	 * 
	 * @see com.game.level.ProceedNextLevelController
	 * @see com.game.level.EndMessageController
	 * 
	 * This method is called by {@link com.game.score.Score#createTimer()}.
	 * @exception Exception On file not found. 
	 */
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

	
	/**
	 * Renders the same game background used in every level.
	 */
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
	
	
	/**
	 * Renders specific game objects according to their levels.
	 * @param l Level number to be run.
	 */
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
	
	
	/**
	 * Restarts the current level when the "Restart" button is pressed.
	 * @param event Receives input from the button.
	 */
	public void restartLevel(ActionEvent event) {
		
		Stage currStage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
	
	
	/**
	 * Sets this.{@link Background#stage} object.
	 */
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	
	/**
	 * Gets {@link Background#stage} object.
	 */
	public Stage getStage() {
		return stage;
	}
	
	
	/**
	 * Starts Music using {@link com.game.background.Music#startMusic()}.
	 */
	public void startMusic() {
		music.startMusic();
	}
	
	
	/**
	 * Stops Music using {@link com.game.background.Music#stopMusic()}.
	 */
	public void stopMusic(){
		music.stopMusic();
	}
	
 	
	/**
	 * Gets {@link com.game.score.Score} object.
	 */
 	public Score getScore() {
 		return score;
 	}
 	
 	
 	/**
 	 * Sets this.{@link com.game.background.MyStage} object.
 	 */
 	public void setMyStage(MyStage myStage) {
 		this.myStage = myStage;
 	}
 	
 	
 	/**
 	 * Gets {@link com.game.background.MyStage} object.
 	 */
 	public MyStage getMyStage() {
 		return myStage;
 	}

 	/**
 	 * Gets {@link Background#lvl}.
 	 */
	public static int getLevel() {
		return lvl;
	}

	
	/**
	 * Sets {@link Background#lvl}.
	 */
	public static void setLevel(int l) {
		lvl = l;
	}
 	
	
	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {	
	}
	
	
}
