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
	}
	
	public Player(int strength, int dexterity, int intelligence, int hitPoints)
	{
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.hitPoints = hitPoints; 
		
	}	
	
	@Override
	public int getHitPoints() {
	
		return dice.rolldie(3);
	}

	@Override
	public int getStrength() {
		
		return dice.rolldie(3);
	}
	@Override
	public int getDexterity() {
		
		return dice.rolldie(3);
	}

	@Override
	public int getIntelligence() {		
		return 20;
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

	
	public void attack(Player player, Player monster) 
	{	
		
		if(player.getDexterity() > monster.getDexterity())
		{
			
			 monster.hitPoints -= player.getStrength();
			 
			 if(player.hitPoints < 1)
			 {
				 System.out.println("Player is dead! ");
				 
			 }else if(monster.hitPoints < 1)
			 {
				 
				 System.out.println("Monster is dead"); 
			 }
			 	 
		}
		
		else if (player.getDexterity() < monster.getDexterity())
		{
			
			 player.hitPoints -= monster.getStrength();
			 
			 if(monster.hitPoints < 1)
			 {
				 System.out.println("Monster is dead! ");
				 
			 }else if(player.hitPoints < 1)
			 {
				 
				 System.out.println("Player is dead"); 
			 }
			 	 
		}
		
		

		
	}

	@Override
	public void runAway(Player player) 
	{
		
		
	}

	
	
}









