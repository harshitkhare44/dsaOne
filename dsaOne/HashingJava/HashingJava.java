package dsaOne.HashingJava;
import java.util.*;
public class HashingJava {
public static void main(String[] args) {
	HashSet<Integer>s=new HashSet<>();
	s.add(5);
	s.add(15);
	s.add(3);
	s.add(2);
	s.add(44);
	s.add(1);
	s.add(9);
	System.out.print(s+" \n");
	if(s.contains(10)) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}
	s.remove(15);
	System.out.print(s);
	System.out.println(s.isEmpty());
	System.out.println(s.size());
	
		s.clear();
		System.out.println(s);
		
}
}
