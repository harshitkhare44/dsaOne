package wtTheory.practice;

import java.util.Scanner;

public class ww {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	int t=1;
	int add=0;
	int sub;
	int mult;
	while(t!=2) {

		System.out.println("Enter 2 nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add=a+b;
		sub=b-a;
		mult=a*b;
		System.out.println("Addition of 2 nos:"+add);
		System.out.println("Subtration of 2 nos:"+sub);
		System.out.println("Multiplication  of 2 nos:"+mult);
		System.out.println("If u want to continue press 1 otherwise 0");
		int n=sc.nextInt();
		t=n;
	}
		
		
	
	}

}
