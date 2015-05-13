import java.util.*;
public class KodyTiming {

	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
			
		addRandomNumbersToList( "arrayList", arrayList, 1000 );
		addRandomNumbersToList( "linkedList", linkedList, 1000 );
		addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 1000 );
		
		checkRandomNumbers( "ArrayList", arrayList, 100);
		checkRandomNumbers( "linkedList", linkedList, 100);
		checkRandomNumbers( "singlyLinkedList", singlyLinkedList, 100);
		
		//addRandomNumbersToList( "arrayList", arrayList, 10000000 );
		//addRandomNumbersToList( "linkedList", linkedList, 10000000 );
		//addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 10000000 );

	}
	
	public static void addRandomNumbersToList( String name, List<Integer> list, int numbersToAdd )
	{
		Random rand = new Random();
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
			int randomnum = rand.nextInt((50 - 0) + 1);
			list.add( randomnum );
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println(list);
		System.out.printf( "Adding %d to %s took %f millseconds\n", numbersToAdd, name, elapsedTime / 1000000.0 );
		//System.out.println(permrandomnum + " appeared " + total + " times in " + name + ".");

	}
	
	public static void checkRandomNumbers(String name, List<Integer> list, int searchnumber)
	{
		
		//check if the list contains a specific randomly generated number at least 100 times
		Random rand = new Random();
		int totalcounter = 0;
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();		
		for ( int count = 0; count < searchnumber; count++ )
		{
			int tempnum = rand.nextInt((50 - 0) + 1);
			if(list.contains(tempnum))
			{
				totalcounter++;
			}
		}
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.println("There were " + totalcounter + " matches.");
		System.out.printf(name + "check took %f millseconds to run.\n", elapsedTime / 1000000.0 );
		

	}
	
}
