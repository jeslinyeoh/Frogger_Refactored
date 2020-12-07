package com.game.level;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProceedNextLevelView {

	public void displayPopUp() throws IOException {
		Parent nlParent = FXMLLoader.load(getClass().getResource("ProceedNextLevel.fxml"));
		 
		Scene nlScene = new Scene(nlParent);
		 
		Stage popupNL = new Stage();
			
		popupNL.setResizable(false);
		popupNL.setTitle("Instructions");
		popupNL.setX(510);
		popupNL.setY(465);
	  
		popupNL.setScene(nlScene);
	  
		popupNL.show();
	}
}
