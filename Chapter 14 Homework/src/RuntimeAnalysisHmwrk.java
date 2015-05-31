	import java.util.*;
	


	public class RuntimeAnalysisHmwrk {

		public static void main (String[]args)
		{
			 	ArrayList<Integer> arrayList = new ArrayList<Integer>();
			 	TreeSet<Integer> treeSet = new TreeSet<Integer>();
			 	HashSet<Integer> hashSet = new HashSet<Integer>();
				final int BILLZ = 1000000000;
				long start, end, total;
				Random rand = new Random();
				
				start = System.nanoTime();
				for (int i = 0; i < 100000; i++) 
				{ arrayList.add(rand.nextInt(BILLZ)); }		
				end = System.nanoTime();
				total = (end - start) / 1000000;
				System.out.println("The add time for a ArrayList is " + total);
				
				start = System.nanoTime();
				for (int i = 0; i < 10000; i++) 
				{ arrayList.contains(rand.nextInt(BILLZ)); }
				end = System.nanoTime();
				total = (end - start) / BILLZ;
				System.out.println("The search time for a ArrayList is: " + total);		

				start = System.nanoTime();
				for (int i = 0; i < 10000; i++) 
				{ arrayList.remove(i); }
				end = System.nanoTime();
				total = (end - start) /  BILLZ;
				System.out.println("The removal time for a ArrayList is: " + total);
				
				start = System.nanoTime();
				for (int i = 0; i < 100000; i++)
				{ treeSet.add(rand.nextInt( BILLZ)); }
				end = System.nanoTime();
				total = (end - start) / BILLZ;
				System.out.println("The add time for a TreeSet is: " + total);
				
				start = System.nanoTime();
				for (int i = 0; i < 10000; i++) 
				{ treeSet.contains(rand.nextInt( BILLZ)); }
				end = System.nanoTime();
				total = (end - start) /  BILLZ;
				System.out.println("The search time for a TreeSet is: " + total);
				
				start = System.nanoTime();
				for (int i = 0; i < 10000; i++) 
				{ treeSet.remove(i); }
				end = System.nanoTime();
				total = (end - start) /  BILLZ;
				System.out.println("The removal time for a TreeSet is: " + total);

				start = System.nanoTime();
				for (int i = 0; i < 100000; i++)
				{ hashSet.add(rand.nextInt( BILLZ)); }
				end = System.nanoTime();
				total = (end - start) /  BILLZ;
				System.out.println("The add time for a HashSet is: " + total);		
				
				start = System.nanoTime();
				for (int i = 0; i < 10000; i++) 
				{ hashSet.contains(rand.nextInt( BILLZ)); }
				end = System.nanoTime();
				total = (end - start) /  BILLZ;
				System.out.println("The search time for a HashSet is: " + total);

				start = System.nanoTime();
				for (int i = 0; i < 10000; i++) 
				{ hashSet.remove(i); }
				end = System.nanoTime();
				total = (end - start) /  BILLZ;
				System.out.println("The removal time for a HashSet is: " + total);
			}
}
