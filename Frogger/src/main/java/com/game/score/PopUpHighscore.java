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

public class PopUpHighscore {
	
	private String first, second, third;
	private Highscore highscore = new Highscore();
	private int n = 4;
	private Integer []hs = new Integer[n];
	private Background background;
	private Scene popupScene;
	private Stage popuphs;
	private static Stage pophsStage;
	
	
	public PopUpHighscore(Background background) {
		this.background = background;
	}
	
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
		
        setProperties(firsttxt, first, 38, Color.GOLD, Color.BLACK);
        setProperties(secondtxt, second, 34, Color.SILVER, Color.BLACK);
        setProperties(thirdtxt, third, 30, Color.SIENNA, Color.BLACK);
        
        
        stack.getChildren().addAll(hsV, firsttxt, secondtxt, thirdtxt);
        stack.setMargin(firsttxt, new Insets(0, 0, 147, 40));
        stack.setMargin(secondtxt, new Insets(0, 0, 15, 40));
        stack.setMargin(thirdtxt, new Insets(103, 0, 0, 40));
        
        layout.getChildren().addAll(stack);
		layout.setAlignment(Pos.CENTER);	
	}
	
	
	public void setProperties(Text text, String str, int fsize, Color fill, Color stroke) {
		text.setText(str);
        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, fsize));
        text.setFill(fill);
        text.setStroke(stroke);
	}
	
	
	public static Stage gethsStage() {
		return pophsStage;
	}
	
	
	
}