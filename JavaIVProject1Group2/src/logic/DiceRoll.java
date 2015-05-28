package logic;


import java.util.Random;
public class DiceRoll {
	
			static Random r =  new Random();
			static Random r2 = new Random();
		
			static int roll1 = r.nextInt(6);
			static int roll2  = r2.nextInt(6); 		
			
			
			public static int getRollOne()
			{
				
				return roll1;
			}
			
			public static void setRollOne(int aRollOne)
			{
				
				roll1 = aRollOne;
				
			}
			
			public static int getRollTwo()
			{
				
				return roll2;
				
			}
			
			public static void setRollTwo(int aRollTwo)
			{
				
				roll2 = aRollTwo;
				
			}
			
			
			
}
