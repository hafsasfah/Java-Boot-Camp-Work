import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;


public class Assignment14 {
/* @author: Hafsa Vahidy
 * 
 * Create a program that does runtime performance analysis of 
 * ArrayLists, TreeSets and HashSets.
 * Add 100,000 random random integers ( 0 - 1,000,000 )
 * Attempt to remove 10,000 random integers ( 0 - 1,000,000 )
 * Search for 10,000  random integers ( 0 - 1,000,000 )
 * Display the name of the data structure along with it's add, 
 * remove and search times.
 */
	
	public static void main(String[] args) {
		long startTime, endTime, totalTime;
		Random random = new Random();
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		HashSet<Integer> hashSet = new HashSet<Integer>();
// ArrayList Measurements
		// Add to ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			arrayList.add(random.nextInt(1000000));
		}		
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("ArrayList add time(s): " + totalTime);
		
		// Search in ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arrayList.contains(random.nextInt(1000000));
		}
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("ArrayList search time(s): " + totalTime);		

		// Remove from ArrayList
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("ArrayList remove time(s): " + totalTime);
		
// TreeSet Measurements
		// Add to TreeSet
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			treeSet.add(random.nextInt(1000000));
		}
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("TreeSet add time(s): " + totalTime);
		
		// Search in TreeSet
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			treeSet.contains(random.nextInt(1000000));
		}
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("TreeSet search time(s): " + totalTime);
		
		// Remove from TreeSet
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			treeSet.remove(i);
		}
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("TreeSet remove time(s): " + totalTime);
		
// HashSet Measurements
		// Add to HashSet
		startTime = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			hashSet.add(random.nextInt(1000000));
		}
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("HashSet add time(s): " + totalTime);		
		
		// Search in HashSet
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			hashSet.contains(random.nextInt(1000000));
		}
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("HashSet search time(s): " + totalTime);
		
		// Remove from HashSet
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			hashSet.remove(i);
		}
		endTime = System.nanoTime();
		totalTime = (endTime - startTime) / 1000000;
		System.out.println("HashSet remove time(s): " + totalTime);
	}

}
