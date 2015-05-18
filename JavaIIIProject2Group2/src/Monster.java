import java.util.Random;


public class Monster {
	private int strength;
	private int dexterity;
	private int intelligence;
	private int hitPoints;
	private String[] monsters = {"Shadow Lord","Pale Witch","Werewolf", "Darth Vader","Voldemort"};
	Coordinates coordinate;	
	Random rand = new Random();
	private String enemy = monsters[rand.nextInt(monsters.length)];
	
	public Monster()
	{

	}
	
	public Monster(int strength, int dexterity, int intellignce, int hitPoint, String enemy)
	{
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.hitPoints = hitPoints;
		this.enemy = enemy;
		
	}	
	/*
	@Override
	public int getHealth() {
		return rollDie();
	}

	@Override
	public int getStrength() {
		return 85;
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
*/
	
}
