import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;


public class Maze<TwoDimensionalPosition> 
{
	  public boolean [][] verticalWall;
	  public boolean [][] horizontalWall;
	
	  
	  private static final int moveNorth = 0;
	  private static final int moveSouth = 1;
	  private static final int moveEast = 2;
	  private static final int moveWest = 3;
	  
	  private final char START = 's';
	  private final char WALL = 'w';
	  private final char ROOM = 'r';
	  private final char END = 'e';
	  
	  private TwoDimensionalPosition start;
	  private TwoDimensionalPosition end;
	  private ArrayList<TwoDimensionalPosition> maze;
	  private int maxX;
	  private int maxY;

	  private JPanel panel;

		public void TwoDimensionalMaze(File mazeFile, iRoomFactory roomFactory)
				throws IOException {
			maze = new ArrayList<TwoDimensionalPosition>();
			
			int[][] maze = new int[10][10];
			maze[0] = new int[] { 1, 1, 0, 0, 0, 0 };
			maze[1] = new int[] { 0, 1, 0, 0, 0, 0 };
			maze[2] = new int[] { 0, 1, 0, 1, 1, 1 };
			maze[3] = new int[] { 1, 1, 1, 1, 0, 1 };
			maze[4] = new int[] { 0, 1, 0, 0, 0, 1 };
			maze[5] = new int[] { 0, 1, 0, 0, 0, 1 };
			
			
			
		}
}

	
