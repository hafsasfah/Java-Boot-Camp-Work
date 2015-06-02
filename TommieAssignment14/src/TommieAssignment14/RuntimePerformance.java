package TommieAssignment14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class RuntimePerformance 

{
	public static void main (String[]args)
	{
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		final int mill = 1000000;
		long startTime, endTime, totalTime;
		
		Random rand = new Random();
			
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) 
		{
			arrayList.add(rand.nextInt(mill));
		}		
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / mill;
		System.out.println("ArrayList add time: " + totalTime);
			
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			arrayList.contains(rand.nextInt(mill));
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / mill;
		System.out.println("ArrayList search time: " + totalTime);		

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			arrayList.remove(i);
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) /  mill;
		System.out.println("ArrayList remove time: " + totalTime);
			
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++)
		{
			treeSet.add(rand.nextInt( mill));
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / mill;
		System.out.println("TreeSet add time: " + totalTime);
			
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			treeSet.contains(rand.nextInt( mill));
		}
		
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) /  mill;
		System.out.println("TreeSet search time: " + totalTime);
			
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
		{
			treeSet.remove(i);
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) /  mill;
		System.out.println("TreeSet remove time: " + totalTime);

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) 
		{
			hashSet.add(rand.nextInt( mill));
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) /  mill;
		System.out.println("HashSet add time: " + totalTime);		
			
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			hashSet.contains(rand.nextInt( mill));
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) /  mill;
		System.out.println("HashSet search time: " + totalTime);

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			hashSet.remove(i);
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) /  mill;
		System.out.println("HashSet remove time: " + totalTime);
		}
}