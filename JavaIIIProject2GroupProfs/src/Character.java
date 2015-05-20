import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Character implements ICharacter {

	private String name;
	private int hitPoints;
	private int strength;
	private int dexterity;
	private int intelligence;
	private int gold;
	private IItem weapon;
	private IItem armor;
	
	private JPanel panel;
	private JLabel nameLabel;
	private JLabel hitPointsLabel;
	private JLabel strengthLabel;
	private JLabel dexterityLabel;
	private JLabel intelligenceLabel;
	private JLabel goldLabel;
	

	public Character( String name, int hitPoints, int strength, int dexterity, int intelligence )
	{
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		
		panel = new JPanel();
		updateLabels();
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public int getIntelligence() {
		return intelligence;
	}

	@Override
	public int getDexterity() {
		return dexterity;
	}

	@Override
	public int getHitPoints() {
		return hitPoints;
	}

	@Override
	public boolean isAlive() {
		return hitPoints > 0;
	}

	@Override
	public String attack(ICharacter target) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IItem getWeapon() {
		return weapon;
	}

	@Override
	public IItem getArmor() {
		return armor;
	}

	@Override
	public JPanel getPanel() {
		return panel;
	}

	@Override
	public void setWeapon(IItem weapon) {
		this.weapon = weapon;
	}

	@Override
	public void setArmor(IItem armor) {
		this.armor = armor;
	}

	@Override
	public int getGold() {
		return gold;
	}

	@Override
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	private void updateLabels()
	{
		panel.removeAll();
		
		nameLabel = new JLabel("Name: " + name);
		hitPointsLabel = new JLabel("Hit Points: " + hitPoints);
		strengthLabel = new JLabel("Strength: " + strength);
		dexterityLabel = new JLabel("Dexterity: " + dexterity);
		intelligenceLabel = new JLabel("Intelligence: " + intelligence);
		goldLabel = new JLabel("Gold: " + gold);
		panel.setLayout( new GridLayout(8,1));
		panel.add( nameLabel );
		panel.add( hitPointsLabel );
		panel.add( strengthLabel );
		panel.add( dexterityLabel );
		panel.add( dexterityLabel );
		panel.add( intelligenceLabel );
		panel.add( goldLabel );
		
		if ( weapon != null )
		{
			panel.add(weapon.getPanel());
		}
		
		if ( armor != null)
		{
			panel.add(armor.getPanel());
		}
	}

}
