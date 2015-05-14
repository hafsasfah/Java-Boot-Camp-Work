import java.util.*;

public class StacksAndQueues 
{
	
	public static void main(String[]args)
	{
		// Create a stack of integers 
		// Generate 100 random numbers 
				//if number > current top, push 
				//else pop the current number off
				//check again - loop
		
		Random random = new Random ();
		Stack<Integer> myStack = new Stack<Integer>( );
		int numbersToGenerate = 100;
		int highestRandomNumbers = 10000; 
		
		for(int i = 0; i < numbersToGenerate; i++)
		{
			
			if(myStack.isEmpty())
			{
				
				myStack.push(random.nextInt(highestRandomNumbers));
			}
			else
			{
					int nextRandomNumber = random.nextInt();
					while(!myStack.empty() && nextRandomNumber <= myStack.peek())
					{
						System.out.println("popping: "	+ myStack.pop());
					}
					
					myStack.push(nextRandomNumber);
				}
			
			
			System.out.println();
			System.out.println("Final state of stack:");
			while(!myStack.empty())
			{
				System.out.println(myStack.pop());
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	

}
