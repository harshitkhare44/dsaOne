package loop;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for (int i=0;i<100;i=i+1) {
//	
//			System.out.println("Hellow world "+i);
//			}
//		for(int i=0;i<100;i=i+2) {
//			System.out.println(i);
//		}
		Scanner sc=new Scanner(System.in);
		int sum =0;
		System.out.println("enter value of n");
		int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		sum=sum+i;
		}
	
		System.out.println(sum);

	}

}
