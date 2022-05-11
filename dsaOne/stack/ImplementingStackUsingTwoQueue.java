package dsaOne.stack;

import java.util.Queue;

import dsaOne.queue.QueueUsingArray;

public class ImplementingStackUsingTwoQueue {
public static void main(String[] args) {
	MyStacks s=new MyStacks();
	s.push(3);
	s.push(2);
	s.push(1);
	System.out.println(s);
	System.out.println(s.pop());
	System.out.println(s.pop());
}
}
 class MyStacks{
	Queue q1;
	Queue q2;
	void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		
	}
	int pop(){
		return (int)q1.poll();
	}
	 int peek(){
		return (int)q1.peek();
	}
	
}
