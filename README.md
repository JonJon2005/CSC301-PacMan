# pacman-game
![pacman-game](resources/sprites/pacman/movements/1.png?raw=true)
![pacman-game](resources/sprites/food/pacdot.png?raw=true)
![pacman-game](resources/sprites/food/pacdot.png?raw=true)
![pacman-game](resources/sprites/food/bonus/cherry.png?raw=true)
![pacman-game](resources/sprites/food/pacdot.png?raw=true)
![pacman-game](resources/sprites/food/pacdot.png?raw=true)
![pacman-game](resources/sprites/ghosts/vulnerable/0.png?raw=true)

This project is a Pac-man game that uses a graph as a data structure in order to find the shortest paths between ghosts and Pac-man. It is presented as a final project in the course of algorithms and data structures in the second half of 2019.

The objective of the game is to accumulate as many points as possible by eating dots, power-pellets(energizers), fruits and blue ghosts. When all of the dots in a stage are eaten, that stage is complete and the player will advance to the next one. Four ghosts roam the maze and chase Pac-Man. If any of the ghosts touches Pac-Man, a life is lost. When all lives have been lost, the game is over.

You can change Pac-man direction using either **WASD**, **IJKL** or the arrow keys.

## Run from a fresh clone

This project runs with Java 20 and JavaFX 20.0.2. JavaFX is pulled by Maven, so you do not need to install a separate JavaFX SDK.

### Requirements

- JDK 20
- Maven
- Cursor, VS Code, IntelliJ, or a terminal

Verify Java and Maven:

```sh
java -version
mvn -version
```

If your default Java is not Java 20, run Maven with `JAVA_HOME` set to your JDK 20 install. On this machine the JDK 20 path is:

```sh
/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home
```

### Clone and run from terminal

```sh
git clone https://github.com/JonJon2005/CSC301-PacMan.git
cd CSC301-PacMan
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-20.jdk/Contents/Home mvn javafx:run
```

If your terminal already uses Java 20, this is enough:

```sh
mvn javafx:run
```

### Run from Cursor or VS Code

This repo includes `.vscode/launch.json` and `.vscode/tasks.json`.

1. Open the cloned `CSC301-PacMan` folder in Cursor or VS Code.
2. Install the Java extension pack if prompted.
3. Open the Run and Debug sidebar.
4. Select `Run PacMan`.
5. Click the play button.

The launch configuration runs `mvn -DskipTests compile` first, then starts `ui.Main` with JavaFX 20.0.2 from Maven's local cache.

You can also run the Maven task directly:

1. Press `Cmd + Shift + P`.
2. Choose `Tasks: Run Build Task`.
3. Select `Run PacMan with Maven`.

### Stop the game

Close the Pac-Man window normally. If the process stays alive, click the red stop button in Cursor/VS Code or press `Shift + F5`. If you started it in a terminal, press `Ctrl + C`.
  
## Overview
  ![Overview](resources/overview/ready.png?raw=true)
  ![Overview](resources/overview/eatfruit.png?raw=true)
  ![Overview](resources/overview/gameover.png?raw=true)
  ![Overview](resources/overview/leaderboard.png?raw=true)

## Originally made by
+ [Daniel Alejandro Fernández Robles](https://github.com/7yrionLannister "Daniel Fernández")
+ [Camilo Enriquez Delgado](https://github.com/Stigma137 "Camilo Enriquez")

## Modifications by
+ [Jonathan Gallo](https://github.com/JonJon2005 "Jonathan Gallo")
+ [David Flater](https://github.com/dayflay "David Flater")

For a detailed summary of findings, see `summary.md`