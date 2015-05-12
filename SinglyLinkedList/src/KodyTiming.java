import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;


public class KodyTiming
{
	public static void main(String[] args)
	{
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
	
	addRandomNumbersToList(arrayList, 1000);
	addRandomNumbersToList(linkedList, 1000);
	addRandomNumbersToList(singlyLinkedList, 1000);
	
	
	}
	
	public static void addRandomNumbersToList(List<Integer> list, int numbersToAdd)
	{
		Random random = new Random(1000);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		
		
		
	}
	
	
}


