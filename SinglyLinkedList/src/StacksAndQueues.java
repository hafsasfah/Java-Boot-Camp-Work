import java.util.Random;
import java.util.*;
public class StacksAndQueues {
	public StacksAndQueues() {}
	public static void main(String[] args) {
		int random = Random(101);
		
		 
		class StackDemo { 
		void showpush(Stack st, int random) { 
		st.push(new Integer(random)); 
		System.out.println("push(" + random + ")"); 
		System.out.println("stack: " + st); 
		} 
		void showpop(Stack st) 
		{ 
				
				System.out.print("pop -> "); 
				Integer a = (Integer) st.pop(); 
				System.out.println(a); 
				System.out.println("stack: " + st); 
		} 
		{ 
		
			Stack st = new Stack(); 
		System.out.println("stack: " + st); 
		showpush(st, (random )); 
		showpush(st, random); 
		showpush(st, random); 
		showpop(st); 
		showpop(st); 
		showpop(st); 
		try { 
		showpop(st); 
		} catch (EmptyStackException e) { 
		System.out.println("empty stack"); 
		} 
		} 
		}

	}
	private static int Random(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
