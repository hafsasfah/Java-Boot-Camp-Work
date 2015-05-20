import javax.swing.JPanel;


public class Room implements iRoom
{
	
	String name;
	iParty NPCParty;
	JPanel Panel;
	int gold;
	
	public Room( String name, iParty npcParty, int gold)
	{
		this.name = name;
		this.NPCParty = NPCParty;
		
	}

	@Override
	public String getName() {
		
		
		return name;
	}

	@Override
	public iParty getNPCParty() {
		
		return NPCParty;
	}

	@Override
	public JPanel getPanel() {
		
		
		return Panel;
	}

	@Override
	public int getGold() {
		
		
		return gold;
	}
	
}
