package models;

import java.util.Random;
import java.util.Scanner;

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

	public static Object getRoll() {
		
		int number; 
		Random randomNumbers = new Random();
		do{
			number = randomNumbers.nextInt(12)+1;
			System.out.println (number);
		}while((number)>13);
		
		return number;
		

		
	}
	
	
}
