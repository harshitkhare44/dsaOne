package dsaOne.binarySearch;

import java.util.Scanner;

public class IterativeMethod {

	public static void main(String[] args) {
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
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key) {
				return mid;
			} else if (key > a[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return -1;

	}
}
