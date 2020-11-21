package p4_group_8_repo;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class Menu extends Application{
	
	
	Background bmenu = new Background();
	Background bgame = new Background();
	Animal animal;
	Scene menuScene, gameScene;
	boolean startGame = false;
	

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Frogger Arcade Game");
		
		
		bmenu.runMenuBackground();
		menuScene = new Scene(bmenu.background, 565, 455);

		primaryStage.setX(450);
		primaryStage.setY(50);
		primaryStage.setScene(menuScene);
		primaryStage.show();
		
		bgame.runGameBackground();
		animal = new Animal("file:Images/froggerUp.png");
		bgame.background.add(animal);
		gameScene = new Scene(bgame.background, 565, 800);
		 

		bmenu.startButton.setOnAction(e -> primaryStage.setScene(gameScene));
		bmenu.insButton.setOnAction(e -> PopUpInstructions.display());
		
		
	}
	

	
	
}
