package deque;
import java.util.*;

import deque.MyDeque;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.addFirst(12);
		ad.addFirst(23);
		ad.addFirst(43);
		ad.addFirst(28);
	
		ad.pop();
		System.out.println(ad.peek());
		System.out.println(ad.removeFirst());
		System.out.println(ad.removeFirst());
		System.out.println(ad.peek());

	
//		
//		ad.push(23);
//		ad.push(34);
//		System.out.println(ad.pop());
//		System.out.println(ad.pop());
		
//	MyDeque<Integer> ad=new MyDeque<>();
//		ad.addToHead(3);
//		ad.addToHead(4);
//		ad.addToHead(5);
//		System.out.println(ad.removeLast());
//		System.out.println(ad.removeLast());
		
		
	}
	
	

}
