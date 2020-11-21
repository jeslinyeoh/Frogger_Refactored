package p4_group_8_repo;


import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.PopupWindow;

public class Background {
	MyStage background = new MyStage();
	Animal animal;
	Button startButton, insButton;
	PopupWindow popup;
	
	public void runGameBackground() {	    
	    
	    //Obstacle obstacle = new Obstacle("file:Images/truck1Right.png", 25, 25, 3);
		//Obstacle obstacle1 = new Obstacle("file:Images/truck2Right.png", 100, 100,2 );
		//Obstacle obstacle2 = new Obstacle("file:Images/truck1Right.png",0,  150, 1);


		BackgroundImage froggerback = new BackgroundImage("file:Images/iKogsKW.png");
	    
		background.add(froggerback);
		
		background.add(new Log("file:Images/log3.png", 150, 0, 166, 0.75));
		background.add(new Log("file:Images/log3.png", 150, 220, 166, 0.75));
		background.add(new Log("file:Images/log3.png", 150, 440, 166, 0.75));
		
		//background.add(new Log("file:Images/log3.png", 150, 0, 166, 0.75));
		
		background.add(new Log("file:Images/logs.png", 300, 0, 276, -2));
		background.add(new Log("file:Images/logs.png", 300, 400, 276, -2));
		
		//background.add(new Log("file:Images/logs.png", 300, 800, 276, -2));
		
		background.add(new Log("file:Images/log3.png", 150, 50, 329, 0.75));
		background.add(new Log("file:Images/log3.png", 150, 270, 329, 0.75));
		background.add(new Log("file:Images/log3.png", 150, 490, 329, 0.75));
		
		//background.add(new Log("file:Images/log3.png", 150, 570, 329, 0.75));
		
		background.add(new Turtle(500, 376, -1, 130, 130));
		background.add(new Turtle(300, 376, -1, 130, 130));
		background.add(new WetTurtle(700, 376, -1, 130, 130));
		background.add(new WetTurtle(600, 217, -1, 130, 130));
		background.add(new WetTurtle(400, 217, -1, 130, 130));
		background.add(new WetTurtle(200, 217, -1, 130, 130));
		
		
		//background.add(new Log("file:Images/log2.png", 200, 100, 1));
		//background.add(new Log("file:Images/log2.png", 0, 100, 1));
		//background.add(new Log("file:Images/log2.png", 100, 120, -1));
		//background.add(new Log("file:Images/log2.png", 200, 120, -1));
		//background.add(new Log("file:Images/log2.png", 100, 140, 1));
		//background.add(new Log("file:Images/log2.png", 200, 140, 1));
		//background.add(new Log("file:Images/log2.png", 100, 160, -1));
		//background.add(new Log("file:Images/log2.png", 300, 160, -1));
		//background.add(new Log("file:Images/log2.png", 100, 180, 1));
		//background.add(new Log("file:Images/log2.png", 200, 180, 1));
		//background.add(new Log("file:Images/log2.png", 100, 200, -1));
		//background.add(new Log("file:Images/log2.png", 200, 200, -1));
		//background.add(new Log("file:Images/log2.png", 100, 220, 1));
		//background.add(new Log("file:Images/log2.png", 200, 220, 1));
		//background.add(new Log("file:Images/log2.png", 400, 220, 1));
		//End end2 = new End();
		//End end3 = new End();
		//End end4 = new End();
		//End end5 = new End();
		
		
		background.add(new End(10,94));
		background.add(new End(130,94));
		background.add(new End(130 + 130-10,94));
		background.add(new End(130 + 2*(130-10)+1,94));
		background.add(new End(130 + 3*(130-10)+3,94));
		
		background.add(new Obstacle("file:Images/truck1"+"Right.png", 0, 649, 1, 120, 120));
		background.add(new Obstacle("file:Images/truck1"+"Right.png", 300, 649, 1, 120, 120));
		background.add(new Obstacle("file:Images/truck1"+"Right.png", 600, 649, 1, 120, 120));
		//background.add(new Obstacle("file:Images/truck1"+"Right.png", 720, 649, 1, 120, 120));
		background.add(new Obstacle("file:Images/car1Left.png", 100, 597, -1, 50, 50));
		background.add(new Obstacle("file:Images/car1Left.png", 250, 597, -1, 50, 50));
		background.add(new Obstacle("file:Images/car1Left.png", 400, 597, -1, 50, 50));
		background.add(new Obstacle("file:Images/car1Left.png", 550, 597, -1, 50, 50));
		background.add(new Obstacle("file:Images/truck2Right.png", 0, 540, 1, 200, 200));
		background.add(new Obstacle("file:Images/truck2Right.png", 500, 540, 1, 200, 200));
		background.add(new Obstacle("file:Images/car1Left.png", 500, 490, -5, 50, 50));
		background.add(new Digit(0, 30, 360, 25));
		//background.add(obstacle);
		//background.add(obstacle1);
		//background.add(obstacle2);
		
		
		background.start();
	}
	
	public void runMenuBackground() {
		
		BackgroundImage menuback = new BackgroundImage("file:Images/menubackground.gif");
	    
		background.add(menuback);
		
		startButton = new Button();
		insButton = new Button();
		
		Text text1 = new Text();
		text1.setText("Welcome to Frogger");
		text1.setX(70);
		text1.setY(120);
		text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 40));
		
		startButton.setLayoutX(240);
		startButton.setLayoutY(250);
		startButton.setText("Start");
		startButton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		startButton.setStyle("-fx-font-size: 20");
		
		insButton.setLayoutX(210);
		insButton.setLayoutY(300);
		insButton.setText("Instructions");
		insButton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		insButton.setStyle("-fx-font-size: 20");
		
		background.getChildren().addAll(startButton, insButton, text1);
		
		
	}
	
	
	
	
	
}
