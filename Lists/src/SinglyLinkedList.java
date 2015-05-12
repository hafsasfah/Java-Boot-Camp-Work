import java.util.Iterator;

public class SinglyLinkedList<E>
{
	protected Entry<E> head;
	protected int size;
	
	public SinglyLinkedList()
	{
		head = null;
		size = 0;
	}
	
	public boolean isEmtpy()
	{
		return head == null;
	}
	
	public void addToFront( E element )
	{
		Entry<E> newEntry = new Entry<E>();
		newEntry.element = element;
		newEntry.next = head;
		head = newEntry;
		size++;
	}
	
	public int size()
	{
		return size;
	}
	
	public void clear()
	{
		head = null;
		size = 0;
	}
	
	public Iterator<E> iterator()
	  {
	    return new SinglyLinkedListIterator();
	  } // method iterator

	
	 protected class SinglyLinkedListIterator implements Iterator<E> 
	  {
	    protected Entry<E> next;
	    
	    protected SinglyLinkedListIterator() 
	    {
	      next = head;
	    } 
	    
	    public boolean hasNext() 
	    {       
	      return next != null;
	    }
	                              
	    public E next() 
	    {
	      E theElement = next.element;
	      next = next.next;
	      return theElement;
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
