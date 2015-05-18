import javax.swing.JPanel;


public class Room implements iRoom {

	private String name;
	private iParty npcParty;
	private JPanel panel;
	
	public Room( String name, iParty npcParty )
	{
		this.name = name;
		this.npcParty = npcParty;
		panel = new JPanel();
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public iParty getNPCParty() {
		return npcParty;
	}

	@Override
	public JPanel getPanel() {
		return panel;
	}

}
