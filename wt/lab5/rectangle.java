package wt.lab5;

import java.util.*;

public class rectangle {
	int l;
	int b;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rectangle p = new rectangle();

		System.out.print("Enter lenght of rectangle: ");
		p.l = read();
		System.out.print("Enter breadth of rectangle: ");
		p.b = read();
		int area = calculatearea(p.l, p.b);
		int perimeter = calculateperimeter(p.l, p.b);
		display(area, perimeter);

	}

	private static int calculateperimeter(int l2, int b2) {
		// TODO Auto-generated method stub
		int perimeter = 2 * (l2 + b2);
		return perimeter;
	}

	private static int calculatearea(int l2, int b2) {
		// TODO Auto-generated method stub
		int area = l2 * b2;
		return area;
	}

	private static void display(int area, int perimeter) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is: " + area);
		System.out.println("Perimeter of the rectangle is:" + perimeter);

	}

	private static int read() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		return a;

	}
}
