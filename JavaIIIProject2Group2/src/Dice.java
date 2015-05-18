import java.util.Random;


public class Dice implements iDice {

	Random rand = new Random();
    int dice;
    
	@Override
	public int rolldie() 
	
	{
		int roll1 = rand.nextInt(6) +1;
        int roll2 = rand.nextInt(6) +1;
        int roll3 = rand.nextInt(6) +1;
        int sum = roll1 + roll2 + roll3;
		return sum;
	}
	
	
	
	
	
	
	
	

}
