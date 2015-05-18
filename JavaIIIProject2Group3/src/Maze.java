
public class Maze implements iMaze {
	private iRoom[][] maze = new iRoom[10][10];
	

	
	public Maze(){
		for (int xPosition = 0;xPosition<10;xPosition++){
			for(int yPosition = 0;yPosition<10;yPosition++){
				maze[xPosition][yPosition] = (iRoom) new tempRoom();	//randomly generates a room for ever position in maze[][]			
				//TODO: update to new Room after rob commits Room class;
			}
		}
	}

	@Override
	public boolean existsUp(int[] playerLocation) {
		if ((playerLocation[1]-1 )>= 0){
			//System.out.println("in Bounds");
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
	public  iRoom getRoom(int[] playerLocation){
		return (iRoom)maze[playerLocation[0]][playerLocation[1]];
		
	}

	@Override
	public void buildMaze(String filename) {
		// TODO Auto-generated method stub
		
	}
}
