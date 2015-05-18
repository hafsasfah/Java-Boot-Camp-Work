import javax.swing.JPanel;


public interface ICharacter {
	String getName();
	int getStrength();
	int getIntelligence();
	int getDexterity();
	int getHitPoints();
	boolean isAlive();
	String attack( ICharacter target );
	IItem getWeapon();
	IItem getArmor();
	JPanel getPanel();
}
