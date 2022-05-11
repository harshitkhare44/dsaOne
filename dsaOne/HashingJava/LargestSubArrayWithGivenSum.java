package dsaOne.HashingJava;

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArrayWithGivenSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=sc.nextInt();
		subArray(a,sum);
		
	}

	private static void subArray(int[] a, int sum) {
		// TODO Auto-generated method stub
		int currentLength=0;
		int largestLength=0;
		int curSum=0;
		int start =0;
		int end=-1;
		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i=0;i<a.length;i++) {
			curSum+=a[i];
			if(curSum-sum==0) {
				start=0;
				end=i;
				break;
			}
			if(map.containsKey(curSum-sum)) {
				start=map.get(curSum-sum)+1;
				end=i;
				currentLength=end-start;
				if(currentLength>largestLength) {
					largestLength=currentLength;
//					continue;
				}
				else {
					break;
				}
				
			}
			map.put(curSum, i);
		}
		if(end==-1) {
			System.out.println("Not found");
		}
		else {
			
			System.out.println((start)+","+(end));
		}
		
	}

}
