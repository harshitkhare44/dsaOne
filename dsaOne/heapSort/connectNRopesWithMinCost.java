package dsaOne.heapSort;

import java.util.PriorityQueue;
import java.util.Scanner;

public class connectNRopesWithMinCost {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int ans=MinCost(a,n);
	System.out.println(ans);
	
}

private static int MinCost(int[] a, int n) {
	// TODO Auto-generated method stub
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	for(int i=0;i<n;i++) {
		pq.add(a[i]);
	}
	int ans=0;
	while(pq.size()>1) {
		int first=pq.poll();
		int second=pq.poll();
		int sum=first+second;
		ans+=sum;
		pq.add(sum);
	}
	
	return ans;
}
}
