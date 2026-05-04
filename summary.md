# Project Summary
![pacman-game](resources/sprites/pacman/movements/1.png?raw=true)
![pacman-game](resources/sprites/food/pacdot.png?raw=true)
![pacman-game](resources/sprites/food/pacdot.png?raw=true)
![pacman-game](resources/sprites/food/bonus/cherry.png?raw=true)
![pacman-game](resources/sprites/food/pacdot.png?raw=true)
![pacman-game](resources/sprites/food/pacdot.png?raw=true)
![pacman-game](resources/sprites/ghosts/vulnerable/0.png?raw=true)

### When is BFS better for getting PacMan? How about A*?
A* functions better when PacMan is further away, whereas BFS is better when PacMan is up close.
This is because BFS will likely find PacMan very quickly, compared to when he is further away
and BFS will lag behind A*. A*, while it doesn't find the perfect path every time due to its
greedy nature, doesn't need to find the perfect path because once it gets close enough BFS
will take over the pathfinding job.

### How did you hybrid these for Inky?
In the case of Inky, he now has knowledge of PacMan's location, and switches between these algorithms
in order to most effectively chase. When further away, he uses A*, and while close-up, he uses BFS.
Furthermore, Inky now attempts to anticipate where PacMan is going, but will attempt to play safer
when he thinks that PacMan will eat a power pellet, attempting to goad the player into making risky
plays that Inky can later punish.

### What was your reasoning for how you did the hybrid?
The reason to use this hybrid method, with the parameters given to the conditions of algorithmic
switching, was to make Inky able to play against the player's habits and ideas, attempting to "cheat"
by using a significant amount of game knowledge in conjunction with the advantage of instantaneous
processing afforded to it by a computer chip.

### Do you think the hybrid approach is more efficient/effective than BFS or A* for these situations? 
*(Consider the real problem that the paper was addressing - PacMan was just how they chose to model it.)*

In these sorts of situations--situations where memory is of no concern and the graph size is small--yes.
The paper also covers different maze structures, however, and given a case with significantly less terrain
this hybrid approach may also be less ideal than just picking one algorithm and sticking to it. Furthermore,
in the case of structures that cover more expansive, orders of magnitude larger graphs, choosing a singular
algorithm (ideally a greedy one) will be the preferred choice.