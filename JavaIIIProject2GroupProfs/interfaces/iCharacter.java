import javax.swing.JPanel;


public interface iCharacter {
	String getName();
	int getStrength();
	int getIntelligence();
	int getDexterity();
	int getHitPoints();
	boolean isAlive();
	String attack( iCharacter target );
	iItem getWeapon();
	iItem getArmor();
	JPanel getPanel();
}
