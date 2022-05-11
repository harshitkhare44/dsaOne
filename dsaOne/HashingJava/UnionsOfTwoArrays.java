package dsaOne.HashingJava;

import java.util.*;

public class UnionsOfTwoArrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int a[]=new int [n]; 
	for(int i=0;i<n;i++) {
    a[i]=sc.nextInt();
	}
	int b[]=new int [k]; 
	for(int i=0;i<k;i++) {
		b[i]=sc.nextInt();
	}
	System.out.println(union(a,b));
}

private static int union(int[] a, int[] b) {
	// TODO Auto-generated method stub
	Set<Integer>set =new HashSet<>();
	for(int x:a) {
		set.add(x);
	}
	for(int x:b) {
		set.add(x);
	}
	return set.size();
}
}
