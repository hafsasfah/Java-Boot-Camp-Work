import java.util.*;

public class hafsaTiming {
	static int highestNumber = 100;
	public static void main(String [] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		
		/*
		// add to list
		addToList("Array: ", arrayList, 1000);
		addToList("Linked: ", linkedList, 1000);
		addToList("Singly-linked: ", singlyLinkedList, 1000);
		addToList("Array: ", arrayList, 1000000);
		addToList("Linked: ", linkedList, 1000000);
		addToList("Singly-linked: ", singlyLinkedList, 1000000);
		*/
		
		// contains, check if any number occurs 100 times
		contains("arraylist ", arrayList, 1000, 100);
		contains("linkedlist ", linkedList, 1000, 100);
		contains("singlyLinkedList ", singlyLinkedList, 1000, 100);
		
		contains("arraylist ", arrayList, 1000000, 10000);
		contains("linkedlist ", linkedList, 1000000, 10000);
		contains("singlyLinkedList ", singlyLinkedList, 1000000, 10000);
		
	}	
	
	public static void contains(String s, List<Integer> list, int n, int check) {
		double startTime, finishTime, elapsedTime;
		int counter = 0;
		
		startTime = System.nanoTime();
		
		Random rand = new Random(50);
		 
		for (int i = 0; i < n; i++) {
			int r = rand.nextInt(highestNumber*n);
			list.add(r);
		}		
		
		rand = new Random(40);
		for (int i = 0; i < check; i++) {
			int r = rand.nextInt(highestNumber);
			if (list.contains(r)) {
				counter++;
			}
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		System.out.println(s + " for " + n + " has " + counter + " match(es) and took " + 
				(elapsedTime/1000000) + " ms");
	}
}