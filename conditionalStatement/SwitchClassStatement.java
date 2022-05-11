 package conditionalStatement;
import java.util.Scanner;
public class SwitchClassStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int dayOfWeek=sc.nextInt();
//		switch(dayOfWeek)
//		{
//		case 1:
//			System.out.println("I am on leave");
//			break;
//		case 2:
//			System.out.println("I am in office");
//			break;
//		case 3:
//			System.out.println("I am plyaing football");
//			break;
//			default:
//				System.out.println("I dont know what day it is");
//		}
//			
		int rating=sc.nextInt();
		switch(rating) {
		case 1:
		case 2:
			System.out.println("Bad reviw");
			break;
		case 3:
			System.out.println("Average review");
			break;
		case 4:
		case 5:
			System.out.println("Good reviw");
			break;}
		
		}
		
		

	}


