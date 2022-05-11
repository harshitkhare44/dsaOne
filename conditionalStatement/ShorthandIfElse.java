package conditionalStatement;
import java.util.Scanner;

public class ShorthandIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		int maxOfBothNumbers=0;
		maxOfBothNumbers=a>b? a:b;
		System.out.println("max of both number is  "+maxOfBothNumbers);
		

	}

}
