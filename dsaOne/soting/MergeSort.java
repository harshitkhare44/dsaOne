package dsaOne.soting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
		a[i]	=sc.nextInt();
		}
		int l=0;
		int r=n-1;
		mergeSort(a,l,r);
		for(int o:a) {
			System.out.print(o+" ");
		}
	
	}

	private static void mergeSort(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r) {
			int mid=(l+r)/2;
			mergeSort(a,l,mid);
			mergeSort(a, mid+1, r);
			merge(a,mid,l,r);
		}
	}

	private static void merge(int[] a, int mid, int l, int r) {
		// TODO Auto-generated method stub
		int b[]=new int[a.length];
		int i=l;
		int k=l;
		int j=mid+1;
		
		while(i<=mid && j<=r) {
			if(a[i]<a[j]) {
				b[k]=a[i];
				i++;
				
			}
			else {
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=r) {
				b[k]=a[j];
				k++;
				j++;
			}
		}
		else {
			while(i<=mid) {
				b[k]=a[i];
				k++;
				i++;
			}
		}
		for(k=l;k<=r;k++) {
			a[k]=b[k];
		}
	}


}
