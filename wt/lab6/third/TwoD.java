package wt.lab6.third;
import java.util.*;
public class TwoD 
{
	static double l,b;
	TwoD()
	{
		l=0;b=0;
	}
	public static double price()
	{
		return l*b*40;
	}
	public static class ThreeD extends TwoD
	{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			double h;
			System.out.println("Enter Length Bredth and Height:-");
			l=sc.nextDouble();
			b=sc.nextDouble();
			h=sc.nextDouble();
			
			System.out.println("Cost of sheet:-"+price());
			System.out.println("Cost of Box:-"+(l*b*h*60));
		}
	}
}