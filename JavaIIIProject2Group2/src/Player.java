import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Player implements iCharacter{

	private int strength;
	private int dexterity;
	private int intelligence;
	private int playerHitPoints;
	private int enemyHitPoints;
	private String[] players = {"Mage","Warrior", "Thief"};
	private String[] monsters = {"Shadow Lord","Pale Witch","Werewolf", "Darth Vader","Voldemort"};
	ArrayList<iItems> Inventory = new ArrayList<iItems>();
	Coordinates location = new Coordinates();
	Dice dice;
	Random rand = new Random();
	private String enemy = monsters[rand.nextInt(monsters.length)];
	
	
	public Player()
	{
		this.location.row = 0;
		this.location.column= 0;
	}
	
	public Player(int strength, int dexterity, int intellignce, String players, String enemy)
	{
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.enemy = enemy; 
		
		
	}	
	
	@Override
	public int getHealth() {
	
		return dice.sixSideRollDieTimesThree();
	}

	@Override
	public int getStrength() {
		
		return dice.sixSideRollDieTimesThree();
	}

	@Override
	public int getDexterity() {
		
		return dice.sixSideRollDieTimesThree();
	}

	@Override
	public int getMana() {
		
		
		return 0;
	}

	@Override
	public String getInventory() {
		
		return null;
	}

	@Override
	public void deathCheck() 
	{
		if( playerHitPoints < 1){
			
			System.out.println("\t You have taken to much damage and too weak to go any further");
			
		}
		
		
		
	}

	@Override
	public void attack() 
	{	
		Player grab = new Player();
		Scanner keyboard = new Scanner(System.in);
		
		
		//While loop to make sure the enemy is dead before you move on
		while(enemyHitPoints > 0)
		{
			
			//Creating options for user...
			
			System.out.println("\t HP: " + playerHitPoints);
			System.out.println("\t" + enemy + "'s HP: " + enemyHitPoints);
			System.out.println("What do you want to do?");
			System.out.println("\t1. Attack");
			System.out.println("\t2. drink health potion");				//<------Not worked on yet
			System.out.println("\t3. Run");								//<------Not worked on yet
			
			String input = keyboard.nextLine();
			
			//input the attack damage dealt and taken by enemy and player
			
			if(input.equals("1"))
			{
				int damageDealt = grab.getStrength();		//damage made by the player 
				int damageTaken = grab.getStrength();		//damage made by the monster/enemy
				
				this.playerHitPoints -= damageDealt;
				this.enemyHitPoints -= damageTaken;
				
				
				System.out.println("\t You strike the " + enemy + "for " + damageDealt + " damage!");
				System.out.println("\t You have received " + damageTaken + "by the # !");
				
				
			} //end of if decision
			
			
			
		}//end of while
		
	}

	
}
