
public class Player implements iCharacter{

	private int strength;
	private int dexterity;
	private int intelligence;
	private int hitPoints;
	private String[] players = {"Mage","Warrior", "Thief"};
	private String[] monsters = {"Shadow Lord","Pale Witch","Werewolf", "Darth Vader","Voldemort"};

	public Player(){
		
	}
	
	public Player(int strength, int dexterity, int intellignce, String monsters)
	{
		
	}	
	
	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDexterity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMana() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getInventory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deathCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	
}
