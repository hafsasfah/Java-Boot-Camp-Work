package models;

import java.util.Random;

public class Dice implements IDice {

	Random rand = new Random();
	
	@Override
	public int roll() 
	{
		int roll1 = rand.nextInt(6) +1;
        int roll2 = rand.nextInt(6) +1;
        int sum = roll1 + roll2;
        return sum;
	}
	
	
}
