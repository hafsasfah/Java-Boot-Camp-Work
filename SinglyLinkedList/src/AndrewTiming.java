import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;


public class AndrewTiming implements List<Integer>
{

	static int highestRandom = 1000;
	
	public static void main(String[]args)
	{
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		
		
		addRandomNumbersToList( "arrayList", arrayList, 1000 );
		CheckRandomNumbers("arrayList", arrayList, 100 );
		
		//-------------------------------------------------------------------
		
		addRandomNumbersToList( "linkedList", linkedList, 1000 );
		CheckRandomNumbers("linkedList", linkedList, 100);
		
		//-------------------------------------------------------------------
		
		addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 1000 );
		CheckRandomNumbers("singlyLinkedList", singlyLinkedList, 100);
		
		//-------------------------------------------------------------------
		
		addRandomNumbersToList( "arrayList", arrayList, 1000000000 );
		CheckRandomNumbers("arrayList", arrayList, 100000 );
		
		//-------------------------------------------------------------------
		
		addRandomNumbersToList( "linkedList", linkedList, 1000000000 );
		CheckRandomNumbers("linkedList", linkedList, 100000 );
		
		//-------------------------------------------------------------------
		
		addRandomNumbersToList( "singlyLinkedList", singlyLinkedList, 1000000000 );
		CheckRandomNumbers("singlyLinkedList", singlyLinkedList, 100000);
		
		
	}//end of main
	
	
	
	public static void addRandomNumbersToList(String name, List<Integer> list, int numbersToAdd)
	{
		
		Random random = new Random(5);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		
		for ( int count = 0; count < numbersToAdd; count++ )
		{
			list.add( random.nextInt(highestRandom) );
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Adding %d to %s took %f millseconds\n\n", numbersToAdd, name, elapsedTime / 1000000.0 );
		
	}//end of addRandomNumbersToList
	
	
	
	public static void CheckRandomNumbers(String name, List<Integer> list, int checkNumbers)
	{
		
		Random random = new Random(10);
		long startTime, finishTime, elapsedTime;
		startTime = System.nanoTime();
		int matches = 0;
		for ( int count = 0; count < checkNumbers; count++ )
		{
			if ( list.contains( random.nextInt(highestRandom) ) )
			{
				matches++;
			}
		}
		
		finishTime = System.nanoTime();
		elapsedTime = finishTime - startTime;
		
		System.out.printf( "Checking %d to %s took %f millseconds and found %d matches\n\n", 
				checkNumbers, name, elapsedTime / 1000000.0, matches );
		
	}//end of CheckRandomNumbers



	@Override
	public boolean add(Integer e) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void add(int index, Integer element) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public ListIterator<Integer> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ListIterator<Integer> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Integer remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Integer set(int index, Integer element) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 

	
	
	
	
	
}
	
 
