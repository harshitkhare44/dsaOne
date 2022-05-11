package dsaOne.stack;

import linkedLists.MyLinkedListGeneric.Node;

public class stackUsingLinkedList {
public static void main(String[] args) throws Exception {
	MyStackll stack=new MyStackll();
	stack.push(4);
	stack.push(5);
	stack.push(2);
	System.out.println(stack.pop());
	System.out.println(stack.peek());
}
}
 class MyStackll{
	Node head;
	int size;
	public MyStackll() {
		this.head=null;
		size=0;
	}
	void push(int data) {
		Node temp=new Node(data);
		temp=head.next;
		size++;
		head=temp;
		
	}
	int peek() throws Exception{
		if(head.data ==null) {
			throw new Exception("cant peek from empty stack");
			
		}
		return  (int) head.data;
	}
	int pop() throws Exception {
		if(head.data ==null) {
			throw new Exception("cant pop from empty stack");
			
		}
		int res=(int) head.data;
		head=head.next;
		size--;
		return res;
	}
	boolean isEmpty() {
		
			return head==null;
		
	}
	int size() {
		return size;
	}
}
