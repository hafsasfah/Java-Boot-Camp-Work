import java.util.Random;


public class character implements iCharacter{
	
	String name;
	int strength;
	int intelligence;
	int dexterity;
	int hitPoints;
	String item;
	
	public character (String name, int strength, int intelligence, int dexterity, int hitPoints)
	{
		
		this.name = name;
		this.strength = strength;
		this.intelligence = intelligence;
		this.dexterity= dexterity;
		this.hitPoints=hitPoints;
	}
	

	public String getName() {
		return this.name;
	}

	public int getStrength() {
		return this.strength;
	}
	
	public int getintelligence() {
		return this.intelligence;
	}
	
	
	public int getDexterity() {
		return this.dexterity;
	}
	

	public int gethitPoints() {
		return this.hitPoints;
	}
	

	public String getItem() {
		return this.item;
	}

	public class Die implements DiceRoll {
		
		private int sides;
		private int value;
		private Random random;
		
		public Die( int sides )
		{
			this.sides = sides;
			random = new Random();
		}
	
		public int roll() {
			value = random.nextInt(sides) + 1;
			return value;
		}

		
		public int getValue() {
			return value;
		}
	
		public int sumOfXRolls(int numberOfRollsToSum ) {
			int sumOfRolls = 0;
			for ( int rollCount = 0; rollCount < numberOfRollsToSum; rollCount++ )
			{
				sumOfRolls += roll();
			}
			return sumOfRolls;
		}

	}
}
