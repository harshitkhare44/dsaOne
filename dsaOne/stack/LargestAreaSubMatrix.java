package dsaOne.stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaSubMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int a[][]=new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println(largestArea(a));
}

private static int largestArea(int[][] a) {
	// TODO Auto-generated method stub
	int[] curRow=a[0];
	int maxAns=maxHistogram(curRow);
	for(int i=1;i<a.length;i++) {
		for(int j=0;j<a[0].length;j++) {
			if(a[i][j]==1) {
				curRow[j]+=1;
			}
			else {
				curRow[j]=0;
			}
		}
		int curAns=maxHistogram(curRow);
		maxAns=Math.max(maxAns, curAns);
	}
	return maxAns;
}

private static int maxHistogram(int[] arr) {
	// TODO Auto-generated method stub
	int maxArea=0;
	int ps[]=prevSmaller(arr);
	int ns[]=nextSmaller(arr);

	for (int i = 0; i < arr.length; i++) {
		int cur=(ns[i]-ps[i]-1)*arr[i];
		maxArea=Math.max(maxArea, cur);
	}
	return maxArea;
}

private static int[] nextSmaller(int[] arr) {
	// TODO Auto-generated method stub
	int ns[]=new int[arr.length];
	
	Stack <Integer>s=new Stack<>();
	for(int i=arr.length-1;i>=0;i--) {
		while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
			s.pop();
		}
		if(s.isEmpty()) {
			ns[i]=arr.length;
		}
		else {
			ns[i]=s.peek();
		}
		s.push(i);
	}
	return ns;
}

private static int[] prevSmaller(int[] arr) {
	// TODO Auto-generated method stub
	int ps[]=new int[arr.length];
	Stack<Integer>s=new Stack<>();
	for(int i=0;i<arr.length;i++) {
		while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
			s.pop();
		}
		if(s.isEmpty()) {
			ps[i]=-1;
		}
		else {
			ps[i]=s.peek();
		}
		s.push(i);
	}
	return ps;
}
}
