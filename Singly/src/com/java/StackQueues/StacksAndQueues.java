package com.java.StackQueues;
import java.util.*;

public class StacksAndQueues {
	
	public static void main(String[] args)
	{
		// Generate a stack of Integers
		// Generate 100 random numbers
		// loop while
			// if number > current top, push
			// else pop the current number off
			// check again
		
		Random random = new Random();
		Stack<Integer> stack = new Stack<Integer>();
		int numbersToGenerate = 100;
		int highestRandomNumber = 10000;
		
		for(int count = 0; count < numbersToGenerate; count++)
		{
				int nextRandomNumber = random.nextInt(highestRandomNumber);
				while(!stack.isEmpty() && nextRandomNumber <= stack.peek())
				{
					System.out.println("popping:" + stack.pop());
				}
		 stack.push(nextRandomNumber);
		}
		System.out.println();
		System.out.println("Final state of stack");
		while(!stack.isEmpty());
		{
			System.out.println(stack.pop());
		}
	}
}
