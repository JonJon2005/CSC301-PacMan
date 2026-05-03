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

## Run with Java 20 and JavaFX 20

Install JDK 20 and run the game with Maven:

```sh
mvn javafx:run
```

The Maven build pins JavaFX to `20.0.2`. If you use Eclipse or IntelliJ instead, configure the project SDK/JRE as Java 20 and add a JavaFX 20 SDK/library named `JavaFX-20.0.2` in Eclipse or `JavaFX-20` in IntelliJ.
  
## Overview
  ![Overview](resources/overview/ready.png?raw=true)
  ![Overview](resources/overview/eatfruit.png?raw=true)
  ![Overview](resources/overview/gameover.png?raw=true)
  ![Overview](resources/overview/leaderboard.png?raw=true)

## Originally made by
+ [Daniel Alejandro Fernández Robles](https://github.com/7yrionLannister "Daniel Fernández")
+ [Camilo Enriquez Delgado](https://github.com/Stigma137 "Camilo Enriquez")
