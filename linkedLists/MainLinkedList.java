package linkedLists;
import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll=new LinkedList<>();
		List<Integer> al=new ArrayList<>();
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);
//		ll.remove(1);
//				System.out.println(ll);
	
		getTimeDiff(al);
		getTimeDiff(ll);
		
		
	}
	static void getTimeDiff(List<Integer>list) {
		long start=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			list.add(i);
		}
		long end=System.currentTimeMillis();
		System.out.println(list.getClass().getName()+"-->"+(end-start));
		
	}
}
