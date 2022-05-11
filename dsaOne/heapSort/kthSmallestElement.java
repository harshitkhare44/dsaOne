package dsaOne.heapSort;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		kthSmallestElement(a,n,k);
	}

	private static void kthSmallestElement(int[] a, int n, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		 for(int i=0;i<k;i++) {
			 pq.add(a[i]);
		 }
		 for(int i=k;i<n;i++) {
			 if(pq.peek()>a[i]) {
				 pq.poll();
				 pq.add(a[i]);
			 }
		 }
		System.out.println(pq.peek());
	}

}
