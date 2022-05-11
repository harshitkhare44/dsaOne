package wt.lab9;

public class sixth {
	public static void main(String[] args) {
		 try{
		 int result = 5/0;
		 System.out.println("Result is: "+result);
		 }
		 catch(ArithmeticException e2){
		 System.out.println("Subclass ArithmeticException Occured");
		 }
		 catch(Exception e1){
		 System.out.println("Superclass Exception Occured");
		 }
		 }

}
