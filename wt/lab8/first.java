package wt.lab8;

import java.util.*;

public class first {
	public static void main(String[] args) {
		student obj = new kiitian();
		obj.course();
	}
	
}
abstract class student {
String rollno, regno;
abstract void course();
}
class kiitian extends student {
void course() {
Scanner in = new Scanner(System.in);
System.out.println("Enter Roll No. : ");
rollno = in.next();
System.out.println("Enter Reg. No. : ");
regno = in.next();
System.out.println("Course() executed successfully");
in.close();
}
}
