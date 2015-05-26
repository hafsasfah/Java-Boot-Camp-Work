

import java.util.*;

public class RuntimeAnalysis
{

	public static void main(String[] args)
	
	{
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		addNumbersToLists("arraylist", 1000000,arraylist);
		addNumbersToTreeSets("treeset", 1000000,treeset);
		addNumbersToHashSets("hashset", 1000000,hashset);
		System.out.print("\n");
		removeNumbersfromArrayLists("arraylist", 10000,arraylist);
		removeNumbersfromTreeSets("treeset", 10000,treeset);
		removeNumbersfromHashSets("hashset", 10000,hashset);
		
		searchNumbersfromArrayLists("arraylist", 10000,arraylist);
		searchNumbersfromTreeSets("treeset", 10000,treeset);
		searchNumbersfromHashSets("hashset", 10000,hashset);

		
		
		
		
	}
	

	public static void addNumbersToTreeSets(String listname, int amountOfNumbersToAdd, TreeSet<Integer> passedList)
	{
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		
		for(int i = 0; i <= amountOfNumbersToAdd; i++)
		{
			passedList.add(ran.nextInt(1000000) + 1);
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to add all numbers was " + elapsedTime/1000000000.0 + " seconds.");
	}
	
	public static void addNumbersToLists(String listname, int amountOfNumbersToAdd, ArrayList<Integer> passedList)
	{
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		
		for(int i = 0; i <= amountOfNumbersToAdd; i++)
		{
			passedList.add(ran.nextInt(1000000) + 1);
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to add all numbers was " + elapsedTime/1000000000.0 + " seconds.");
	}
	
	public static void addNumbersToHashSets(String listname, int amountOfNumbersToAdd, HashSet<Integer> passedList)
	{
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		
		for(int i = 0; i <= amountOfNumbersToAdd; i++)
		{
			passedList.add(ran.nextInt(1000000) + 1);
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to add all numbers was " + elapsedTime/1000000000.0 + " seconds.");
	}
	
	public static void removeNumbersfromTreeSets(String listname, int amountOfNumbersToRemove, TreeSet<Integer> passedList)
	{
		int removedNumberCounter = 0;
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		int randomNumber= 0;
		
		for(int i = 0; i <= amountOfNumbersToRemove; i++)
		{
			randomNumber = ran.nextInt((1000000) + 1);
			if(passedList.contains(randomNumber))
			{
				passedList.remove(randomNumber);
				removedNumberCounter++;
			}
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to try to remove all numbers was " + elapsedTime/1000000000.0 + " seconds.");
		System.out.println("The amount of removed numbers was " + removedNumberCounter + "\n");
	}
	public static void removeNumbersfromHashSets(String listname, int amountOfNumbersToRemove, HashSet<Integer> passedList)
	{
		int removedNumberCounter = 0;
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		int randomNumber= 0;
		
		for(int i = 0; i <= amountOfNumbersToRemove; i++)
		{
			randomNumber = ran.nextInt((1000000) + 1);
			if(passedList.contains(randomNumber))
			{
				passedList.remove(randomNumber);
				removedNumberCounter++;
			}
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to try to remove all numbers was " + elapsedTime/1000000000.0 + " seconds.");
		System.out.println("The amount of removed numbers was " + removedNumberCounter + "\n");
	}
	public static void removeNumbersfromArrayLists(String listname, int amountOfNumbersToRemove, ArrayList<Integer> passedList)
	{
		int removedNumberCounter = 0;
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		int randomNumber= 0;
		
		for(int i = 0; i <= amountOfNumbersToRemove; i++)
		{
			randomNumber = ran.nextInt((1000000) + 1);
			if(passedList.contains(randomNumber))
			{
				passedList.indexOf(randomNumber);
				removedNumberCounter++;
			}
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to try to remove all numbers was " + elapsedTime/1000000000.0 + " seconds.");
		System.out.println("The amount of removed numbers was " + removedNumberCounter + "\n");
	}
	
	public static void searchNumbersfromTreeSets(String listname, int amountOfNumbersToRemove, TreeSet<Integer> passedList)
	{
		int removedNumberCounter = 0;
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		int randomNumber= 0;
		
		for(int i = 0; i <= amountOfNumbersToRemove; i++)
		{
			randomNumber = ran.nextInt((1000000) + 1);
			if(passedList.contains(randomNumber))
			{
				removedNumberCounter++;
			}
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to try to search all numbers was " + elapsedTime/1000000000.0 + " seconds.");
		System.out.println("The amount of matches was " + removedNumberCounter + "\n");
	}
	
	public static void searchNumbersfromHashSets(String listname, int amountOfNumbersToRemove, HashSet<Integer> passedList)
	{
		int removedNumberCounter = 0;
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		int randomNumber= 0;
		
		for(int i = 0; i <= amountOfNumbersToRemove; i++)
		{
			randomNumber = ran.nextInt((1000000) + 1);
			if(passedList.contains(randomNumber))
			{
				removedNumberCounter++;
			}
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to try to search all numbers was " + elapsedTime/1000000000.0 + " seconds.");
		System.out.println("The amount of matches was " + removedNumberCounter + "\n");
	}
	
	public static void searchNumbersfromArrayLists(String listname, int amountOfNumbersToRemove, ArrayList<Integer> passedList)
	{
		int removedNumberCounter = 0;
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		Random ran = new Random();
		int randomNumber= 0;
		
		for(int i = 0; i <= amountOfNumbersToRemove; i++)
		{
			randomNumber = ran.nextInt((1000000) + 1);
			if(passedList.contains(randomNumber))
			{
				removedNumberCounter++;
			}
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("The amount of time " + listname + " took to try to search all numbers was " + elapsedTime/1000000000.0 + " seconds.");
		System.out.println("The amount of matches was " + removedNumberCounter + "\n");
	}
	
	
	
	
}
