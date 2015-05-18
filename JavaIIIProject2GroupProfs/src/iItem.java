import javax.swing.JPanel;


public interface iItem {
	String getName();
	int getDurability();
	boolean isBroken();
	JPanel getPanel();
}
