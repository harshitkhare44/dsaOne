package conditionalStatement;
import java.util.Scanner;
public class NestedShorthand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int result =0;
		result=a>b?a>c?a:c:b>c?b:c;
		System.out.println("the largest of three no. is "+result);

	}

}
