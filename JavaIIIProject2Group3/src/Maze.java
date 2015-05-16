
public class Maze implements iMaze {
	iRoom[][] maze = new iRoom[10][10];
	
	public Maze(){
		for (int xPosition = 0;xPosition<10;xPosition++){
			for(int yPosition = 0;yPosition<10;yPosition++){
				maze[xPosition][yPosition] = new Room();	//randomly generates a room for ever position in maze[][]			
			}
		}
	}

	@Override
	public boolean existsUp(int[] playerLocation) {
		
		if(!(this.maze[playerLocation[0]][playerLocation[1]-1]==null)){
			return true;
		}
		else return false;
	}

	@Override
	public boolean existsDown(int[] playerLocation) {
		if(!(this.maze[playerLocation[0]][playerLocation[1]+1]==null)){
			return true;
		}
		else return false;
	}

	@Override
	public boolean existsLeft(int[] playerLocation) {
		if(!(this.maze[playerLocation[0]-1][playerLocation[1]]==null)){
			return true;
		}
		else return false;
	}

	@Override
	public boolean existsRight(int[] playerLocation) {
		if(!(this.maze[playerLocation[0]+1][playerLocation[1]]==null)){
			return true;
		}
		else return false;
	}
	public  iRoom getRoom(int[] playerLocation){
		return maze[playerLocation[0]][playerLocation[1]];
		
	}
	/*                              Eric suggests this functionality should be moved to another class
	@Override
	public int[] moveUp(int[] playerLocation) {
		int[] newLocation = {playerLocation[0],playerLocation[1]-1};
		return newLocation;
	}

	@Override
	public int[] moveDown(int[] playerLocation) {
		int[] newLocation = {playerLocation[0],playerLocation[1]+1};
		return newLocation;
	}

	@Override
	public int[] moveLeft(int[] playerLocation) {
		int[] newLocation = {playerLocation[0]-1,playerLocation[1]};
		return newLocation;
	}

	@Override
	public int[] moveRight(int[] playerLocation) {
		int[] newLocation = {playerLocation[0]+1,playerLocation[1]};
		return newLocation;
	}

	@Override
	public void buildMaze() {
		// to build maze from local config file. feature in backlog.
		
	}
	*/
}
