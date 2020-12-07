package com.game.level;


import com.game.background.ButtonController;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class PopUpNextLevel {

	public Button yesButton = new Button();
	public Button noButton = new Button();
	private Stage popupNL;
	
	
	
	public void display() {
		
		Image popBackground = new Image("file:Images/popup_background.jpg");
		ImageView popV = new ImageView();
		popV.setImage(popBackground);
		popV.setFitWidth(500);
        popV.setPreserveRatio(true);
        popV.setSmooth(true);
        popV.setCache(true);
		
		Pane layout = new Pane();
		
		ButtonController yesButtonCon = new ButtonController(yesButton);
		ButtonController noButtonCon = new ButtonController(noButton);
		
		
		yesButtonCon.setButton("Yes", 350, 110, "pink, #b6e7c9", 35);
		noButtonCon.setButton("No", 220, 110, "pink, #b6e7c9", 35);
		
		Text proceedtxt = new Text();
		proceedtxt.setText("Proceed to next level?");
		proceedtxt.setX(50);
		proceedtxt.setY(60);
		proceedtxt.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 35));
		
		
		layout.getChildren().addAll(popV, proceedtxt, yesButton, noButton);
		

		
		
		Scene popupScene = new Scene(layout, 500, 200);
		
		popupNL = new Stage();
		
		popupNL.setTitle("Continue");
		popupNL.setX(485);
		popupNL.setY(500);
		
		popupNL.setResizable(false);
		popupNL.setScene(popupScene);
		popupNL.show();
       
	}
	
	
	public void close() {
		popupNL.close();
	}

}
