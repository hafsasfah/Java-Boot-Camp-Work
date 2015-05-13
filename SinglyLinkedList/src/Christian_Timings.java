
import java.util.*;
public class Christian_Timings {
	private static int numbeOfMatches;
	public static void main(String[] args){
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singleListList = new SinglyLinkedList<Integer>();
		
		
		
		
		
		
		
	
		int entries = 1000;
	System.out.println("Arraylist Time\tLinkedlist Time\tSinglylinkedlist time")	;
	System.out.println(ListTimer(arrayList,entries)+"\t\t"+ListTimer(linkedList,entries)+"\t\t"+ListTimer(singleListList,entries) +"\t\tat "+entries+" Entries");
	entries = 1000000;
	System.out.println(ListTimer(arrayList,entries)+"\t"+ListTimer(linkedList,entries)+"\t"+ListTimer(singleListList,entries) +"\tat "+entries+" Entries");
	
	}
	public static long ListTimer(List list, int numberToInsert){	
		
		long startTime,finishTime;
		Random random = new Random(1000);
		startTime = System.nanoTime();
			for (int i = 0;i< numberToInsert;i++){
			list.add(random.nextInt());
			
		}
			finishTime = System.nanoTime();
			return finishTime-startTime;	
		
		}
	public static long ContainsTimer(List<Integer> list, int num){
		long startTime,finishTime;
		numbeOfMatches=0;
		Random random = new Random(100);
		startTime = System.nanoTime();
			for (int i = 0;i<=num;i++){
		if(list.contains(random.nextInt(1000))){
			numbeOfMatches++;}
		}
			finishTime = System.nanoTime();
			return finishTime-startTime;
		
	}
	
	
	
	
	
	
	
	
	
/*	
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
	
	
	}*/
	
	
}