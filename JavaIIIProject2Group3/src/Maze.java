
public class Maze implements iMaze {
	private Room[][] maze = new Room[10][10];
	

	
	public Maze(){
		for (int xPosition = 0;xPosition<10;xPosition++){
			for(int yPosition = 0;yPosition<10;yPosition++){
				maze[xPosition][yPosition] = new Room();	//randomly generates a room for ever position in maze[][]			
				System.out.println(maze[xPosition][yPosition].x);
			}
		}
	}

	@Override
	public boolean existsUp(int[] playerLocation) {
		if ((playerLocation[1]-1 )>= 0){
			System.out.println("in Bounds");
			if(!(this.maze[playerLocation[0]][playerLocation[1]-1]==null)){
				return true;
			}
		}
	
		return false;
	}

	@Override
	public boolean existsDown(int[] playerLocation) {
		if ((playerLocation[1]+1 )< maze[0].length){
		if(!(this.maze[playerLocation[0]][playerLocation[1]+1]==null)){
			return true;
		}
		}
		 return false;
	}

	@Override
	public boolean existsLeft(int[] playerLocation) {
		if ((playerLocation[0]-1 )>= 0){
		if(!(this.maze[playerLocation[0]-1][playerLocation[1]]==null)){
			return true;
		}
		}
		return false;
	}

	@Override
	public boolean existsRight(int[] playerLocation) {
		if ((playerLocation[0]+1 )< maze.length){
		if(!(this.maze[playerLocation[0]+1][playerLocation[1]]==null)){
			return true;
		}
		}
		return false;
	}
	public  Room getRoom(int[] playerLocation){
		return maze[playerLocation[0]][playerLocation[1]];
		
	}

	@Override
	public void buildMaze(String filename) {
		// TODO Auto-generated method stub
		
	}
}
