import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SinglyLinkedList<E> implements List<E>
{
	protected Entry<E> head;
	
	public SinglyLinkedList()
	{
		head = null;
	}
	
	@Override
	public boolean contains (Object obj) 
	  {
		Entry<E> head = null;
	    if (obj == null)
	    {
	      for (Entry<E> current = head; current != null; current = current.next)
	        if (obj == current.element)
	          return true;
	    } // if obj == null
	    else   
	      for (Entry<E> current = head; current != null; current = current.next)
	        if (obj.equals (current.element))
	          return true;
	    return false;
	  }
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addToFront(E element)
	{
		Entry<E> newEntry = new Entry<E>();
		newEntry.element = element;
		newEntry.next = head;
		head = newEntry;
	}
	
	public int size() 
	{
		int count = 0;
    
		for (Entry<E> current = head; current != null; current = current.next)
		{
			count++;
		}
		return count;
	}
	
	public E get( int index )
	{
		if ( index < 0 || index > size() - 1 )
		{
			throw new IndexOutOfBoundsException();
		}
		
		int count = 0;
		E elementToReturn = null;
		for (Entry<E> current = head; current != null; current = current.next)
		{
			if ( count == index )
			{
				elementToReturn = current.element;
			}
			count ++;
		}
		return elementToReturn;
	}
	
	public Iterator<E> iterator()
	{
		return new SinglyLinkedListIterator();
	} 

	protected class SinglyLinkedListIterator implements Iterator<E> 
	{
	    protected Entry<E> next;
	    
	    protected SinglyLinkedListIterator() 
	    {
	      next = head;
	    } 
	                             
	    public E next() 
	    {
	      E theElement = next.element;
	      next = next.next;
	      return theElement;
	    }
	    
	    public boolean hasNext() 
	    {       
	      return next != null;
	    } 
	    
	    public void remove() 
	    { 
	      throw new UnsupportedOperationException( ); 
	    }
	}
	
	protected class Entry<E>
	{
		protected E element;
		protected Entry<E> next;
	}
	
	@Override
	public void add(int index, E element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int indexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int lastIndexOf(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E remove(int index) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E set(int index, E element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object[] toArray() {
		throw new UnsupportedOperationException();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean add(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
