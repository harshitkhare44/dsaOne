package wt.lab6;
import java.util.*;

public class fifth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of cube");
        int side = sc.nextInt();
        Shape3D obj = new Shape3D(side);
    }
}

class Shape2D {
    int len, wid;

    Shape2D() {
        len = 0;
        wid = 0;
    }

    Shape2D(int l, int b) {
        len = l;
        wid = b;
        System.out.println("Area of rectangle = " + (l * b));
    }
}

class Shape3D extends Shape2D {
    int s;

    Shape3D() {
        s = 0;
    }

    Shape3D(int side) {
        super(4, 2);
        s = side;
        System.out.println("volume of cube = " + (side * side * side));

    }
}