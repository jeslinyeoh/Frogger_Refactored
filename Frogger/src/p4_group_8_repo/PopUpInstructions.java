package p4_group_8_repo;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class PopUpInstructions {
   
    
	public static void display() {
		
		Stage popupwindow = new Stage();
      
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Instructions");
      
      
		Label label1= new Label("Pop up window now displayed");
      
		VBox layout= new VBox(10);
     
      
		layout.getChildren().add(label1);
      
		layout.setAlignment(Pos.CENTER);
      
		Scene popupScene= new Scene(layout, 300, 250);
      
		popupwindow.setScene(popupScene);
      
		popupwindow.showAndWait();
       
	}

}