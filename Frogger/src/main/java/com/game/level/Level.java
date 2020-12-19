package com.game.level;

import com.game.background.Log;
import com.game.background.MyStage;
import com.game.background.TurtleA;
import com.game.background.TurtleB;
import com.game.background.Vehicle;

/**
 * 
 * Renders specific level's background objects.
 * 
 * @author hcywy2
 *
 */
public class Level {
	private MyStage myStage;

	
	/**
	 * Initialises this.{@link com.game.background.MyStage} object.
	 */
	public Level(MyStage myStage){
		this.myStage = myStage;
	}
	

	/**
	 * Adds all the movable background objects into the game for Level 1. 
	 */
	public void runLevel1() {
		
		myStage.add(new Log("file:Resources/Images/log3.png", 0, 170, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 220, 170, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 440, 170, 1, 150));
		
		myStage.add(new TurtleB(600, 217, -1, 130, 130));
		myStage.add(new TurtleA(400, 217, -1, 130, 130));
		myStage.add(new TurtleB(200, 217, -1, 130, 130));
		
		myStage.add(new Log("file:Resources/Images/logs.png", 0, 280, -2, 300));
		myStage.add(new Log("file:Resources/Images/logs.png", 400, 280, -2, 300));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 0, 329, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 270, 329, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 490, 329, 1, 150));
		
		myStage.add(new TurtleA(100, 376, -1, 130, 130));
		myStage.add(new TurtleA(300, 376, -1, 130, 130));
		myStage.add(new TurtleB(550, 376, -1, 130, 130));
		
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 500, 490, -5, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck2Right.png", 0, 540, 1, 200, 200));
		myStage.add(new Vehicle("file:Resources/Images/truck2Right.png", 500, 540, 1, 200, 200));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 100, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 250, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 400, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 550, 597, -1, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 0, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 300, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 600, 649, 1, 120, 120));
	
	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 2. 
	 */
	public void runLevel2() {
		
		myStage.add(new Log("file:Resources/Images/log3.png", 0, 170, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 220, 170, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 440, 170, 1, 150));
		
		myStage.add(new Log("file:Resources/Images/logs.png", 0, 222, -2, 300));
		myStage.add(new Log("file:Resources/Images/logs.png", 400, 222, -2, 300));
		
		myStage.add(new TurtleB(200, 270, -1, 130, 130));
		myStage.add(new TurtleA(400, 270, -1, 130, 130));
		myStage.add(new TurtleB(600, 270, -1, 130, 130));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 50, 329, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 270, 329, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 490, 329, 1, 150));
		
		myStage.add(new TurtleA(300, 376, -1, 130, 130));
		myStage.add(new TurtleB(500, 376, -1, 130, 130));
		myStage.add(new TurtleA(700, 376, -1, 130, 130));
		
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 100, 490, -1, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 250, 490, -1, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 400, 490, -1, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 550, 490, -1, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck2Right.png", 0, 540, 1, 200, 200));
		myStage.add(new Vehicle("file:Resources/Images/truck2Right.png", 500, 540, 1, 200, 200));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 500, 597, -6, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 0, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 300, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 600, 649, 1, 120, 120));
	
	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 3. 
	 */
	public void runLevel3() {
		
		myStage.add(new TurtleA(200, 165, 2, 130, 130));
		myStage.add(new TurtleB(400, 165, 2, 130, 130));
		myStage.add(new TurtleA(600, 165, 2, 130, 130));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 0, 225, -2, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 220, 225, -2, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 440, 225, -2, 150));
		
		myStage.add(new Log("file:Resources/Images/logs.png", 0, 275, 1, 300));
		myStage.add(new Log("file:Resources/Images/logs.png", 400, 275, 1, 300));
		
		myStage.add(new TurtleA(150, 320, 2, 130, 130));
		myStage.add(new TurtleB(350, 320, 2, 130, 130));
		myStage.add(new TurtleA(550, 320, 2, 130, 130));
		
		myStage.add(new TurtleA(100, 372, -1, 130, 130));
		myStage.add(new TurtleA(300, 372, -1, 130, 130));
		myStage.add(new TurtleB(500, 372, -1, 130, 130));
		
		
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 100, 490, 3, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 400, 490, 3, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck2Left.png", 0, 540, -2, 200, 200));
		myStage.add(new Vehicle("file:Resources/Images/truck2Left.png", 250, 540, -2, 200, 200));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 500, 597, 6, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Left.png", 0, 649, -1, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Left.png", 250, 649, -1, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Left.png", 650, 649, -1, 120, 120));
	
	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 4. 
	 */
	public void runLevel4() {
		
		myStage.add(new TurtleA(200, 165, 2, 130, 130));
		myStage.add(new TurtleB(400, 165, 2, 130, 130));
		myStage.add(new TurtleA(600, 165, 2, 130, 130));
		
		myStage.add(new TurtleA(100, 220, -1, 130, 130));
		myStage.add(new TurtleB(350, 220, -1, 130, 130));
		myStage.add(new TurtleB(550, 220, -1, 130, 130));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 0, 277, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 220, 277, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 450, 277, 1, 150));
		
		myStage.add(new TurtleA(200, 320, -1, 130, 130));
		myStage.add(new TurtleB(400, 320, -1, 130, 130));
		myStage.add(new TurtleA(600, 320, -1, 130, 130));
		
		myStage.add(new TurtleA(100, 372, 2, 130, 130));
		myStage.add(new TurtleA(300, 372, 2, 130, 130));
		myStage.add(new TurtleB(700, 372, 2, 130, 130));
		
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 100, 490, -6, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 100, 540, 5, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 400, 540, 5, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck2Left.png", 0, 597, -2, 200, 200));
		myStage.add(new Vehicle("file:Resources/Images/truck2Left.png", 250, 597, -2, 200, 200));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 0, 650, 3, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck2Right.png", 300, 650, 3, 200, 200));
	
	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 5. 
	 */
	public void runLevel5() {
		
		myStage.add(new TurtleA(200, 165, 2, 130, 130));
		myStage.add(new TurtleB(400, 165, 2, 130, 130));
		myStage.add(new TurtleA(600, 165, 2, 130, 130));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 0, 222, -2, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 350, 222, -2, 150));
		
		myStage.add(new TurtleB(150, 267, 2, 130, 130));
		myStage.add(new TurtleB(350, 267, 2, 130, 130));
		myStage.add(new TurtleA(550, 267, 2, 130, 130));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 100, 325, -2, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 400, 325, -2, 150));
		
		myStage.add(new TurtleA(100, 372, 2, 130, 130));
		myStage.add(new TurtleA(300, 372, 2, 130, 130));
		myStage.add(new TurtleB(500, 372, 2, 130, 130));
		
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 100, 490, -6, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 300, 490, -6, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 0, 540, 3, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 250, 540, 3, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 650, 540, 3, 120, 120));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 200, 597, -6, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 50, 650, 3, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck2Right.png", 300, 650, 3, 200, 200));
	
	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 6. 
	 */
	public void runLevel6() {
		
		myStage.add(new TurtleA(100, 165, -1, 130, 130));
		myStage.add(new TurtleB(300, 165, -1, 130, 130));
		myStage.add(new TurtleA(550, 165, -1, 130, 130));
		
		myStage.add(new TurtleA(200, 220, 2, 130, 130));
		myStage.add(new TurtleA(400, 220, 2, 130, 130));
		myStage.add(new TurtleB(600, 220, 2, 130, 130));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 0, 285, -2, 300));
		myStage.add(new Log("file:Resources/Images/log3.png", 400, 285, -2, 300));

		
		myStage.add(new TurtleA(100, 372, 2, 130, 130));
		myStage.add(new TurtleB(300, 372, 2, 130, 130));
		myStage.add(new TurtleA(500, 372, 2, 130, 130));
		
		
		myStage.add(new Vehicle("file:Resources/Images/truck2Right.png", 0, 500, 3.5, 350, 350));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 100, 590, -3, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 300, 590, -3, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 500, 590, -3, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 0, 649, 2.5, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 250, 649, 2.5, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 650, 649, 2.5, 120, 120));
	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 7. 
	 */
	public void runLevel7() {

		myStage.add(new TurtleA(135, 170, 2, 220, 260));
		myStage.add(new TurtleB(360, 170, 2, 220, 260));
		myStage.add(new TurtleA(580, 170, 2, 220, 260));
		
		myStage.add(new Log("file:Resources/Images/logs.png", 0, 280, -2, 300));
		myStage.add(new Log("file:Resources/Images/logs.png", 400, 280, -2, 300));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 50, 329, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 270, 329, 1, 150));
		myStage.add(new Log("file:Resources/Images/log3.png", 490, 329, 1, 150));
		
		myStage.add(new TurtleB(300, 376, -1, 130, 130));
		myStage.add(new TurtleA(500, 376, -1, 130, 130));
		myStage.add(new TurtleA(700, 376, -1, 130, 130));
		
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 100, 485, -2.5, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 250, 485, -2.5, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 500, 485, -2.5, 50, 50));
	
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 500, 533, 3.5, 60, 60));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 500, 560, -5.5, 100, 100));
		
		myStage.add(new Vehicle("file:Resources/Images/truck2Right.png", 0, 649, 2, 200, 200));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 500, 649, 2, 120, 120));

	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 8. 
	 */
	public void runLevel8() {

		myStage.add(new TurtleA(150, 170, 2, 220, 260));
		myStage.add(new TurtleB(450, 170, 2, 220, 260));
		
		myStage.add(new TurtleB(100, 267, -1, 130, 130));
		myStage.add(new TurtleB(350, 267, -1, 130, 130));
		myStage.add(new TurtleA(550, 267, -1, 130, 130));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 150, 330, 1, 300));
		
		
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 500, 490, 6, 100, 100));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 100, 565, -2, 35, 35));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 250, 565, -2, 35, 35));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 500, 565, -2, 35, 35));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 500, 595, 3.5, 60, 60));
		myStage.add(new Vehicle("file:Resources/Images/truck1Right.png", 200, 595, 3.5, 60, 60));
	
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 100, 620, -3, 100, 100));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 520, 620, -3, 100, 100));
		
	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 9. 
	 */
	public void runLevel9() {
		
		myStage.add(new TurtleB(100, 170, -1, 130, 130));
		myStage.add(new TurtleA(350, 170, -1, 130, 130));
		
		myStage.add(new TurtleA(150, 240, 2, 220, 260));
		myStage.add(new TurtleB(450, 240, 2, 220, 260));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 50, 340, -2, 300));
		
		
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 100, 485, 3, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 250, 485, 3, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 500, 485, 3, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Left.png", 120, 530, -4, 100, 150));
		myStage.add(new Vehicle("file:Resources/Images/truck2Left.png", 400, 550, -4, 300, 350));
	
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 500, 620, 5, 100, 100));
		
	}
	
	
	/**
	 * Adds all the movable background objects into the game for Level 10. 
	 */
	public void runLevel10() {
		
		myStage.add(new TurtleA(150, 165, 2, 220, 260));
		myStage.add(new TurtleB(450, 165, 2, 220, 260));
		
		myStage.add(new Log("file:Resources/Images/log3.png", 0, 260, -2, 250));
		myStage.add(new Log("file:Resources/Images/log3.png", 400, 260, -2, 250));
		
		myStage.add(new TurtleB(200, 340, 2, 220, 260));
		myStage.add(new TurtleB(500, 340, 2, 220, 260));
		
		
		myStage.add(new Vehicle("file:Resources/Images/truck1Left.png", 200, 500, -3.5, 200, 250));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 450, 485, -3.5, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 540, 510, -3.5, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Left.png", 608, 550, -3.5, 50, 50));
		
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 100, 600, 2.5, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 300, 600, 2.5, 50, 50));
		myStage.add(new Vehicle("file:Resources/Images/car1Right.png", 500, 600, 2.5, 50, 50));
	
		myStage.add(new Vehicle("file:Resources/Images/truck1Left.png", 0, 650, -4, 120, 120));
		myStage.add(new Vehicle("file:Resources/Images/truck2Left.png", 300, 650, -4, 200, 200));
		
	}
}
