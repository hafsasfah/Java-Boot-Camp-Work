import javax.swing.JPanel;


public interface IItem {
	String getName();
	int getDurability();
	boolean isBroken();
	JPanel getPanel();
}
