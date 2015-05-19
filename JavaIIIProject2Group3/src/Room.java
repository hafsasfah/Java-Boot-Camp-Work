import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Room {
	
	private String roomTitle;
	private String roomDescription;
	private int npc;
	
	public Room(String rTitle, String rDescription)
	{
		this.roomTitle = rTitle;
		this.roomDescription = rDescription;
	}
	
	public Room(int npc, int goldAmount)
	{
		npc = numberOfNPC();		
	}
	
	public int numberOfNPC()
	{
		Random randomGenerator = new Random(7);		
		int numberOfNonPlayers = randomGenerator.nextInt(100);
		
		return numberOfNonPlayers;
		
	}
	
	public int amountOfGold()
	{
		Random randomGenerator = new Random(20);
		int gold = randomGenerator.nextInt();
		return gold;
	}
}
