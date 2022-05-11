package vectorsAndStacks;

import linkedLists.MyLinkedListGeneric;

public class MyStack <E>{

	private MyLinkedListGeneric<E> ll=new MyLinkedListGeneric<E>() ;
	void push(E e) {
		ll.add(e);
	}
	E pop() throws Exception {
		if(ll.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		
		}
		return ll.removeLast();
	}
	E peek() throws Exception{
		if(ll.isEmpty()) {
			throw new Exception("Peeking from empty is not allowed");
			
		}
		return ll.getLast();
	}

}
