

public class RoomGenerator 
{

    static byte gridLayout[][]  =  {{1,0,0}, 
    						  		{1,0,0}, 
    						  		{1,1,1}};
    
	static Room dungeon[][] = new Room [3][3];
	
	public static void populateDungeon(byte maze[][], Room dungeon[][])
	{
		for(int i = 0; i < maze.length; i++)
		{
			for(int k = 0; k < maze[0].length; k++)
			{
				if(maze[i][k] == 1)
				{
					dungeon[i][k] = new Room();
					System.out.print(dungeon[i][k]);
				}
				else
					System.out.print("0");
			}
			System.out.print("\n");
		}
		
	}
		
	public static void main(String[] args)
	{
		populateDungeon(gridLayout,dungeon);	
	}
	
}
