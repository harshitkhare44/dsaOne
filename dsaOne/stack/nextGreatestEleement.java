package dsaOne.stack;

import java.util.Scanner;
import java.util.Stack;

public class nextGreatestEleement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		nextGreatestElement(a);
	}

	private static void nextGreatestElement(int[] a) {
		// TODO Auto-generated method stub
		Stack<Integer >s=new Stack<>();
		int ans[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
			while(!s.isEmpty() && s.peek()<a[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				ans[i]=-1;
			}
			else {
				ans[i]=s.peek();
			}
			s.push(a[i]);
			
		}
		for(int i:ans) {
			System.out.print(i+" ");
		}
	
	}
}
