package Assignment14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Assignment14 {

	static int highestRandomNumber = 10000000;
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		TreeSet<Integer> treeList = new TreeSet<Integer>();
		HashSet<Integer> hashList = new HashSet<Integer>();
		
		addRandomNumbersToArrayList("arrayList", arrayList, 1000);
		addRandomNumbersToTreeList("treeList", treeList, 1000);
		addRandomNumbersToHashList("hashList", hashList, 1000);
		
		checkListsForContainsRandomNumberArrayList("arrayList", arrayList, 10000);
		checkListsForContainsRandomNumberForTreeList("treeList", treeList, 10000);
		checkListsForContainsRandomNumberForHashList("hashList", hashList, 10000);
		
		removeRandomNumbersArrayList("arrayList", arrayList, 100000);
		removeRandomNumbersInTreeList("treeList", treeList, 100000);
		removeRandomNumbersHashList("hashList", hashList, 100000);
		
	}
	
	public static void addRandomNumbersToArrayList( String name, List<Integer> list, int numbersToAdd )
	{
		Random random = new Random(50);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
			list.add( random.nextInt(highestRandomNumber) );
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Adding %d to %s took %f millseconds\n\n", numbersToAdd, name, elapsedTime / 1000000.0 );
	}
	
	public static void addRandomNumbersToTreeList( String name,TreeSet<Integer>treeList, int numbersToAdd )
	{
		Random random = new Random(50);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
			treeList.add( random.nextInt(highestRandomNumber) );
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Adding %d to %s took %f millseconds\n\n", numbersToAdd, name, elapsedTime / 1000000.0 );
	}
	
	public static void addRandomNumbersToHashList( String name, HashSet<Integer>hashList, int numbersToAdd )
	{
		Random random = new Random(50);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
			hashList.add( random.nextInt(highestRandomNumber) );
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Adding %d to %s took %f millseconds\n\n", numbersToAdd, name, elapsedTime / 1000000.0 );
	}
	
	
	
	public static void checkListsForContainsRandomNumberArrayList( String name, List<Integer> list, int numbersToCheck )
	{
		Random random = new Random(42);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		int matches = 0;
		for ( int count = 0; count < numbersToCheck; count++ )
		{
			if ( list.contains( random.nextInt(highestRandomNumber) ) )
			{
				matches++;
			}
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Checking %d to %s took %f millseconds and found %d matches\n\n", 
				numbersToCheck, name, elapsedTime / 1000000.0, matches );
	}
	
	
	
	public static void checkListsForContainsRandomNumberForTreeList( String name,TreeSet<Integer>treeList, int numbersToCheck )
	{
		Random random = new Random(42);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		int matches = 0;
		for ( int count = 0; count < numbersToCheck; count++ )
		{
			if ( treeList.contains( random.nextInt(highestRandomNumber) ) )
			{
				matches++;
			}
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Checking %d to %s took %f millseconds and found %d matches\n\n", 
				numbersToCheck, name, elapsedTime / 1000000.0, matches );
	}
	
	public static void checkListsForContainsRandomNumberForHashList( String name, HashSet<Integer>hashList, int numbersToCheck )
	{
		Random random = new Random(42);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		int matches = 0;
		for ( int count = 0; count < numbersToCheck; count++ )
		{
			if ( hashList.contains( random.nextInt(highestRandomNumber) ) )
			{
				matches++;
			}
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Checking %d to %s took %f millseconds and found %d matches\n\n", 
				numbersToCheck, name, elapsedTime / 1000000.0, matches );
	}
	
	public static void removeRandomNumbersArrayList(String name, List<Integer> list, int removeNumbers)
	{
		
		Random random = new Random(1000);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		int matches = 0;
		for (Integer integer : new ArrayList<Integer>(list)) {
		    if (integer < 3) {
		        list.remove(random.nextInt(highestRandomNumber));
		    }
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Removing %d to %s took %f millseconds and removed %d matches\n\n", 
				removeNumbers, name, elapsedTime / 1000000.0, matches );
	}
	
	
	
	
	public static void removeRandomNumbersInTreeList(String name, TreeSet<Integer>treeList, int removeNumbers)
	{
		
		Random random = new Random(1000);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		int matches = 0;
		for (Integer integer : new TreeSet<Integer>(treeList)) {
		    if (integer < 3) {
		        treeList.remove(random.nextInt(highestRandomNumber));
		    }
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Removing %d to %s took %f millseconds and removed %d matches\n\n", 
				removeNumbers, name, elapsedTime / 1000000.0, matches );
	}
	
	public static void removeRandomNumbersHashList(String name, HashSet<Integer>hashList, int removeNumbers)
	{
		
		Random random = new Random(1000);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		int matches = 0;
		for (Integer integer : new HashSet<Integer>(hashList)) {
		    if (integer < 3) {
		        hashList.remove(random.nextInt(highestRandomNumber));
		    }
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Removing %d to %s took %f millseconds and removed %d matches\n\n", 
				removeNumbers, name, elapsedTime / 1000000.0, matches );
	}
	
	
		
}
		