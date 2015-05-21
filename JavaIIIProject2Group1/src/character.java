import java.util.Random;


public class character implements iCharacter{
	
	String name;
	int strength;
	int iQ;
	int dexterity;
	int hP;
	int item;
	

	
public  int getDie() {
	int totalDie= 0;
	for(int i=0; i<=3; i++)
	{
		Random r = new Random();
		int die = r.nextInt(6) +1;
		totalDie = totalDie + die;
	}
	return totalDie;	
}

	public String getName() {
		return this.name;
	}

	public int getStrength() {
		getDie();
		return this.strength;
	}
	
	public int getiQ() {
		getDie();
		return this.iQ;
	}
	
	
	public int getDexterity() {
		getDie();
		return this.dexterity;
	}
	

	public int gethP() {
		getDie();
		return this.hP;
	}
	

	public int getItem() {
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
