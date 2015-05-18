
public class Room implements iRoom
{
	String story = "A plain dungeon room.";
	Coordinates cord = new Coordinates();
	

	
	public Room(int i, int k)
	{
		this.cord.row = i;
		this.cord.column = k;
	}
	public void enterRoom()
	{
		
	}
	
	@Override
	public void generateMonsters() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateItems() 
	{
		// TODO Auto-generated method stub
		
	}

	public void describeRoom(String story)
	{
		this.story = story;

	}
	
	@Override
	public String roomDescription() 
	{
		return this.story;
	}
	
	@Override
	public String toString()
	{
		return "9";
	}

}
