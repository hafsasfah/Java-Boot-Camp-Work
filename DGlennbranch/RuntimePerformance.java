package Java3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class RuntimePerformance 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();

		long startTime = System.currentTimeMillis();
		
		// add
		for (int i = 0; i < 100000; i++) 
		{
			Random random = new Random();
			treeSet.add(random.nextInt(1000000));
		}
		
		long timeTreeAdd = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		
		// remove
		
		for (int i = 0; i < 10000; i++) 
		{
			Random random = new Random();
			treeSet.remove(random.nextInt(1000000));
		}

		long timeTreeRemove = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) 
		{
			Random random = new Random();

			if (treeSet.contains(random.nextInt(1000000))) 
			{
				// System.out.println();
			}
		}

		long timetreeSearch = System.currentTimeMillis() - startTime;

		// for arrayList

		startTime = System.currentTimeMillis();
		
		// add
		
		for (int i = 0; i < 100000; i++)
		{
			Random random = new Random();
			arrayList.add(random.nextInt(1000000));
		}
		
		long timeArrayListAdd = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		
		// remove
		for (int i = 0; i < 10000; i++) 
		{
			Random random = new Random();
			arrayList.remove((Integer) random.nextInt(1000000));
		}

		long timeArrayListRemove = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) 
		{
			Random random = new Random();

			if (arrayList.contains(random.nextInt(1000000))) 
			{
				// System.out.println();
			}
		}

		long timeArrayListSearch = System.currentTimeMillis() - startTime;

		// for hashSet
		
		startTime = System.currentTimeMillis();
		
		// add
		for (int i = 0; i < 100000; i++) 
		{
			Random random = new Random();
			hashSet.add(random.nextInt(1000000));
		}
		
		long timeHashAdd = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		
		// remove
		
		for (int i = 0; i < 10000; i++)
		{
			Random random = new Random();
			hashSet.remove(random.nextInt(1000000));
		}

		long timeHashRemove = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) 
		{
			Random random = new Random();

			if (hashSet.contains(random.nextInt(1000000))) 
			{
				// System.out.println();
			}
		}

		long timeHashSearch = System.currentTimeMillis() - startTime;

		System.out.println("Arraylist Performance: ");
		System.out.println("Addition: " + timeArrayListAdd + " ms");
		System.out.println("Remove: " + timeArrayListRemove + " ms");
		System.out.println("Search: " + timeArrayListSearch + " ms\n");

		System.out.println("Hashset Performance: ");
		System.out.println("Addition: " + timeHashAdd + " ms");
		System.out.println("Remove: " + timeHashRemove + " ms");
		System.out.println("Search: " + timeHashSearch + " ms\n");

		System.out.println("TreeSet Performance: ");
		System.out.println("Addition: " + timeTreeAdd + " ms");
		System.out.println("Remove: " + timeTreeRemove + " ms");
		System.out.println("Search: " + timetreeSearch + " ms\n");

	}

}
