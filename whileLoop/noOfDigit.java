package whileLoop;
import java.util.Scanner;

public class noOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int numberOfDigit=(int)Math.log10(n)+1;
		System.out.println(numberOfDigit);

	}

}
