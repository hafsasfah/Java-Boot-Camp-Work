package finalProject;

import javax.swing.JPanel;

public interface ICharacter {

	String getName();
	int getStrength();
	int getIntelligence();
	int getDexterity();
	int getHealth();
	
	JPanel getPanel();
}
