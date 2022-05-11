package loop;
import java.util.Scanner;

public class Fibbonacii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the the no ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int i=1;i<=n-2;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			
		}
		

	}

}
