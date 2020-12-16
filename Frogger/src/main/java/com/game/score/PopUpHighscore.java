package com.game.score;

import com.game.background.Background;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;


/**
 * Renders the Pop-up Highscore window.
 * @author hcywy2
 *
 */
public class PopUpHighscore {
	
	private String first, second, third;
	private Highscore highscore = new Highscore();
	private int n = 3;
	private Integer []hs = new Integer[n];
	private Background background;
	private Scene popupScene;
	private Stage popuphs;
	private static Stage pophsStage;
	
	

	/**
	 * Initialises {@link com.game.background.Background} object.
	 */
	public PopUpHighscore(Background background) {
		this.background = background;
	}
	
	
	/**
	 * Displays the Pop-up Highscore window.
	 * Gets called by {@link com.game.score.Score#createTimer()}.
	 */
	public void display(VBox layout) {

		popupScene = new Scene(layout, 380, 395);
		
		popuphs = new Stage();
		
		popuphs.setResizable(false);
		popuphs.setTitle("Highscore");
		popuphs.setX(545);
		popuphs.setY(150);
		
		pophsStage = popuphs;
		
		popuphs.setScene(popupScene);
		popuphs.show();
   
	}
	
	
	/**
	 * Initialises the Pop-up Highscore window's properties.
	 * This method gets highscores from file 
	 * and adds it to the Pop-up Highscore window.
	 * Gets called by {@link com.game.score.Score#createTimer()}.
	 */
	public void setRanking(VBox layout) {
		
		StackPane stack = new StackPane();
		Image hsBackground = new Image("file:Resources/Images/highscoreboard.png");
		ImageView hsV = new ImageView();
		hsV.setImage(hsBackground);
		hsV.setFitWidth(380);
		hsV.setFitHeight(400);
        hsV.setPreserveRatio(true);
        hsV.setSmooth(true);
        hsV.setCache(true);
 
		
		highscore.readFromFile(Background.getLevel());
		hs = highscore.getHighScores();
		
		first = Integer.toString(hs[0]);
		second = Integer.toString(hs[1]);
		third = Integer.toString(hs[2]);
		
		Text firsttxt = new Text();
		Text secondtxt = new Text();
		Text thirdtxt = new Text();
		
        setTextProperties(firsttxt, first, 38, Color.GOLD, Color.BLACK);
        setTextProperties(secondtxt, second, 34, Color.SILVER, Color.BLACK);
        setTextProperties(thirdtxt, third, 30, Color.SIENNA, Color.BLACK);
        
        
        stack.getChildren().addAll(hsV, firsttxt, secondtxt, thirdtxt);
        stack.setMargin(firsttxt, new Insets(0, 0, 147, 40));
        stack.setMargin(secondtxt, new Insets(0, 0, 15, 40));
        stack.setMargin(thirdtxt, new Insets(103, 0, 0, 40));
        
        layout.getChildren().addAll(stack);
		layout.setAlignment(Pos.CENTER);	
	}
	
	
	/**
	 * Sets some properties of the Text object.
	 * @param text Text object.
	 * @param str Text's content.
	 * @param fsize Font size.
	 * @param fill Text fill colour.
	 * @param stroke Stroke colour.
	 */
	public void setTextProperties(Text text, String str, int fsize, Color fill, Color stroke) {
		text.setText(str);
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, fsize));
        text.setFill(fill);
        text.setStroke(stroke);
	}
	
	
	/**
	 * Allows other classes to have access to the Pop-up Highscore Stage.
	 * @return pophsStage
	 */
	public static Stage gethsStage() {
		return pophsStage;
	}
	
	
	
}