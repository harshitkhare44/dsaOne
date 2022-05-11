package dsaOne.HashingJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class distinctElementInEveryWinfowOfSizeK {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		countDistinctElement(a,k);
	}

 static void countDistinctElement(int[] a, int k) {
		// TODO Auto-generated method stub\
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<k;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		System.out.println(map.size());
		for(int i=k;i<a.length;i++){
			if((map.get(a[i-k])==1) ) {
				map.remove(a[i-k]);
			}
			else {
				
				map.put(a[i-k], map.get(a[i-k]-1));
			}
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			System.out.println(map.size());
	}

}
}
