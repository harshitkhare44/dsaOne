package whileLoop;
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0)
		{ int lastDigit=temp%10;
		temp/=10;
		sum+=lastDigit;
		System.out.println(temp+" "+lastDigit+" "+sum);
		}System.out.println("the sum of the digit " +n +" is  "+sum);

	}

}
