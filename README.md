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

## Setup and Running

This project requires **Java JDK 20** and **Maven**.

You do **not** need to install JavaFX manually. The project uses JavaFX `20.0.2`, and Maven will download the required JavaFX libraries automatically from the dependencies in `pom.xml`.

### Requirements

- Java JDK 20
- Maven
- A terminal or Java IDE such as IntelliJ, Eclipse, VS Code, or Cursor

Check that Java and Maven are installed:

```sh
java -version
mvn -version
```

The Java version should be 20. If your computer has multiple Java versions installed, configure your terminal or IDE to use JDK 20.

### Run from Terminal

From the project folder, run:

```sh
mvn javafx:run
```

On the first run, Maven may take a minute to download dependencies, including JavaFX 20.0.2. After that, it should start faster.

### Run from an IDE

Open the project as a Maven project, make sure the project SDK/JDK is set to Java 20, then run the Maven goal:

```sh
javafx:run
```

In VS Code or Cursor, you can also use the included run configuration named `Run PacMan`.

### Stop the Game

Close the Pac-Man window normally. If the process stays alive, stop it from the IDE or press `Ctrl + C` in the terminal.
  
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
