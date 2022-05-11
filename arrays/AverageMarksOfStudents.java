package arrays;
import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of students");
		int n=sc.nextInt();
		int []marks=new int[n];
		System.out.println("enter the marks of students");
		for(int i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}int average=0;
		for(int i=0;i<n;i++)
		{average+=marks[i];}
		average/=n;
		System.out.println("the average marks of students= "+average);
		
		
		

	}

}
