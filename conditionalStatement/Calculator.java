package conditionalStatement;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		int a=sc.nextInt();
		System.out.println("enter the second digit");
		int b=sc.nextInt();
		System.out.println("enter the operation");
		sc.nextLine();
		char operation=sc.nextLine ().charAt(0);
		int result=0;
		switch(operation) 
		{
		
		case '+':
			result=a+b;
			break;
		case '-':
		result =a-b;
		break;
		case '*':
			result=a*b;
			break;
		case '/':
		result=(a/b);
		break;
		default :
			System.out.println("wrong operation");
		}
			
		System.out.println("the result is "+result);
		}
		

	}


