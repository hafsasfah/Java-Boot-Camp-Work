
public class RoomGenerator 
{

	public void populateDungeon(byte maze[][], Room dungeon[][])
	{
		for(int i = 0; i < maze.length; i++)
		{
			for(int k = 0; k < maze[0].length; k++)
			{
				if(maze[i][k] == 1)
				{
					dungeon[i][k] = new Room(i,k);
					System.out.print(dungeon[i][k]);
				}
				else
					System.out.print("0");
			}
			System.out.print("\n");
		}
		
	}
	
	public boolean lookNorth(Player player, Room maze[][])
	{
		if(player.location.row - 1 >= 0)
		{
			if(maze[player.location.row - 1][player.location.column] == null)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean lookWest(Player player, Room maze[][])
	{
		if(player.location.column - 1 >= 0)
		{
			if(maze[player.location.row ][player.location.column - 1] == null)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
	public boolean lookSouth(Player player, Room maze[][])
	{
		if(player.location.row + 1 < maze[0].length)
		{
			if(maze[player.location.row + 1][player.location.column] == null)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		return false;
	}
	public boolean lookEast(Player player, Room maze[][])
	{
		if(player.location.column + 1 < maze.length)
		{
			if(maze[player.location.row ][player.location.column + 1] == null)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		return false;
	}

}