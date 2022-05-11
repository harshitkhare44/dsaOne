package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		List <String> fruits=new LinkedList<>();
//		List <String> vegetables=new ArrayList<>();
	
		fruits.add("Apple");
//		fruits.add(23);
		fruits.add("Orange");
		fruits.add("Hi");
	
//		vegetables.add("potato");
//		vegetables.add("Tomato");
//		vegetables.add("Carrot");
//		fruits.addAll(vegetables);
//		fruits.set(1, "Banana");
//		fruits.remove(2);
//		fruits.clear();
//		List<String> toRemove=new ArrayList<>();
//		toRemove.add("apple");
//		toRemove.add("hi");
//		fruits.removeAll(toRemove);
//		System.out.println(fruits);
//		System.out.println(fruits.size());
//		System.out.println(fruits.contains("Guava"));
//		System.out.println(fruits.isEmpty());
//		System.out.println(fruits.get(1));
		
//	Object x[]=fruits.toArray();
		
		
		String temp[]=new String [fruits.size()];
		fruits.toArray(temp);
		for(String e:temp) {
			System.out.println(e);
		}
		
		
//		ArrayList<Integer>mark=new ArrayList();
//		Double x=45.0;
		
//		Pair <String,Integer> p1=new Pair("Harshit",457);
//		Pair<Boolean,String> p2=new Pair(true,"Hello");
//		p1.getDescription();
//		p2.getDescription();
		

	}

}
