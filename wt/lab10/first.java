package wt.lab10;


import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		 String s = "";
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a String : ");
		 s = in.nextLine()ha;
		 MyString obj = new MyString();
		 obj.len(s);
		 obj.rev(s);
		 obj.case_change(s);
		 String s1 = "";
		 System.out.println("Enter another String for comparision : ");
		 s1 = in.nextLine();
		 obj.cmp(s, s1);
		 in.close();
		 }

}
class MyString {
	 public void len(String s) {
	 if (s.charAt(0) == '\0') {
	 System.out.println("Length = 0(No string entered)");
	 return;
	 }
	 int l = 0;
	 for (char ch : s.toCharArray())
	 l++;
	 System.out.println("Original String : " + s);
	 System.out.println("Length of String : " + l);
	 }
	 public void rev(String s) {
	 String r = "";
	 for (int i = 0; i < s.length(); i++)
	 r = s.charAt(i) + r;
	 System.out.println("Reversed String : " + r);
	 }
	 public void case_change(String s) {
	 String s1 = "";
	 for (int i = 0; i < s.length(); i++) {
	 if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
	 s1 = s1 + (char) (s.charAt(i) - 32);
	 else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
	 s1 = s1 + (char) (s.charAt(i) + 32);
	 else if (s.charAt(i) == ' ')
	 s1 = s1 + " ";
	 }
	 System.out.println("Case Changed String : " + s1);
	 }
	 public void cmp(String s, String s1) {
	 for (int i = 0; i < Math.min(s.length(), s1.length()); i++) {
	 if (s.charAt(i) == s1.charAt(i))
	 continue;
	 else {
	 System.out.println("Difference : " + (int) 
	(Math.abs(s.charAt(i) - s1.charAt(i))));
	 }
	 }
	
	 }
	}