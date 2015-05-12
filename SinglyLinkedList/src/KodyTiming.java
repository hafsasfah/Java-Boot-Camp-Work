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
		
		checkRandomNumbers( "ArrayList", arrayList, 100 );
		checkRandomNumbers( "linkedList", singlyLinkedList, 100);
		checkRandomNumbers( "singlyLinkedList", singlyLinkedList, 100);
		
		addRandomNumbersToList( "arrayList", arrayList, 10000000 );
		addRandomNumbersToList( "linkedList", linkedList, 10000000 );
		addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 10000000 );
	}
	
	public static void addRandomNumbersToList( String name, List<Integer> list, int numbersToAdd )
	{
		Random random = new Random(50);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
			list.add( random.nextInt() );
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Adding %d to %s took %f millseconds\n\n", numbersToAdd, name, elapsedTime / 1000000.0 );
	}
	
	public static void checkRandomNumbers(String name, List<Integer> list, int numcheck)
	{
		if(list.size()>=numcheck)
		{
			System.out.println(name + " contains at least " + numcheck + " elements." +"\n");
		}
		
		
		
	}
}
