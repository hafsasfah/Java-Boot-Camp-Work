import javax.swing.JLabel;
import javax.swing.JPanel;


public abstract class Room implements iRoom
{
	
	String name;
	iParty NPCParty;
	JPanel Panel;
	private int gold;
	
	public Room( String name, iParty npcParty, int gold)
	{
		this.name = name;
		this.NPCParty = NPCParty;
		this.gold =gold;
		Panel = new JPanel();
		Panel.add( new JLabel("Room"));
		Panel.add( new JLabel(name));
		
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
		public int getGold() 
	{
			
		return gold;

	}
}
	
