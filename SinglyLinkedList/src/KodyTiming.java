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
		
<<<<<<< HEAD
<<<<<<< HEAD
		//checkRandomNumbers( "ArrayList", arrayList);
=======
		checkRandomNumbers( "ArrayList", arrayList, 100 );
		checkRandomNumbers( "linkedList", singlyLinkedList, 100);
		checkRandomNumbers( "singlyLinkedList", singlyLinkedList, 100);
>>>>>>> parent of c4581f8... Checking numbers sofar2
=======
		checkRandomNumbers( "ArrayList", arrayList, 100 );
		checkRandomNumbers( "linkedList", singlyLinkedList, 100);
		checkRandomNumbers( "singlyLinkedList", singlyLinkedList, 100);
>>>>>>> parent of c4581f8... Checking numbers sofar2
		
		addRandomNumbersToList( "arrayList", arrayList, 10000000 );
		addRandomNumbersToList( "linkedList", linkedList, 10000000 );
		addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 10000000 );
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> parent of c4581f8... Checking numbers sofar2
=======
>>>>>>> parent of c4581f8... Checking numbers sofar2
	}
	
	public static void addRandomNumbersToList( String name, List<Integer> list, int numbersToAdd )
	{
<<<<<<< HEAD
<<<<<<< HEAD
		int total = 0;
		Random rand = new Random();
		int permrandomnum =  rand.nextInt((50 - 0) + 1);
=======
		Random random = new Random(50);
>>>>>>> parent of c4581f8... Checking numbers sofar2
=======
		Random random = new Random(50);
>>>>>>> parent of c4581f8... Checking numbers sofar2
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
<<<<<<< HEAD
<<<<<<< HEAD
			int randomnum = rand.nextInt((50 - 0) + 1);
			list.add( randomnum );
			if(permrandomnum == randomnum)
			{
				total++;
			}
=======
			list.add( random.nextInt() );
>>>>>>> parent of c4581f8... Checking numbers sofar2
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
<<<<<<< HEAD
		System.out.printf( "Adding %d to %s took %f millseconds\n", numbersToAdd, name, elapsedTime / 1000000.0 );
		System.out.println(permrandomnum + " appeared " + total + " times in " + name + ".");

=======
			list.add( random.nextInt() );
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
=======
>>>>>>> parent of c4581f8... Checking numbers sofar2
		System.out.printf( "Adding %d to %s took %f millseconds\n\n", numbersToAdd, name, elapsedTime / 1000000.0 );
	}
	
	public static void checkRandomNumbers(String name, List<Integer> list, int numcheck)
	{
		if(list.size()>=numcheck)
		{
			System.out.println(name + " contains at least " + numcheck + " elements." +"\n");
		}
		
		
		
>>>>>>> parent of c4581f8... Checking numbers sofar2
	}
	
}
