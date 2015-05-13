import java.util.*;


public class StacksandQueues
{

	public static void main(String[] args)
	{
		//create stack of ints
		//Generate 100 random numbers
			//if number > current top, push
		//else pop the current number off
		//check again
		
		Stack<Integer> myStack = new Stack<Integer>();
		addRandomNumbersToQueue(myStack, 100);
		testStack(myStack);
		
	}
	
	
	public static void testStack(Stack<Integer> stack)
	{
		Random rand = new Random();
		int randomnum = rand.nextInt((1000 - 0) + 1);
		while(!(stack.isEmpty()))
		{
			if(stack.peek() > randomnum)
			{
				stack.pop();
			}
			
		}
		System.out.println(stack);
	}
	
	public static void addRandomNumbersToQueue(Stack<Integer> list, int genAmount )
	{
		Random rand = new Random();

		
		for ( int count = 0; count < genAmount; count++ )
		{
			int randomnum = rand.nextInt((1000 - 0) + 1);
			list.add( randomnum );
		}

		System.out.println(list);
	}
	
}
