package com.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 * 
 * Controller class for PopUpInstructions.fxml.
 * @author hcywy2
 *
 */
public class PopUpInstructionsController {

	/**
	 * Closes the Instructions window.
	 * @param event Receives input from the "Back" button.
	 */
	@FXML
	private void returnToMenu(ActionEvent event) {
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
		
		currStage.close();
	}
}
