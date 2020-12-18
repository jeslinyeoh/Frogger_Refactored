# COMP2042_CW_hcywy2


### 1. **File Organisation**

A. Classes are reallocated into packages according to their functionality to improve readability.
  
- **Application** 
contains _Main.java_ and parent classes which are not directly edited during changes.
  
- **Game**
contains all game objects categorised into 4 subpackages which are:
  - **Player** contains classes that controls the player's character. 
  - **Background** contains classes which renders background.
  - **Level** contains classes which renders each level.
  - **Score** contains classes which generates the highscore board.

- **Menu**
contains the main menu and renders instructions. 

B. All images, music, highscore and CSS files are stored under "Resources" in the project's root directory.

***

### 2. **Splitting Classes According to Responsibility**

Classes are split into smaller classes to enhance encapsulation and obey the single responsibility principle.

- _Animal.java_ was renamed and split into:
  - **_Frogger.java_** reflects player's actions.
  - **_MovementController.java_** handles player's input and moves Frogger accordingly.
  - **_DeathController.java_** checks death conditions and handles it.


- _Main.java_ was split into:
  - **_Main.java_** launches the application by displaying the menu.
  - **_Background.java_** handles menu and game backgrounds.
  - **_Score.java_** ensures real time score update. 
  - **_Music.java_** plays and stops music.


- _MyStage.java_'s music functions were added into _Music.java_ and the class became an empty class to store all of each level's objects. 

***


### 3. **Applying Design Patterns**
- **Mediator**
  - _Level.java_ interacts with movable game object classes (_Log,java_, _TurtleA.java_, _TurtleB.java_ and _Vehicle.java_ [originally _Obstacle.java_]) on behalf of _Background.java_.
  - Advantage: All the game object classes and _Background.java_ are independent of each other and only collaborates via a mediator which is _Level.java_. As a result, the game objects can be reused in other forms of the application.

- **Factory**
  - _TurtleA.java_ and _TurtleB.java_ inherits most of its properties from _Turtle.java_ while still implementing its own `act()` method.
  - Advantage: New variances of the Turtle class can be added without having to reconstruct the same components.

- **State**
  - _ProceedNextLevelController.java_ will automatically run the next level when the player chooses to proceed after clearing the current level. This is achieved by the following codes in the `displayNextLevel()` method: 
    ```
	lvl += 1;
	background.runGameBackground();
	background.runLevel(lvl);
    ```

  - Advantage: No hardcoding is needed for the transition between levels. Also, _Highscore.java_ is able to read and write to the respective highscore .txt files and display it using _PopUpHighscore.java_. 

***

### 4. **MVC Pattern**
- Implemented on _Menu.fxml_, _EndMessage.fxml_, _ProceedNextLevel.fxml_ and _PopUpInstructions.fxml_.
- Advantage: Other classes can't make changes to the "Model" class while accessing its "View" class.

***

### 5. **Removing Unnecessary Functions**
- _Actor.java_
  - `getWidth()`, `getHeight()` and `manageInput(InputEvent)` are unused.

***

### 6. **Slower Refresh Rate**
- Conditions were added to the `handle(long)` functions (_World.java_, _Score.java_, _Music.java_) and `act(long)` function in _Frogger.java_ to reduce the frequency of the functions.
- Advantage: Smoothen animations and prevents lag.

***

### 7. **More Levels**
- Added 9 more levels by increasing difficulty.
  - Level 1 to 5: More obstacles moving at faster speed.
  - Level 6 to 10: Obstacles of various sizes moving at faster speed.

***

### 8. **Death Penalty**
- Score is assigned to 0 if Frogger dies when the current score is not more than 50.

