package dsaOne.binarySearch;

import java.util.Scanner;

public class SearchElementInSortedAndRottedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.println((bSearch(a, key)) + 1);
	}

	private static int bSearch(int[] a, int key) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid] == key) {
				return mid;
			}
			if (a[low] < a[mid]) {
				if (key >= a[low] && key < a[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (key > a[mid] && key <= a[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return -1;
	}

}
