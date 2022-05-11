package dsaOne.stack;

import java.util.Scanner;
import java.util.Stack;

public class previousGreatestElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	previousGreatestElement(a);
}

private static void previousGreatestElement(int[] a) {
	// TODO Auto-generated method stub
	Stack<Integer>s=new Stack<>();
	for(int i=0;i<a.length;i++) {
		while(!s.isEmpty() && s.peek()<a[i]) {
			s.pop();
		}
		if(s.isEmpty()) {
			System.out.print("-1 ");
		}
		else {
			System.out.print(s.peek()+" ");
		}
		s.push(a[i]);
	}
	
}
}
