import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Player implements iCharacter{

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

	
}



/*

Player playerAttack = new Player();
Player enemyAttack = new Player();

Scanner keyboard = new Scanner(System.in);


//While loop to make sure the enemy is dead before you move on
while(hitPoints > 0)
{
	
	//Creating options for user...
	
	System.out.println("\t HP: " + hitPoints);
	System.out.println("\t" + enemy + "'s HP: " + hitPoints);
	System.out.println("What do you want to do?");
	System.out.println("\t1. Attack");
	System.out.println("\t2. drink potion");				//<------Not worked on yet
	System.out.println("\t3. Run");								//<------Not worked on yet
	
	String input = keyboard.nextLine();
	
	//input the attack damage dealt and taken by enemy and player
	
	if(input.equals("1"))
	{
		int damageDealt = playerAttack.getStrength();		//damage made by the player 
		int damageTaken = enemyAttack.getStrength();		//damage made by the monster/enemy
		
		this.hitPoints -= damageDealt;
		this.hitPoints -= damageTaken;
		
		
		System.out.println("\t You strike the " + enemy + "for " + damageDealt + " damage!");
		System.out.println("\t You have received " + damageTaken + "by the" + enemy + " !" );
		
		
	} else if(input.equals("2"))
	{
		
		

	}
	
	
	
}//end of while
**/



