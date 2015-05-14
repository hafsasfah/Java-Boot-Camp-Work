import java.util.*;

public class DomWTiming {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		
	}
	
	public long randomTimer (int n)
	{
		Random r = new Random();
		
		// add 1,000 ints to each, get timings
		// add 1,000,000 ints to each, get timings
		
		long startTime, finishTime, elapsedTime;
		
		int[] x = new int [n];
		for (int i = 0; i < n; i++)
			x[i] = r.nextInt();
		startTime = System.nanoTime();
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		return elapsedTime;
		}
	
	public static void addRandomNumbersToList(String name, List<Integer> list, int numbersToAdd)
	{
		Random number = new Random(1000);
		long startTime, finishTime, elapsedTime;
		
		startTime = System.nanoTime();
		
		int matches = 0;
		
		for(int count = 0; count < numbersToCheck; count++)
		{
			if(list.contains(random.nextInt(highestRandomNumber)))
			{
				matches++;
			}
						
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Checking %d to %s took %f millseconds and found %d matches\n\n", 
				numbersToCheck, name, elapsedTime / 1000000.0, matches );
	}
	
	public static void checkListsForContainsNumber(String name, List<Integer> list, int numbersToAdd)
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
	
}
