package com.menu;

import com.game.background.BackgroundImage;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.*;


public class PopUpInstructions {
    
	public static void display() {
		
		Image insBackground = new Image("file:Images/Instructions.png");
		ImageView insV = new ImageView();
		insV.setImage(insBackground);
		insV.setFitWidth(555);
		insV.setFitHeight(280);
        insV.setPreserveRatio(true);
        insV.setSmooth(true);
        insV.setCache(true);
		
		
		VBox layout = new VBox(10);
 
		layout.getChildren().add(insV);
		layout.setAlignment(Pos.CENTER);
  
		
		Scene popupScene = new Scene(layout, 550, 280);
		
		Stage popupins = new Stage();
		
		popupins.setResizable(false);
		popupins.setTitle("Instructions");
		popupins.setX(458);
		popupins.setY(170);
  
		popupins.setScene(popupScene);
  
		popupins.show();
   
       
	}

}