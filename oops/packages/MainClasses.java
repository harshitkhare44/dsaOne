package oops.packages;

import java.util.Scanner;

//import oops.packages.models.Student;
//import oops.packages.models.Teacher;
import oops.packages.models.*;

public class MainClasses {
	public static void main (String[]args) {
		Student obj=new Student("Tom");
		obj.name="Jerry";
		obj.getPassword();
		Teacher teacher=new Teacher();
		Scanner sc=new Scanner(System.in);
	}

}
