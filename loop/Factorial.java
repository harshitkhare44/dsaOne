package loop;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("enter value whoose factorial to be found");
int n=sc.nextInt();
int i=1;
int x=1;
for( ;i<=n;i++) {
	x=x*i;}
	System.out.println(x);
	

	}

}
