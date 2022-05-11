package gfg;

import java.util.Scanner;

public class SelectedQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
				
			
	while(a[i]>0) {
		sum=sum+a[i]%10;
		a[i]=a[i]/10;
		
	}
		}
		for(int i=0;i<n;i++) {
			System.out.println(sum);
			
	
		}
		
		}
	
	}


