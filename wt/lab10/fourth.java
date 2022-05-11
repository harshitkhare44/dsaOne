package wt.lab10;
import java.io.*;
public class fourth {
	 public static void main(String[] args) throws IOException
	    {	
		 String ln;

		 String s ="C:\\Users\\KIIT\\eclipse-workspace\\introduction\\src\\wt\\lab10\\s1.txt.txt";
		 FileReader f = new FileReader(s);
		 BufferedReader s1 = new BufferedReader(f);
		 ln= s1.readLine();
		 System.out.println(ln);
		 BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\KIIT\\eclipse-workspace\\introduction\\src\\wt\\lab10\\s2.txt"));
		 bw.write(ln);
		 bw.close();
	    }
}
