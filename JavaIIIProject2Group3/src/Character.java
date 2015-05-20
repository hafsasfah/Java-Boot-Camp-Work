import java.util.ArrayList;

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
	JPanel panel;

	public Character(String charName, String charType, int strength, int dexterity, int hitPoints, int intelligence) {
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
	 * @param charLocation the charLocation to set
	 */
	

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
		return hitPoints > 0 ? true:false; //if hit points is larger than 0, char is alive.
	}

	@Override
	public String attack(iCharacter target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public iItem getWeapon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public iItem getArmor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JPanel getPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Character createCharacter() {
		// TODO Auto-generated method stub
		return null;
	}
	
}