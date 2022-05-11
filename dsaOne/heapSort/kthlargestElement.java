package dsaOne.heapSort;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kthlargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		kthlargestElement(a,n,k);
		
			
	}

	private static void kthlargestElement(int[] a, int n,int k) {
		// TODO Auto-generated method stub
		 PriorityQueue<Integer> pq=new PriorityQueue<>();
		 for(int i=0;i<k;i++) {
			 pq.add(a[i]);
		 }
		 for(int i=k;i<n;i++) {
			 if(pq.peek()<a[i]) {
				 pq.poll();
				 pq.add(a[i]);
			 }
		 }
		System.out.println(pq.peek());
		 
	}

}
