package wtlabTest.test2;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class first {
	public static void main(String args[]) throws IOException  {
	String s = "", file = "";
	String[] s1 = new String[10000];
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the filename :");
	file = in.nextLine();
	BufferedReader is = null;
	PrintWriter pw = null;
	try {
	is = new BufferedReader(new FileReader(file));
	s = is.readLine();
	s1 = s.split(" ");
	String rev = "";
	for (int i = 0; i < s.length(); i++)
	rev = s.charAt(i) + rev;
	pw = new PrintWriter(new FileWriter(file, true));
	System.out.println("Original String = " + s);
	pw.println("\nOriginal String = " + s);
	System.out.println("Reversed String = " + rev);
	pw.append("\nReversed String = " + rev);
	StringBuffer sb = new StringBuffer();
	System.out.println("Reversed String word by word");
	pw.append("\nReversed String word by word\n");
	String rw = "";
	for (int i = 0; i < s1.length; i++) {
	sb = new StringBuffer(s1[i]);
	System.out.print(sb.reverse() + " ");
	StringBuffer temp = new StringBuffer(sb.reverse());
	rw = temp.reverse().append(" ") + rw;
	}
	pw.write(rw);
	String v = "";
	for (int i = 0; i < s.length(); i++) {

	if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
	s.charAt(i) == 'o'
	|| (s.charAt(i) == 'u') || s.charAt(i) == 'A' || s.charAt(i) ==
	'E' || s.charAt(i) == 'I'
	|| s.charAt(i) == 'O' || s.charAt(i) == 'U')
	v = v + "@";
	else
	v = v + s.charAt(i);
	}
	pw.write("\nVowels Replaced String : " + v);
	}
	finally {
	is.close();
	in.close();
	pw.close();
	}
	}
	
}
