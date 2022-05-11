package dsaOne.binarySearch;

import java.util.Scanner;

public class ElementInInfinteSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		int ans = binarySearch(a, key);
		System.out.println(ans+1);
		


	}

	private static int binarySearch(int[] a, int key) {
		// TODO Auto-generated method stub
		int low=0;
		int high=1;
		while(a[high]<key) {
			low=high;
			high*=2;
			
		}
		return binarySearch(a,key,low,high);
	}

private static int binarySearch(int[] a, int key,int low,int high) {
	// TODO Auto-generated method stub
	if(low>high) return -1;
	int mid=(low+high)/2;
	if(a[mid]==key)
		return mid;
	if (key >a[mid]) return binarySearch(a,key,mid+1,high);
	if (key <a[mid]) return binarySearch(a,key,low,mid-1);
	
	return 0;
}

}
