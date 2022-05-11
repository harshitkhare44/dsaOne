 package arrays;

import java.util.Scanner;

public class MattrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dimensions");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int a[] []=new int[rows][cols];
		int b[] []=new int[rows][cols];
		System.out.println("enter matrix A");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
			}
		}System.out.println("Enter matrix B");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) {
				b[i][j]=sc.nextInt();
			}
		}System.out.println("the result matrix is");
		int c[] []=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}	for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++) {
				
			System.out.print(  c[i][j]+" ");
			
			}System.out.println();
		}

	}

}
