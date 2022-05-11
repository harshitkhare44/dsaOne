package wtTheory.practice;

public class first {
	public static void main(String[] args) {
		A a=new B();
		System.out.println(a.x);
		a.f1();
	}


}
 class A {
	int x = 10;

	void f1() {
		System.out.println("Hello");
	}
}
class B extends A{
	int x=20;
	void f1() {
		System.out.println("Bye");
	}
}