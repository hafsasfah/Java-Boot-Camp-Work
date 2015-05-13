import java.util.*;

public class SinglyLinkedList<E> implements List<E>
{
	protected Entry<E> head;
	
	public SinglyLinkedList()
	{
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	public boolean contains(Object obj) {
		if (obj == null) {
			for (Entry<E> current = head; current != null; current = current.next)
				if (obj == current.element)
					return true;
		} // if obj == null
		else
			for (Entry<E> current = head; current != null; current = current.next)
				if (obj.equals(current.element))
					return true;
		return false;
	}
	public boolean add(E element)
	{
		try{ Entry<E> newEntry = new Entry<E>();
		newEntry.element = element;
		newEntry.next = head;
		head = newEntry;
		return true;
		}
		catch(Exception e){
			return false;
		}
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
	public void add(int arg0, E arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends E> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
