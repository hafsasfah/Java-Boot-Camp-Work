import java.util.Iterator;

public class SinglyLinkedList<E>
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
	
<<<<<<< Updated upstream
	public E get( int index )
	{
		if ( index < 0 || index > size() - 1 )
=======
	public E get(int index)
	{
		if (index <0 || index> size() -1)
>>>>>>> Stashed changes
		{
			throw new IndexOutOfBoundsException();
		}
		
<<<<<<< Updated upstream
		int count = 0;
		E elementToReturn = null;
		for (Entry<E> current = head; current != null; current = current.next)
		{
			if ( count == index )
			{
				elementToReturn = current.element;
			}
			count ++;
=======
		int count =0;
		E elementToReturn = null;
		
		for (Entry<E> current = head; current !=null
		{
			count++;
>>>>>>> Stashed changes
		}
		return elementToReturn;
	}
	
<<<<<<< Updated upstream
	public Iterator<E> iterator()
	{
		return new SinglyLinkedListIterator();
	} 

=======
	
	public Iterator<E> iterator()
	{
		return new SinglyLinkedListIterator();
	}
	
	
>>>>>>> Stashed changes
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
}
