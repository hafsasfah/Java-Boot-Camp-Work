import java.util.Random;


public class Dice implements iDice {

	Random rand = new Random();
    int dice;
    
	@Override
	public int sixSideRollDie() 
	
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
	
	
	
	
	
	
	
	

}
