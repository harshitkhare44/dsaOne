package nestedForLoop;
import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt()
;
		for(int j=1;j<=n;j++)
		{	int tableOf=j;
			for (int i=1;i<=10;i++)
			{System.out.print(tableOf*i+" ");}
		System.out.println();}

}
}