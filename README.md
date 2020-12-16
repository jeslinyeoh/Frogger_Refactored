# COMP2042_CW_hcywy2


### 1. **File Organisation**

A. Classes are reallocated into packages according to their functionality to improve readabilty.
  
- **Application** 
contains _Main.java_ and parents classes which are not directly edited during changes.
  
- **Game**
contains all game objects categorised into 4 subpackages which are:
  - **Player** contains classes that controls the player's character. 
  - **Background** contains classes which renders background.
  - **Level** contains classes which renders each level.
  - **Score** contains classes which generates the highscore board.

- **Menu**
contains the main menu and renders instructions. 

B. All images, music and CSS files are stored in separate folders in the project's root directory.

***

### 2. **Splitting Classes According to Responsibility**

Classes are split into smaller classes to enhance encapsulation and obey the single reponsibility principle.

- _Animal.java_ was renamed and split into:
  - **_Frogger.java_** reflects player's actions.
  - **_MovementController.java_** handles player's input and moves Frogger accordingly.
  - **_DeathController.java_** checks death conditions and handles it.

Both _MovementController.java_ and _DeathController.java_ changes Frogger's properties by using getter and setter methods.


- _Main.java_ was split into:
  - **_Main.java_** launches the application by displaying the menu.
  - **_Background.java_** handles menu and game backgrounds.
  - **_Score.java_** ensures real-time score update. 
  - **_Music.java_** plays and stops music.


- _MyStage.java_'s media functions were added into _Music.java_ and the class became an empty class to store all of each level's objects. 

***


### 3. **Applying Design Patterns**
- **Mediator**
  - _Level.java_ interacts with game object classes (_Log,java_, _TurtleA.java_, _TurtleB.java_ and _Vehicle.java_ [originally _Obstacle.java_]) on behalf of _Background.java_.
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
- Implemented on _Menu.java_, _EndMessage.java_, ProceedNextLevel.java and _PopUpInstructions.java_
- Advantage: Other classes can't make changes to the "Model" class while accessing its "View" class.

***

### 5. **JUnit Testing**
- Added _FroggerTest.java_ and _HighscoreTest.java_ to aid regression testing.

***

### 6. **Buildfiles**
- Gradle was used to eliminate hardcoded dependencies and runtime VM arguments.

***

### 7. **Slower Refresh Rate**
- Conditions were added to the `AnimationTimer()` functions ( _World.java_, _Score.java_, _Music.java_ )and `act()` function in _Frogger.java_ to reduce the frequency of the functions.
- Advantage: Smoothen animations and prevents lag.

***

### 8. **More Levels**
- Added 9 more levels by changing obstacle count, speed and size to increase game difficulty.
