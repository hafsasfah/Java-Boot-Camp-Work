import java.util.*;

public class Hmwrk {

	static int randomNumber = 10000000;
	
	public static void main(String[] args)
	{
	
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
		Random rand = new Random();
		
		int num= 1000000;
		long startTime, endTime, totalTime;
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) 
		{
			arrayList.add(rand.nextInt(num));
		}		
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("ArrayList add time: " + totalTime);
			
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			arrayList.contains(rand.nextInt(num));
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("ArrayList search time: " + totalTime);		

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			arrayList.remove(i);
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("ArrayList remove time: " + totalTime);
			
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++)
		{
			treeSet.add(rand.nextInt( num));
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("TreeSet add time: " + totalTime);
			
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			treeSet.contains(rand.nextInt( num));
		}
		
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("TreeSet search time: " + totalTime);
			
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
		{
			treeSet.remove(i);
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("TreeSet remove time: " + totalTime);

		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) 
		{
			hashSet.add(rand.nextInt( num));
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("HashSet add time: " + totalTime);		
			
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			hashSet.contains(rand.nextInt( num));
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("HashSet search time: " + totalTime);

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) 
		{
			hashSet.remove(i);
		}
			
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / num;
		System.out.println("HashSet remove time: " + totalTime);
		}
}