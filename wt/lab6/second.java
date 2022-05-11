package wt.lab6;

import java.util.Scanner;

public class second {
	private static void area(float x) {
		System.out.println("the area of the square is " + Math.pow(x, 2) + " sq units");
	}

	static void area(float x, float y) {
		System.out.println("the area of the rectangle is " + x * y + " sq units");
	}

	static void area(double x) {
		double z = 3.14 * x * x;
		System.out.println("the area of the circle is " + z + " sq units");
	}
	 public static void area(double side1, double side2, double side3) {
	        double area = 0;
	        double s = (side1 + side2 + side3)/2;
	        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
	        System.out.println("the area of the trianglee is " + area + " sq units");
	        
	    }

	static class here {
		public static void main(String args[]) {
			second ob = new second();
			Scanner sc = new Scanner(System.in);
			System.out.println("Press for square =1 " + "triangle=2 " + "circle=3");
			int choose;
			choose = sc.nextInt();
			if(choose==1) {
				
				System.out.println("Enter the side of square");
				int a=sc.nextInt();
				area(a);
			}
		
			else if(choose==2) {
				System.out.println("Enter the sides of triangle");
				area(10,15,20);
				
			}
			
			else if(choose==3) {
				area(2.5);
			}
			
		
			
		}

	}
}
