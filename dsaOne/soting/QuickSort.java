package dsaOne.soting;

import java.util.Scanner;


public class QuickSort {

	static void quickSort(int a[], int l,int h) {
		if(l<h) {
			int pivot=partition(a,l,h);
			quickSort(a,l,pivot-1);
			quickSort(a,pivot +1,h);
		}
	}

 static int partition(int a[],int l, int h) {
		// TODO Auto-generated method stub
		int pivot=a[l];
		int i=l;
		int j=h;
		while(i<j) {
			while(a[i]<=pivot)i++;
			while(a[i]>=pivot)j--;
			if(i<j) {
				int temp=j;
				j=i;
				i=temp;
				
			}
		}
		int temp=j;
		j=i;
		i=temp;
		
		
		
		return j;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
	
		int l=0;
		int h=n-1;
		quickSort(a,l,h);
		printArray(a);
		
		

	}

	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}

}
