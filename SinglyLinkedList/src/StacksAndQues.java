import java.util.*;
public class StacksAndQues extends LinkedList {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Random random = new Random();
		int num = 100;
		for(int i =0;i<num;i++){
			
				int newNum= random.nextInt(100);
				while(!stack.isEmpty()&&newNum <=stack.peek()){
					System.out.println("popping "+ stack.pop());
				}
				stack.push(newNum);
				
		}
		
		System.out.println("\n\n--Final state of stack--");
		while(!stack.isEmpty()){
			
			System.out.println(stack.pop());
		}
		
		

	}
	
	

}
