# COMP2042_CW_hcywy2
## Project originated from https://github.com/hirish99/Frogger-Arcade-Game



1. **File Organisation**

A. Classes are reallocated into packages according to their functionality to improve readabilty.
  
- **Application** 
contains _Main.java_ and parents classes which are not directly edited during changes.
  
- **Game**
contains all game objects categorised into 4 subpackages which are:
  - **Player** contains classes that controls the player's character. 
  - **Background** contains classes which renders background.
  - **Level** contains classes which renders each level.
  - **Score** contains classes which records player's score, adds to highscore board if eligible and display it at the end of each round.

- **Menu**
contains the main menu and renders PopUp instructions. 

B. All images and Music are stored in separate folders in the project's root directory.

***

2. **Renaming Classes**

Classes were renamed to more relatable names for better readability.

- _Animal.java_ to _Frogger.java_
- _Obstacle.java_ to _Vehicle.java_

***

3. **Splitting Classes According to Responsibility**

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


6. **Applying Design Patterns**
- **Mediator**
  - _Level.java_ interacts with game object classes (_Log,java_, _TurtleA.java_, _TurtleB.java_ and _Vehicles.java_) on behalf of _Background.java_.
  - Advantage: All the game object classes and _Background.java_ are independent of each other and only collaborates via a mediator which is _Level.java_. As a result, the game objects can be reused in other forms of the application.

- **Factory**
  - _TurtleA.java_ and _TurtleB.java_ inherits most of its properties from _Turtle.java_ while still implementing its own `act()` method.
  - Advantage: Programmers can add new variances of the Turtle class without having to reconstruct the same components repeatedly.

- **State**
  - _Background.java_ will automatically run the next level when the player chooses to proceed after clearing the current level. This is achieved by the following codes in the `displayPopUpNextLevel()` method: 
  ```
  lvl += 1;
	runLevel(lvl);
  ```

  - Advantage: No hardcoding is needed for the transition between levels and _Highscore.java_ is able to read and write to the respective highscore .txt files and display it using _PopUpHighscore.java_. 

***

7. **MVC Pattern**
- Implemented on _Menu.java_ where _MenuView.java_ displays the contents of the Menu while _MenuController.java_ configures the Menu.
- Advantage: Other classes can't make changes to _Menu.java_ while accessing _MenuView.java_.

***

8. **JUnit Testing**
- Added _FroggerTest.java_ and _HighscoreTest.java_ to aid regression testing.

***

9. **Buildfiles**
- Gradle was used to eliminate hardcoded dependencies and runtime VM arguments.

***

10. **Slower Refresh Rate**
- Conditions were added to the `AnimationTimer()` functions in _Score.java_ and _Frogger.java_ to reduce the frequency of the functions.
- Advantage: Smoothen animations and prevents lag.

***

11. **More Levels**
- Added 9 more levels by changing obstacle count, speed and size.
