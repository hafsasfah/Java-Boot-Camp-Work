import javax.swing.JPanel;


public interface IRoom {
	String getName();
	IParty getNPCParty();
	JPanel getPanel();
	int getGold();
}
