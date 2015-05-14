import java.util.*;

public class BlairTimining {
	static int highestRandomNumber= 10000000;
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
			
		addRandomNumbersToList( "arrayList", arrayList, 400 );
		checkListsForContainsRandomNumber( "arrayList", arrayList, 10 );
		addRandomNumbersToList( "linkedList", linkedList, 300);
		checkListsForContainsRandomNumber( "linkedList", linkedList, 20 );
		addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 200 );
		checkListsForContainsRandomNumber( "singlyLinkedList", singlyLinkedList, 10 );
		
		addRandomNumbersToList( "arrayList", arrayList, 500 );
		checkListsForContainsRandomNumber( "arrayList", arrayList, 10);
		addRandomNumbersToList( "linkedList", linkedList, 200 );
		checkListsForContainsRandomNumber( "linkedList", linkedList, 30);
		addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 300 );
		checkListsForContainsRandomNumber( "singlyLinkedList", singlyLinkedList, 40);
		
	}
	
	public static void addRandomNumbersToList( String name, List<Integer> list, int numbersToAdd )
	{
	
		Random random = new Random(25);
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
	
	public static void checkListsForContainsRandomNumber( String name, List<Integer> list, int numbersToCheck )
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
