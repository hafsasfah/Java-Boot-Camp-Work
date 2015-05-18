import java.io.FileNotFoundException;


public interface iMaze {
	
	public boolean existsUp(int[] playerLocation);
	public boolean existsDown(int[] playerLocation);
	public boolean existsLeft(int[] playerLocation);
	public boolean existsRight(int[] playerLocation);
	public  iRoom getRoom(int[] playerLocation);
	public void buildMaze(String filename) throws FileNotFoundException;
	}
