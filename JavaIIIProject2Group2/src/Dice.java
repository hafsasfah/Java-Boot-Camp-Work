import java.util.Random;


public class Dice implements iDice {

	Random rand = new Random();
    int dice;
    
    
    //**Recursive Roll. Enter Number of rolls as argument.**\\
    //**Rolls six sided die.**\\
    public int rolldie(int roller)
    {
    	int ranNum = rand.nextInt((6));
    	if(roller == 0)
    		return 1;
    	else
    		return ranNum + rolldie(roller - 1);		
    }
    
    public static void main(String[] args)
    {
    	Dice die = new Dice();
    	System.out.println(die.rolldie(1));
    }
    
	@Override
	public int sixSideRollDieTimesThree() 
	
	{
		int roll1 = rand.nextInt(6) +1;
        int roll2 = rand.nextInt(6) +1;
        int roll3 = rand.nextInt(6) +1;
        int sum = roll1 + roll2 + roll3;
		return sum;
	}

	@Override
	public int twentySideRollDie() 
	{
		int roll1 = rand.nextInt(20) +1;
		return roll1;
	}

	@Override
	public int fifteenSideRollDie() 
	{
		int roll1 = rand.nextInt(15) +1;
		return roll1;
	}

	@Override
	public int monsterDie() {
		
		int roll = rand.nextInt(3) +1;
		int rollpoint = rand.nextInt(6) +1;
		int monsterStat = roll * rollpoint;
		return monsterStat;
	}
	
	
	
	
	
	
	
	

}
