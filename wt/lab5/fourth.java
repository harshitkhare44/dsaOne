package wt.lab5;

public class fourth
{
   private static void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    static void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    static void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
   static  class here
    {
         public static void main(String args[]) 
    	{
    	   fourth ob = new fourth();
    	   	area(5);
    	   	area(11,12);
    	   	area(2.5);
            }

    	
    }
}

