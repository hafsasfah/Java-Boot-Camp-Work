/*
-boolean existsUp
-boolean existsDown
-boolean existsLeft
-boolean existsRight
- int[] move(up,left,down,right) I'm thinking of storing a players location in a into array {x,y} 
	moving will return the players new location and should only be available if exists(direction) returns true
 *
 */
 
public interface iMaze {
	
	public boolean existsUp(int[] playerLocation);
	public boolean existsDown(int[] playerLocation);
	public boolean existsLeft(int[] playerLocation);
	public boolean existsRight(int[] playerLocation);
	public void buildMaze();
	}
