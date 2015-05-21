import javax.swing.*;


public class Room implements IRoom {

	private String name;
	private IParty npcParty;
	private JPanel panel;
	private int gold;
	
	public Room( String name, IParty npcParty, int gold )
	{
		this.name = name;
		this.npcParty = npcParty;
		this.gold = gold;
		panel = new JPanel();
		panel.add( new JLabel(name));
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

	@Override
	public int getGold() {
		return gold;
	}

}
