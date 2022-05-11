package vectorsAndStacks;

import java.util.Stack;
import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyStack<Integer> stack=new MyStack();
		stack.push(12);
		stack.push(24);
		stack.push(36);
//		int popped=stack.pop();
		int popped=stack.pop();
		
		System.out.println(popped);
	
		 popped=stack.pop();
		 popped=stack.pop(); 
		 popped=stack.pop();
		
		
		int peeked=stack.peek();
		System.out.println(peeked);
		
		

	}

}
