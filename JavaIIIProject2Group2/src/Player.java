import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Player implements iCharacter
{

	private int strength;
	private int dexterity;
	private int intelligence;
	private int hitPoints;
	PlayerCharacterFactory player;
	NpcCharacterFactory enemy;
	String name;
	//private String[] players = {"Mage","Warrior", "Thief"};
	public String[] monsters = {"Shadow Lord","Pale Witch","Werewolf", "Orc","Goblin", "Giant Centipede"};
	ArrayList<iItems> Inventory = new ArrayList<iItems>();
	Coordinates location = new Coordinates();
	Dice dice;
	boolean alive = true;
	
	
	Random rand = new Random();
	//private String enemy = monsters[rand.nextInt(monsters.length)];
	
	
	public Player()
	{
		dice = new Dice();
		this.location.row = 0;
		this.location.column= 0;
		this.strength = dice.rollDieAmountOfTimes(3);
		this.dexterity = dice.rollDieAmountOfTimes(3);
		this.intelligence = dice.rollDieAmountOfTimes(3);
		this.hitPoints = 20;
		
	}
	
	public Player(int strength, int dexterity, int intelligence, int hitPoints)
	{
		this.location.row = 0;
		this.location.column= 0;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.hitPoints = hitPoints; 
		
	}	
	
	@Override
	public int getHitPoints() {
	
		return hitPoints;
	}

	public void setHitPoints(int hitPoints)
	{
		
		this.hitPoints += hitPoints;
		
		
	}
	
	@Override
	public int getStrength() {
		
		return this.strength;
	}
	
	public void setStrength(int strength)
	{
		
		this.strength = strength;
		
	}
	
	
	@Override
	public int getDexterity() {
		
		return this.dexterity;
	}
	
	
	public void setDexterity(int dexterity)
	{
		
		this.dexterity = dexterity;
		
	}

	@Override
	public int getIntelligence() {		
		return this.intelligence;
	}
	
	
	public void setIntelligence(int intelligence)
	{
		this.intelligence = intelligence;
		
	}

	@Override
	public String getInventory() {
		
		return null;
	}
	public String getName() {
		
		return this.name;
	}
	public void setName(String x) {
		
		this.name = x;
	}

	public boolean getAlive()
	{
		return this.alive;
	}
	
	@Override
	public boolean deathCheck() 
	{
		if( this.hitPoints < 1)
		{
			this.alive = false;
			return true;
		}
		return false;
	}

	
	public void attack(iCharacter monster) 
	{	
		if(this.alive == true && monster.getAlive() == true)
		{
			if(this.getDexterity() > monster.getDexterity())
			{
				
				monster.setHitPoints(-this.getStrength());
				monster.deathCheck();
				if(monster.getAlive() == true)
				{
				this.hitPoints -= monster.getStrength();
				this.deathCheck();
				}
	
			}
			
			else if (this.getDexterity() <= monster.getDexterity())
			{
				
				this.setHitPoints(-monster.getStrength());
				this.deathCheck(); 
				if(this.getAlive() == true)
				{
				monster.setHitPoints(this.getHitPoints());
				monster.deathCheck();
				} 
				 	 
			}
			
		}
		this.deathCheck();
			
	}

	@Override
	public void runAway(Player player) 
	{
		
		
	}

	@Override
	public void runAway(iCharacter player) {
		// TODO Auto-generated method stub
		
	}

	
	
}









