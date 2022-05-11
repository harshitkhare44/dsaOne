package wt.lab7;

public class second {
	public static void main(String[] args) {
		
	
	plate obj=new plate(31.5,24.2);
    box obj1=new box(26.1);
    wood_box obj2=new wood_box(41.5);
    wood_box.display();
	}
}
class plate 
{
	static double l,b;
	plate(double x,double y)
	{
		l=x;b=y;
        System.out.println("plate class is called");
	}
	
}
class box extends plate
{
	static double h;
    box(double z)
	{
        super(l,b);
        h=z;
        System.out.println("box class is called");
	}
}
class wood_box extends box
{
	static double t;
    wood_box(double w)
	{
        super(h);
        t=w; 
        System.out.println("wood_box class is called");
	}
    public static void display()
	{
		System.out.println("Length is :- "+l);
        System.out.println("Width is :- "+b);
        System.out.println("Height is :- "+h);
        System.out.println("Thickness is :- "+t);
	}
}
