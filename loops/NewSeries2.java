package loops;
import java.util.Scanner;

public class NewSeries2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float result =0;
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(float i=1;i<=n;i++)
		{
		if(i%2==0) 
			{result-=1/i;}
		else 
			{result+=1/i;}
		}System.out.println("result "+result);
		
		
			

	}

}
