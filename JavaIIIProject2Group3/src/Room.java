
import java.util.Random;

import javax.swing.JPanel;


public class Room implements iRoom {
	
	private String roomTitle;
	private String roomDescription;
	private int npc;
	private int gold;
	private int party;
	private JPanel panel;
	private Party npcs;
	private NPCharacterFactory factory;
	
	public Room()
	{
		Random random = new Random();
		int numOfNPCs = random.nextInt(2+2);
		this.roomTitle = "Room";
		this.roomDescription = "This is a room";
		factory = new NPCharacterFactory();
		iCharacter[] nPCs = new Character[numOfNPCs];
		for(int i=0;i< nPCs.length ;i++){
			nPCs[i]= factory.createCharacter();
		}
		npcs = new Party(nPCs);
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


	@Override
	public int numberOfItemsInRoom() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Party getParty(){
		return npcs;
	}


	@Override
	public JPanel getnpcs() {
		// TODO Auto-generated method stub
		return null;
	}
}
