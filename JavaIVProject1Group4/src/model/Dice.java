package model;

import java.util.Random;

public class Dice implements iDice {
	private static Random random = new Random();
			
	public static int rollDie() {
		
		
		int num =(random.nextInt(11)+2);
		System.out.println(num);
		return num;
		
	}


}
