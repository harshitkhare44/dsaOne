package wt.lab8;
import java.util.*;
public class third {
public static void main(String[] args) {
Substaff obj = new Substaff();
obj.earnings();
obj.deductions();
obj.bonus();
}
}
class Substaff extends Manager {
public void bonus() {
float b;
b = 0.5f * basic;
System.out.println("Bonus = Rs. " + b);
}
}
interface salary {
void earnings();
void deductions();
void bonus();
}
abstract class Manager implements salary {
float basic;
public void earnings() {
Scanner in = new Scanner(System.in);
System.out.println("Enter the Basic Salary : ");
basic = in.nextFloat();
in.close();
float e;
e = basic + (0.8f * basic) + (0.15f * basic);
System.out.println("Basic = Rs. " + basic);
System.out.println("Earnings = Rs. " + e);
}
public void deductions() {
float d;
d = 0.12f * basic;
System.out.println("Deduction PF = Rs. " + d);
}
}