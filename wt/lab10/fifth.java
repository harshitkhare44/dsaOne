package wt.lab10;

import java.io.BufferedWriter;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
import java.util.Scanner;

public class fifth {
	public static void main(String[] args) throws IOException {
		 Scanner input = new Scanner(System.in);
		 String ln;
		 String s1 = "C:\\Users\\KIIT\\eclipse-workspace\\introduction\\src\\wt\\lab10\\s1.txt.txt";
		 FileReader s = new FileReader(s1);
		 BufferedReader in = new BufferedReader(s);
		 ln = in.readLine();
		 char[] charArray = ln.toCharArray();
		 boolean foundSpace = true;
		 for(int i = 0; i < ln.length(); i++) {
		 if(Character.isLetter(charArray[i])) {
		 if(foundSpace) {
		 charArray[i] = Character.toUpperCase(charArray[i]);
		 foundSpace = false;
		 }
		 }
		 else {
		 foundSpace = true;
		 }
		 }
		 BufferedWriter s3 = new BufferedWriter(new FileWriter("C:\\Users\\KIIT\\eclipse-workspace\\introduction\\src\\wt\\lab10\\s2.txt.txt"));
		 s3.write(charArray);
		 s3.close();
		 }
}
