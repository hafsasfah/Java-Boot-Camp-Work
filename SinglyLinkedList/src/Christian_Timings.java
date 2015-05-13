
import java.util.*;
public class Christian_Timings {
	public static void main(String[] args){
	//add 1,000 ints to each, get timings
	//add 1,000,000 ints to each list, get timings
		int entries = 1000;
	System.out.println("Arraylist Time\tLinkedlist Time\tSinglylinkedlist time")	;
	System.out.println(arrayListTimer(entries)+"\t\t"+linkedListTimer(entries)+"\t\t"+SinglyLinkedListTimer(entries) +"\t\tat "+entries+" Entries");
	entries = 1000000;
	System.out.println(arrayListTimer(entries)+"\t"+linkedListTimer(entries)+"\t"+SinglyLinkedListTimer(entries) +"\tat "+entries+" Entries");
	
	}
	public static long ListTimer(List list, int numberToInsert){	
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		long startTime,finishTime;
		Random random = new Random(1000);
		startTime = System.nanoTime();
			for (int i = 0;i< numberToInsert;i++){
			arrayList.add(random.nextInt());
			
		}
			finishTime = System.nanoTime();
			return finishTime-startTime;	
		
		}
	
public static long arrayListTimer(int numberToInsert){	
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	long startTime,finishTime;
	Random random = new Random(1000);
	startTime = System.nanoTime();
		for (int i = 0;i< numberToInsert;i++){
		arrayList.add(random.nextInt());
		
	}
		finishTime = System.nanoTime();
		return finishTime-startTime;	
	
	}
public static long linkedListTimer(int numberToInsert){	
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	long startTime,finishTime;
	Random random = new Random(1000);
	startTime = System.nanoTime();
		for (int i = 0;i< numberToInsert;i++){
			linkedList.add(random.nextInt());
		
	}
		finishTime = System.nanoTime();
		return finishTime-startTime;
	
	}
public static long SinglyLinkedListTimer(int numberToInsert){	
	SinglyLinkedList<Integer> singleListList = new SinglyLinkedList<Integer>();
	long startTime,finishTime;
	Random random = new Random(1000);
	startTime = System.nanoTime();
		for (int i = 0;i< numberToInsert;i++){
			singleListList.add(random.nextInt());
		
	}
		finishTime = System.nanoTime();
		return finishTime-startTime;
	
	
	}
	
	
}