import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Character implements iCharacter {

	// fields
	private int strength; // warrior
	private int dexterity; // thief
	private int hitPoints; // all
	private int intelligence; // wizard
	private Location location = new Location();
	private String type; // TEMP until specified classes are made
	private String name; // player's name
	Items weapon;
	Items armor;
	JPanel panel;
	JLabel nameLabel ;

	public Character(String charName, String charType, int strength, int dexterity, 
			int hitPoints, int intelligence) {
		this.name = charName;
		this.type = charType;
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
		return type;
	}

	/**
	 * @param charType the charType to set
	 */
	public void setCharType(String charType) {
		this.type = charType;
	}

	@Override
	public String getCharName() {
		return name;
	}
	
	/**
	 * @param charName the charName to set
	 */
	public void setCharName(String charName) {
		this.name = charName;
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
	public void panelUpdate(){
		nameLabel.setText("<html>Name: "+ getCharName()+
				"<br>Skill: "+getCharType()+
				
				"<br>HP: "+getHitPoints()+
				
				"<br>Dex: "+getDexterity()+
				
				"<br>Int: "+getIntelligence()+
				
			"<br>Str: "+getStrength()+"</html>");
				
		
	}
	@Override
	public JPanel getPanel() {
		panel = new JPanel();
		nameLabel = new JLabel();
		
		nameLabel.setText("<html>Name: "+ getCharName()+
		"<br>Skill: "+getCharType()+
		
		"<br>HP: "+getHitPoints()+
		
		"<br>Dex: "+getDexterity()+
		
		"<br>Int: "+getIntelligence()+
		
	"<br>Str: "+getStrength()+"</html>");
		
		
		panel.add(nameLabel);
		return panel;
	}
}