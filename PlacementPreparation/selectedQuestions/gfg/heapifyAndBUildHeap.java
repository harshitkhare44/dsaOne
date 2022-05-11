package PlacementPreparation.selectedQuestions.gfg;

import java.util.Scanner;

public class heapifyAndBUildHeap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		buildheap(a,n);
		for(int i:a) {
			System.out.println(i+" ");
		}
		
	}

	private static void buildheap(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i=n/2;i>0;i--) {
			heapify(a,n,i);
		}
	}

	private static void heapify(int[] a, int n, int i) {
		// TODO Auto-generated method stub
		int largest=i;
		int l=2*i;
		int r=2*i+1;
		if(l<=n && a[l]>a[largest]) {
			largest=l;
		}
		if(r<=n && a[r]>a[largest]) {
			largest=r;
		}
		if(largest!=i) {
			swap(a,i,largest);
			heapify(a,n,largest);
		}
	}

	private static void swap(int[] a, int i, int largest) {
		// TODO Auto-generated method stub
		int swap=a[i];
		a[i]=a[largest];
		a[largest]=swap;
	}

}
