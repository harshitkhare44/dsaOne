package conditionalStatement;
import java.util.Scanner;

public class IfElseIfcClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		if (number<=10)
		{ System.out.println("no is less than 10");
		} else if (number>10 && number<20) {
			System.out.println("no. is grater than 10 but less then 20");
		}else {
			System.out.println("no. is grater than 20 but less than 30");
		}

	}

}
