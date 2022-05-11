package wt.lab6.third;

import java.util.*;
public class ThreeD extends TwoD
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