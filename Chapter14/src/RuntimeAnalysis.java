import java.util.*;

public class RuntimeAnalysis {
	
	static int highestRandomNumber = 1000000;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		TreeSet<Integer> treesetList = new TreeSet<Integer>();
		HashSet<Integer> hashsetList = new HashSet<Integer>();
		
		addNumbersToArrayList(arrayList, 100000);
		removeNumbersFromArrayList(arrayList, 10000);
		matchedArrayListNumbers(arrayList, 10000);
		
		addNumbersToTreeset(treesetList, 100000);
		removeNumbersFromTreeSet(treesetList, 10000);
		matchedTreeSetNumbers(treesetList, 10000);
		
		addNumbersToHashset(hashsetList, 100000);
		removeNumbersFromHashset(hashsetList, 10000);
		matchedHashsetNumbers(hashsetList, 10000);
			
	}

	public static void addNumbersToArrayList(ArrayList<Integer> list, int numbersToAdd) {
		
		Random random = new Random();
		long startTime, endTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ ) {
			list.add( random.nextInt(highestRandomNumber) );
			
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;		
		
		System.out.printf( "ArrayList \n\tAdding %,d random integers to ArrayList took %f millseconds\n", numbersToAdd, elapsedTime / 1000000.0 );
	}
	
	public static void addNumbersToTreeset(TreeSet<Integer> list, int numbersToAdd) {
		
		Random random = new Random();
		long startTime, endTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++) {
			list.add(random.nextInt(highestRandomNumber));
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		
		System.out.printf( "TreeSet\n\tAdding %,d numbers to TreeSet took %f millseconds\n", numbersToAdd, elapsedTime / 1000000.0 );
	}
	
	public static void addNumbersToHashset(HashSet<Integer> list, int numbersToAdd) {
		
		Random random = new Random();
		long startTime, endTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ ) {
			list.add( random.nextInt(highestRandomNumber) );
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		
		System.out.printf( "HashSet \n\tAdding %,d numbers took %f millseconds\n", numbersToAdd, elapsedTime / 1000000.0 );
	}
	
	public static void removeNumbersFromArrayList(ArrayList<Integer> list, int numbersToRemove) {
		
		Random random = new Random();
		long startTime, endTime, elapsedTime;
		int removeCount = 0;
		int removeNumber = 0;
		startTime = System.nanoTime();
		
		for(int i = 0; i < numbersToRemove; i++) {
			removeNumber = random.nextInt(10000);
			
			if(list.contains(removeNumber)) {
				list.remove(i);
				removeCount++;
			}
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		
		System.out.printf( "\tRemoving %,d random integers took %f millseconds\n", removeCount, elapsedTime / 1000000.0 );
	}
	
	public static void removeNumbersFromTreeSet(TreeSet<Integer> list, int numbersToRemove) {
		Random random = new Random();
		
		int removeNumber = 0;
		int removeCount = 0;
		long startTime, endTime, elapsedTime;
		
		startTime = System.nanoTime();
		
		for(int i = 0; i < numbersToRemove; i++) {
			removeNumber = random.nextInt(10000);
			
			if(list.contains(removeNumber)) {
				list.remove(i);
				removeCount++;
			}
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		
		System.out.printf( "\tRemoving %,d random integers took %f millseconds\n", removeCount, elapsedTime / 1000000.0 );
	}
	
	public static void removeNumbersFromHashset(HashSet<Integer> list, int numbersToRemove) {
		
		Random random = new Random();
		long startTime, endTime, elapsedTime;
		int removeCount = 0;
		int removeNumber = 0;
		startTime = System.nanoTime();
		
		for(int i = 0; i < numbersToRemove; i++) {
			
			removeNumber = random.nextInt(10000);
			
			if(list.contains(removeNumber)) {
				list.remove(i);
				removeCount++;
			}
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		
		System.out.printf( "\tRemoving %,d random integers took %f millseconds\n", removeCount, elapsedTime / 1000000.0 );
	}
	
	public static void matchedArrayListNumbers(ArrayList<Integer> list, int searchNumber) {
		
		Random random = new Random();
		int match = 0;
		int matchNumber = 0;
		long startTime, endTime, elapsedTime;
		startTime = System.nanoTime();
		
		for(int i = 0; i < searchNumber; i++) {
			matchNumber = random.nextInt(10000);
			
			if(list.contains(matchNumber)) {
				match++;
			}
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		
		System.out.printf("\tSearched 10,000 numbers %d were found in %f milliseconds\n\n", match, elapsedTime / 1000000.0 );
		
	}
	
	public static void matchedTreeSetNumbers(TreeSet<Integer> list, int searchNumber) {
		
		Random random = new Random();
		int match = 0;
		int matchNumber = 0;
		long startTime, endTime, elapsedTime;
		startTime = System.nanoTime();
		
		for(int i = 0; i < searchNumber; i++) {
			matchNumber = random.nextInt(10000);
			
			if(list.contains(matchNumber)) {
				match++;
			}
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		
		System.out.printf("\tSearched 10,000 numbers %d were found in %f milliseconds\n\n", match, elapsedTime / 1000000.0 );
	}
	
	public static void matchedHashsetNumbers(HashSet<Integer> list, int searchNumber) {
		
		Random random = new Random();
		int match = 0;
		int matchNumber = 0;
		long startTime, endTime, elapsedTime;
		startTime = System.nanoTime();
		
		for(int i = 0; i < searchNumber; i++) {
			matchNumber = random.nextInt(10000);
			
			if(list.contains(matchNumber)) {
				match++;
			}
		}
		
		endTime = System.nanoTime();
		elapsedTime = endTime - startTime;
		
		System.out.printf("\tSearched 10,000 numbers %d were found in %f milliseconds \n\n", match, elapsedTime / 1000000.0 );
		
	}
}
