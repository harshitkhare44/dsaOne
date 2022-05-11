package wt.lab7;

public class fouth {
	public static void main(String[] args) {
		 Shape f = new Shape(10, 10);

		    Rectangle r1 = new Rectangle(5, 10);
			Triangle t1 = new Triangle(5, 10);

		Shape r;

			r = r1;
			System.out.println("Area is " + r.area());

			r = t1;
			System.out.println("Area is " + r.area());
	}
}

