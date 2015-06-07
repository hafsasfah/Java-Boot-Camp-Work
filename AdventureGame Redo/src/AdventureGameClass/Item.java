package AdventureGameClass;
import javax.swing.JPanel;


public interface Item {
	String getName();
	int getDurability();
	boolean isBroken();
	JPanel getPanel();
}
