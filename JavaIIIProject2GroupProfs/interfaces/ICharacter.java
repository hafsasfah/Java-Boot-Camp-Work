import javax.swing.JPanel;


public interface ICharacter {
	String getName();
	int getHitPoints();
	int getStrength();
	int getIntelligence();
	int getDexterity();
	int getGold();
	void setGold( int gold );
	boolean isAlive();
	String attack( ICharacter target );
	IItem getWeapon();
	void setWeapon( IItem weapon );
	IItem getArmor();
	void setArmor( IItem armor );
	JPanel getPanel();
}
