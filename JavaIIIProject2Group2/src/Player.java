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
	//private String[] players = {"Mage","Warrior", "Thief"};
	//private String[] monsters = {"Shadow Lord","Pale Witch","Werewolf", "Darth Vader","Voldemort"};
	ArrayList<iItems> Inventory = new ArrayList<iItems>();
	Coordinates location = new Coordinates();
	Dice dice;
	
	
	Random rand = new Random();
	//private String enemy = monsters[rand.nextInt(monsters.length)];
	
	
	public Player()
	{
		this.location.row = 0;
		this.location.column= 0;
		this.strength = dice.rolldie(3);
		this.dexterity = dice.rolldie(3);
		this.intelligence = dice.rolldie(3);
		this.hitPoints = dice.rolldie(3);
		
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

	@Override
	public int getStrength() {
		
		return this.strength;
	}
	@Override
	public int getDexterity() {
		
		return this.dexterity;
	}

	@Override
	public int getIntelligence() {		
		return this.intelligence;
	}

	@Override
	public String getInventory() {
		
		return null;
	}

	@Override
	public void deathCheck() 
	{
		if( hitPoints < 1)
		{
			
			System.out.println("\t You have taken to much damage and too weak to go any further");
			
		}
	}

	
	public void attack(Player monster) 
	{	
		
		if(this.getDexterity() > monster.getDexterity())
		{
			
			monster.hitPoints -= this.getStrength();
			monster.deathCheck(); 
			this.hitPoints -= monster.getStrength();
			this.deathCheck();
			System.out.println("Monster is dead"); 

		}
		
		else if (this.getDexterity() < monster.getDexterity())
		{
			
			this.hitPoints -= this.getStrength();
			this.deathCheck(); 
			monster.hitPoints -= monster.getStrength();
			monster.deathCheck();
			System.out.println("Player is dead"); 
			 	 
		}
		
		

		
	}

	@Override
	public void runAway(Player player) 
	{
		
		
	}

	
	
}









