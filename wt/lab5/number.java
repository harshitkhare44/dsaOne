package wt.lab5;

import java.util.Scanner;

public class number {
	int n;
	public static void main(String[] args) {
		number a=new number();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n: ");
		a.n=sc.nextInt();
		int arr[]=new int[a.n];
		System.out.println("Enter n integers");
		for(int i=0;i<a.n;i++) {
			arr[i]=read();
		}
		int s=0;
		int l=0;
		int li=0;
		int si=0;
		for(int i=0;i<a.n;i++) {
			if(arr[i]>=l) {
				l=arr[i];
				li=i;
			}
			if(arr[i]<=s) {
				s=arr[i];
				si=i;
			}
		}
		swap(arr,li,si);
		System.out.println("After swapping values are: ");
		display(arr);
	}
	private static void display(int[] arr) {
		// TODO Auto-generated method stub
		for(int i:arr) {
			
			System.out.println(i+" ");
		}
		
	}
	private static void swap(int[] arr,int a,int b) {
		// TODO Auto-generated method stub
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	
		
	}
	private static int read() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		return a;
	}
}
