import javax.swing.JPanel;


public interface iCharacter {
	
	String getCharName();
	int getStrength();
	int getIntelligence();
	int getDexterity();
	int getHitPoints();
	boolean isAlive();
	iItems getWeapon();
	iItems getArmor();
	void setWeapon(Items weapon);
	void setArmor(Items armor);
	
	
	//public void pickUpItem(String item);
	//public void drinkPotion(double potion);
	//public void addArmor(double armor);
	public int[] getCharLocation();
	
	// Movement methods
	public String getCharLocationString();
	public JPanel getPanel();
	void panelUpdate();
	void setHitPoints(int i);
	
}

