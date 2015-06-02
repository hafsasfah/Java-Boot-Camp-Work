package logic;
import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

	private  int number;
	
	
	
	public static int getRoll()
	{
		
		int number; 
		
		Scanner keyboard = new Scanner(System.in);
		
		Random randomNumbers = new Random();
		
		do{
			
			number = randomNumbers.nextInt(12)+1;
			System.out.println (number);
			
		}while((number)>13);
		return number;
		

	}
	
	
	
}
