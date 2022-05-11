package wt.lab6;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		circle c = new circle();

		System.out.println("Enter radius of circle");
		c.radius = sc.nextInt();
		c.showArea(c.radius);

		rect d = new rect();
		System.out.println("Enter length and breadth of rectangle");
		d.l = sc.nextInt();
		d.b = sc.nextInt();
		d.showArea(d.l, d.b);

	}
}

class shape {
	double area = 0;

	void showArea(int r) {
		this.area = 3.14 * r * r;
		System.out.println("area of circle is :" + this.area);
	}

	void showArea(int l, int b) {
		this.area = l * b;
		System.out.println("area of rectangle is :" + this.area);
	}
}

class circle extends shape {
	int radius;
}

class rect extends shape {
	int l;
	int b;

}
