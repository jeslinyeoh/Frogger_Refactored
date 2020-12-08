package com.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class PopUpInstructionsController {

	@FXML
	private void returnToMenu(ActionEvent event) {
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
		
		currStage.close();
	}
}
