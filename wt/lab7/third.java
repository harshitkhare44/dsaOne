package wt.lab7;
 class Shape {
	  double dim1;
	  double dim2;

	  Shape(double a, double b) {
	    dim1 = a;
	    dim2 = b;
	  }

	  double area() {
	    System.out.println("Area for Shape is undefined.");
	    return 0;
	  }
	}

	class Rectangle extends Shape {
	  Rectangle(double a, double b) {
	    super(a, b);
	  }

	  double area() {
	    System.out.println("Inside Area for Rectangle.");
	    return dim1 * dim2;
	  }
	}

	class Triangle extends Shape {
	  Triangle(double a, double b) {
	    super(a, b);
	  }

	  double area() {
	    System.out.println("Inside Area for Triangle.");
	    return dim1 * dim2 / 2;
	  }
	}
	
	public class third {
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

