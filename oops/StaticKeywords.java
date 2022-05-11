package oops;

import opps.A.B;
import oops.A.C;

public class StaticKeywords {
	static {
		System.out.println("in block 1");
	}
	static {
		System.out.println("in block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Math.PI);
System.out.println(Math.max(23,12));
A objA=new A();
B objB=objA.new B();
C objC =new C();


	}
	static{
		System.out.println("inside main ");
	}
	

}
