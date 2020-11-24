package com.menu;

import com.game.background.BackgroundImage;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class PopUpInstructions {
    
	public static void display() {
		
		Stage popupins = new Stage();
      
		popupins.initModality(Modality.APPLICATION_MODAL);
		popupins.setTitle("Instructions");
		popupins.setX(458);
		popupins.setY(170);
      
		BackgroundImage insBackground = new BackgroundImage("file:Images/Instructions.png");
		
		VBox layout = new VBox(10);
     
		layout.getChildren().add(insBackground);
		layout.setAlignment(Pos.CENTER);
      
		Scene popupScene = new Scene(layout, 550, 280);
      
		popupins.setScene(popupScene);
      
		popupins.showAndWait();
       
	}

}