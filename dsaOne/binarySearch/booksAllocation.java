package dsaOne.binarySearch;

import java.util.*;

public class booksAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int ans=minPages(a,k);
		System.out.println(ans);

	}

	private static int minPages(int[] a, int k) {
		// TODO Auto-generated method stub
		int min=maxOf(a);
		int max=sumOf(a);
		int res=0;
		while(min<=max) {
			int mid=(min+max)/2;
			if(isFeasible(a,k,mid)) {
				res=mid;
				max=mid-1;
			}
			else {
				min=mid+1;
			}
		}
		return res;
	}

	private static boolean isFeasible(int[] a, int k, int res) {
		// TODO Auto-generated method stub
		int student=1,sum=0;
		for(int i=0;i<a.length;i++) {
			if(sum+a[i]>res) {
				student++;
				sum=a[i];
			}
			else {
				sum+=a[i];
			}
		}
		return student<=k;
	}

	private static int sumOf(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

	private static int maxOf(int[] a) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=temp) {
				temp=a[i];
			}
		}
		return temp;
	}

}
