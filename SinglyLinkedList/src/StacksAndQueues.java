<<<<<<< HEAD
import java.util.Random;
import java.util.Stack;


public class StacksAndQueues{
	
	public static void main(String[] args)
	{
		int current;
		int numbersToGenerate;
		
		Stack<Integer> myStack = new Stack<Integer>();
		Random random = new Random(100);
		
		for(int i = 0; i < 100; i++)
		{
			
		}
			// if number > current top, push
			// else pop the current number off
			// check again
			
	}
	
	public void createStack()
	{


	}
}

=======
import java.util.*;

public class StacksAndQueues {

	public static void main(String[] args) {
		// Create a stack of Integers
		// Generate 100 random numbers
		// loop while number <= current top - stack.peek
			// if number > current top, push
			// else pop the current number off
			
		Random random = new Random();
		Stack<Integer> stack = new Stack<Integer>();
		int numbersToGenerate = 100;
		int highestRandomNumber = 10000;
		
		for( int count = 0; count < numbersToGenerate; count++ )
		{
			int nextRandomNumber = random.nextInt(highestRandomNumber);
			while ( !stack.isEmpty() && nextRandomNumber <= stack.peek() )
			{
				System.out.println( "popping: " + stack.pop() );
			}
			stack.push( nextRandomNumber );
		}
		System.out.println();
		System.out.println("Final state of stack");
		while( !stack.isEmpty() )
		{
			System.out.println( stack.pop() );
		}
	}

}
>>>>>>> origin/master
