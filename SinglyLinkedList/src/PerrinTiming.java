import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class PerrinTiming {
static int HighRandom = 10000000;
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
			
		addRandomNumbersToList( "arrayList", arrayList, 1000 );
		checkListsForContainsRandomNumber( "arrayList", arrayList, 100 );
		addRandomNumbersToList( "linkedList", linkedList, 1000 );
		checkListsForContainsRandomNumber( "linkedList", linkedList, 100 );
		addRandomNumbersToList( "singlyLinkedList", (List<Integer>) singlyLinkedList, 1000 );
		checkListsForContainsRandomNumber( "singlyLinkedList", (List<Integer>) singlyLinkedList, 100 );
		
		addRandomNumbersToList( "arrayList", arrayList, 1000000 );
		checkListsForContainsRandomNumber( "arrayList", arrayList, 10000 );
		addRandomNumbersToList( "linkedList", linkedList, 1000000 );
		checkListsForContainsRandomNumber( "linkedList", linkedList, 10000 );
		addRandomNumbersToList( "singlyLinkedList", (List<Integer>) singlyLinkedList, 1000000 );
		checkListsForContainsRandomNumber( "singlyLinkedList", (List<Integer>) singlyLinkedList, 10000 );
		
	}
	
	public static void addRandomNumbersToList( String name, List<Integer> list, int numbersToAdd )
	{
		Random random = new Random(50);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
			list.add( random.nextInt(HighRandom) );
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
			if ( list.contains( random.nextInt(HighRandom) ) )
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

