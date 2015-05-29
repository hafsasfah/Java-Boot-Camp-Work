import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;


public class Chapter14Homework {
	

		static int highestRandomNumber = 10000000;
		
		public static void main(String[] args)
		{
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			TreeSet<Integer> treeList = new TreeSet<Integer>();
			HashSet<Integer> hashList = new HashSet<Integer>();
			
			addRandomNumbersToArrayList("arrayList", arrayList, 1000);
			addRandomNumbersToTreeList("treeList", treeList, 1000);
			addRandomNumbersToHashList("hashList", hashList, 1000);
			
			checkListsForContainsRandomNumberArrayList("arrayList", arrayList, 10000);
			checkListsForContainsRandomNumberForTreeList("treeList", treeList, 10000);
			checkListsForContainsRandomNumberForHashList("hashList", hashList, 10000);
			
			removeRandomNumbersArrayList("arrayList", arrayList, 100000);
			removeRandomNumbersInTreeList("treeList", treeList, 100000);
			removeRandomNumbersHashList("hashList", hashList, 100000);
			
		}
		
		public static void addRandomNumbersToArrayList( String name, List<Integer> list, int numToAdd )
		{
			Random random = new Random(30);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			
			for ( int count = 0; count < numToAdd; count++ )
			{
				list.add( random.nextInt(highestRandomNumber) );
			}
			
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print( "Adding "+numToAdd+ " to "+name+ " took "
					+elapsedTime+" millseconds.\n\n");
		}
		
		public static void addRandomNumbersToTreeList( String name,TreeSet<Integer>treeList, int numToAdd )
		{
			Random random = new Random(30);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			
			for ( int count = 0; count < numToAdd; count++ )
			{
				treeList.add( random.nextInt(highestRandomNumber) );
			}
			
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print( "Adding "+numToAdd+ " to "+name+ " took "
					+elapsedTime+" millseconds.\n\n");
		}
		
		public static void addRandomNumbersToHashList( String name, HashSet<Integer>hashList, int numToAdd )
		{
			Random random = new Random(30);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			
			for ( int count = 0; count < numToAdd; count++ )
			{
				hashList.add( random.nextInt(highestRandomNumber) );
			}
			
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print( "Adding "+numToAdd+ " to "+name+ " took "
					+elapsedTime+" millseconds.\n\n");
		}
		
		
		
		public static void checkListsForContainsRandomNumberArrayList( String name, List<Integer> list, int numToCheck )
		{
			Random random = new Random(66);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			int match = 0;
			for ( int count = 0; count < numToCheck; count++ )
			{
				if ( list.contains( random.nextInt(highestRandomNumber) ) )
				{
					match++;
				}
			}
			
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print( "Checking "+numToCheck+ " to "+name+ " took "+elapsedTime+ 
					" millseconds and found " +match+ " matches\n\n");
		}
		
		
		
		public static void checkListsForContainsRandomNumberForTreeList( String name,TreeSet<Integer>treeList, int numToCheck )
		{
			Random random = new Random(66);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			int match = 0;
			for ( int count = 0; count < numToCheck; count++ )
			{
				if ( treeList.contains( random.nextInt(highestRandomNumber) ) )
				{
					match++;
				}
			}
			
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print( "Checking "+numToCheck+ " to "+name+ " took "+elapsedTime+ 
					" millseconds and found " +match+ " matches\n\n");
		}
		
		public static void checkListsForContainsRandomNumberForHashList( String name, HashSet<Integer>hashList, int numToCheck )
		{
			Random random = new Random(66);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			int match = 0;
			for ( int count = 0; count < numToCheck; count++ )
			{
				if ( hashList.contains( random.nextInt(highestRandomNumber) ) )
				{
					match++;
				}
			}
			
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print( "Checking "+numToCheck+ " to "+name+ " took "+elapsedTime+ 
					" millseconds and found " +match+ " matches\n\n");
		}
		
		public static void removeRandomNumbersArrayList(String name, List<Integer> list, int removeNum)
		{
			
			Random random = new Random(1000);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			int match = 0;
			for (Integer integer : new ArrayList<Integer>(list)) {
			    if (integer < 3) {
			        list.remove(random.nextInt(highestRandomNumber));
			    }
			}
			
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print("Removing " +removeNum+ " to" +name+ " took" +elapsedTime+
			" millseconds and removed "+ match +" matches\n\n");
		}
		
		
		
		
		public static void removeRandomNumbersInTreeList(String name, TreeSet<Integer>treeList, int removeNum)
		{
			
			Random random = new Random(1000);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			int match = 0;
			for (Integer integer : new TreeSet<Integer>(treeList)) {
			    if (integer < 3) {
			        treeList.remove(random.nextInt(highestRandomNumber));
			    }
			}
			
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print( "Removing " +removeNum+ " to" +name+ " took" +elapsedTime+
					" millseconds and removed "+ match +" matches\n\n");
		}
		
		public static void removeRandomNumbersHashList(String name, HashSet<Integer>hashList, int removeNum)
		{
			
			Random random = new Random(1000);
			long startTime, finishTime, elapsedTime;
			startTime = System.nanoTime();
			int match = 0;
			for (Integer integer : new HashSet<Integer>(hashList)) {
			    if (integer < 3) {
			        hashList.remove(random.nextInt(highestRandomNumber));
			    }
			}
			finishTime = System.nanoTime();
			elapsedTime = finishTime - startTime;
			
			System.out.print( "Removing " +removeNum+ " to" +name+ " took" +elapsedTime+
					" millseconds and removed "+ match +" matches\n\n") 
					;
		}
		
		
			
	}

