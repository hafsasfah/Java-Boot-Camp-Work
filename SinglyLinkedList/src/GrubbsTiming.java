import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class GrubbsTiming {

	public static void main(String[] args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		
		Random random = new Random(1000);
		
		singlyLinkedList.addToFront( random.nextInt());
		
		addRandNumbersToList("ArrayList", arrayList, 1000000);
		addRandNumbersToList("LinkedList", linkedList, 1000000);
		addRandNumbersToList("SinglyLinkedList", singlyLinkedList, 1000000);		
		
		addRandNumbersToList("ArrayList", arrayList, 1000000);
		addRandNumbersToList("LinkedList", linkedList, 1000000);
		addRandNumbersToList("SinglyLinkedList", singlyLinkedList, 10000);
		
		

		
	}
	
	public static void addRandNumbersToList( String name, List<Integer> list, int numbersToAdd)
	{
		Random number = new Random(1000);
		long startTime, finishTime, elapsedTime;
		
		startTime = System.nanoTime();
		/*
		for( int count = 0;)
		{
			
			add(random.nextInt());
		}
		*/
	}
}