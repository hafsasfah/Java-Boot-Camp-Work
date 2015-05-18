import javax.swing.*;


public class Room implements IRoom {

	private String name;
	private IParty npcParty;
	private JPanel panel;
	
	public Room( String name, IParty npcParty )
	{
		this.name = name;
		this.npcParty = npcParty;
		panel = new JPanel();
		panel.add( new JLabel("Room"));
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public IParty getNPCParty() {
		return npcParty;
	}

	@Override
	public JPanel getPanel() {
		return panel;
	}

}
