package p4_group_8_repo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class Menu extends Application{
	
	Button startButton;
	Background bmenu = new Background();
	

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Frogger Arcade Game");
		BackgroundImage img = new BackgroundImage("file:menubackground.gif");
		
		
		bmenu.runMenuBackground();

		Scene menuScene = new Scene(bmenu.background, 600, 800);
		primaryStage.setScene(menuScene);
		primaryStage.show();
		
		
		
		
	}
}
