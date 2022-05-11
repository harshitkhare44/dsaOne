package dsaOne.queue;

import java.util.Stack;

import dsaOne.queue.ImplementingQueueUsingTwoStack.MyQueue;

public class ImplementingQueueUsingTwoStack {
public static void main(String[] args) {
	MyQueue q=new MyQueue();
	q.push(4);
	q.push(3);
	q.push(2);
	System.out.println(q);
	System.out.println(q.pop());
	System.out.println(q.pop());
	System.out.println(q.peek());
	
}

}
class MyQueue{
	Stack<Integer>s1=new Stack<>();
	Stack<Integer>s2=new Stack<>();
	void push(int data) {
		
	s1.push(data);
	}
	int pop() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int ans=s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}
	int peek() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int ans=s2.peek();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}
	
	
}
