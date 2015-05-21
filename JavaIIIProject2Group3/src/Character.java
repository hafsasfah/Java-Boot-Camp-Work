import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Character implements iCharacter {

	// fields
	private int strength; // warrior
	private int dexterity; // thief
	private int hitPoints; // all
	private int intelligence; // wizard
	private Location location = new Location();
	private String charType; // TEMP until specified classes are made
	private String charName; // player's name
	Items weapon;
	Items armor;
	JPanel panel;

	public Character(String charName, String charType, int strength, int dexterity, 
			int hitPoints, int intelligence) {
		this.charName = charName;
		this.charType = charType;
		this.strength = strength;
		this.dexterity = dexterity;
		this.hitPoints = hitPoints;
		this.intelligence = intelligence;	
	}
	
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}

	/**
	 * @return the dexterity
	 */
	public int getDexterity() {
		return dexterity;
	}

	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the charLocation
	 */
	public int[] getCharLocation() {
		return location.getLocation();
	}
	
	public String getCharLocationString() {
		return location.toString();
	}

	/**
	 * @return the charType
	 */
	public String getCharType() {
		return charType;
	}

	/**
	 * @param charType the charType to set
	 */
	public void setCharType(String charType) {
		this.charType = charType;
	}

	@Override
	public String getCharName() {
		return charName;
	}
	
	/**
	 * @param charName the charName to set
	 */
	public void setCharName(String charName) {
		this.charName = charName;
	}

	@Override
	public void generateMvmtUp() {
		 this.location.moveUp();
	}
	
	@Override
	public void generateMvmtDown() {
		 this.location.moveDown();
	}
	
	@Override
	public void generateMvmtLeft() {
		 this.location.moveLeft();
	}
	
	@Override
	public void generateMvmtRight() {
		 this.location.moveRight();
	}

	@Override
	public boolean isAlive() {
		return hitPoints > 0; //if hit points is larger than 0, char is alive.
	}

	@Override
	public iItems getWeapon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public iItems getArmor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setWeapon(Items weapon) {
		this.weapon = weapon;
	}
	
	public void setArmor(Items armor) {
		this.armor = armor;
	}
	
	@Override
	public JPanel getPanel() {
		panel = new JPanel();
	
		JLabel  name = new JLabel();
		name.setText("Name: "+ getCharName());
		JLabel  type = new JLabel();
		type.setText("Skill"+getCharType());
		JLabel  hitpoints = new JLabel();
		hitpoints.setText("HP"+getHitPoints());
		JLabel  dexterity = new JLabel();
		dexterity.setText("Dex"+getDexterity());
		JLabel intelligence=new JLabel();
		intelligence.setText("Int"+getIntelligence());
		
		panel.add(name);
		panel.add(type);
		panel.add(hitpoints);
		panel.add(dexterity);
		panel.add(intelligence);		
		
		return panel;
	}
}