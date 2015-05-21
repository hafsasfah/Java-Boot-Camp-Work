
import java.util.Random;
import javax.swing.JPanel;


public class Room {
	
	private String roomTitle;
	private String roomDescription;
	private int npc;
	private int gold;
	private int party;
	private JPanel panel;
	private Party npcs;
	
	public Room()
	{
		this.roomTitle = "Room";
		this.roomDescription = "This is a room";
	}
	
	
	public Room(int npc, int goldAmount)
	{
		npc = numberOfNPC();	
		goldAmount = amountOfGold();
	}
	
	public String getName()
	{
		String name = "";
		return name;
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


	public Party getNpcs() {
		return npcs;
	}


	public void setNpcs(Party npcs) {
		this.npcs = npcs;
	}
}
