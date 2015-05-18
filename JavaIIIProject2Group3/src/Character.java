import java.util.ArrayList;

public class Character implements iCharacter {

	// fields
	private double strength; // warrior
	private double dexterity; // thief
	private double hitPoints; // all
	private double intelligence; // wizard
	//private int[] charLocation = new int[2]; // character location
	private Location location = new Location();
	private ArrayList<String> inventory = new ArrayList<String>(); // dynamic array for items
	private String charType; // TEMP until specified classes are made
	private String charName; // player's name
	
	public Character() {}
	
	// TEMP: all attributes are standard
	public Character(String charName, String charType) {
		this.strength = 5.0;
		this.dexterity = 2.0;
		this.hitPoints = 20.0;
		this.intelligence = 6.0;
		//this.charLocation[0] = 0;
		//this.charLocation[1] = 0;
		
		/*
		 * Need to generate random stats
		 */
		
	}
	
	public void addArmor(double armor) {
		this.hitPoints += armor; // TEMP definition
	}
	
	public void addItem(String item) {
		inventory.add(item);
	}
	
	/**
	 * @return the strength
	 */
	public double getStrength() {
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(double strength) {
		this.strength = strength;
	}

	/**
	 * @return the dexterity
	 */
	public double getDexterity() {
		return dexterity;
	}

	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(double dexterity) {
		this.dexterity = dexterity;
	}

	/**
	 * @return the hitPoints
	 */
	public double getHitPoints() {
		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set
	 */
	public void setHitPoints(double hitPoints) {
		this.hitPoints = hitPoints;
	}

	/**
	 * @return the intelligence
	 */
	public double getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(double intelligence) {
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

	/**
	 * @return the charName
	 */
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
	public void pickUpItem(String item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drinkPotion(double potion) {
		// TODO Auto-generated method stub
		
	}
	
}