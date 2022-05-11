package dsaOne.HashingJava;

import java.util.*;

public class CountDistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(countDistincr(a));
	}

	private static int countDistincr(int[] a) {
		// TODO Auto-generated method stub
		Set <Integer>set =new HashSet<>();
		for(int i:a) {
			set.add(i);
		}
		return set.size();
	}

}
