import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Room {
	
	private String roomTitle;
	private String roomDescription;
	
	public Room()
	{
		
	}
	
	public Room(int npc)
	{
		numberOfNPC();
	}
	
	public int numberOfNPC()
	{
		Random randomGenerator = new Random(7);		
		numberOfNonPlayers = randomGenerator.nextInt(100);
		
		return numberOfNonPlayers;
		
	}
}
