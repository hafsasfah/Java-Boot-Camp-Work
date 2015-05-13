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
		
		//checkRandomNumbers( "ArrayList", arrayList);
		
		addRandomNumbersToList( "arrayList", arrayList, 10000000 );
		addRandomNumbersToList( "linkedList", linkedList, 10000000 );
		addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 10000000 );

	}
	
	public static void addRandomNumbersToList( String name, List<Integer> list, int numbersToAdd )
	{
		int total = 0;
		Random rand = new Random();
		int permrandomnum =  rand.nextInt((50 - 0) + 1);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
			int randomnum = rand.nextInt((50 - 0) + 1);
			list.add( randomnum );
			if(permrandomnum == randomnum)
			{
				total++;
			}
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Adding %d to %s took %f millseconds\n", numbersToAdd, name, elapsedTime / 1000000.0 );
		System.out.println(permrandomnum + " appeared " + total + " times in " + name + ".");

	}
	
}
