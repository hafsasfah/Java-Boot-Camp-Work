import java.util.*;

public class hafsaTiming<E> extends SinglyLinkedList<E> {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		
		// add to list
		/*
		addToList("Array: ", arrayList, 1000);
		addToList("Linked: ", linkedList, 1000);
		addToList("Singly-linked: ", singlyLinkedList, 1000);
		addToList("Array: ", arrayList, 1000000);
		addToList("Linked: ", linkedList, 1000000);
		addToList("Singly-linked: ", singlyLinkedList, 1000000);
		*/
		
		// contains, check if any number occurs 100 times
		contains("arraylist contains(100): ", arrayList, 100);
		contains("linkedlist contains(100): ", linkedList, 100);
		contains("singlyLinkedList contains(100): ", singlyLinkedList, 100);
		
		contains("arraylist contains(mill): ", arrayList, 1000000);
		contains("linkedlist contains(mill): ", linkedList, 1000000);
		contains("singlyLinkedList contains(mill): ", singlyLinkedList, 1000000);
		
	}	
	
	public static void contains(String s, List<Integer> list, int n) {
		double startTime, finishTime, elapsedTime;
		/*int counter0 = 0; int counter1 = 0; int counter2 = 0; int counter3 = 0; int counter4 = 0;*/ 
		
		startTime = System.nanoTime();
		
		Random rand = new Random();
		 
		for (int i = 0; i < n; i++) {
			int r = rand.nextInt(5);
			list.add(r);
		}		
		
		for (int i = 0; i < n; i++) {
			int r = rand.nextInt(5);
			list.contains(r);
			/*if (r == 0) {
				counter0++;
			}
			else if (r == 1) {
				counter1++;
			}
			else if (r == 2) {
				counter2++;
			}
			else if (r == 3) {
				counter3++;
			}
			else if (r == 4) {
				counter4++;
			} */
		}
		
		/*System.out.println("0 occurs: " + counter0 + " times\n1 occurs: " + counter1 + " times\n2 occurs: "
				+ counter2 + " times\n3 occurs: " + counter3 + " times\n4 occurs: " + counter4 + " times");*/
			
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		System.out.println(s + (elapsedTime/1000000) + " ms");
		}
	
	
	public static void addToList(String s, List<Integer> list, int n) {
		double startTime, finishTime, elapsedTime;
		Random rand = new Random(n);
		startTime = System.nanoTime();
		
		for (int i = 0; i < n; i++) {
			list.add(rand.nextInt());
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		System.out.println(s + (elapsedTime/1000000) + " ms");
	}
}