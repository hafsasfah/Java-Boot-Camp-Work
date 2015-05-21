import java.io.FileNotFoundException;


public interface iMaze {
	
	public boolean canGoNorth(int[] playerLocation);
	public boolean canGoSouth(int[] playerLocation);
	public boolean canGoLeft(int[] playerLocation);
	public boolean canGoRight(int[] playerLocation);
	public  iRoom getRoom(int[] playerLocation);
	public void buildMaze(String filename) throws FileNotFoundException;
	}
