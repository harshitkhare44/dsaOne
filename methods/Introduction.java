package methods;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber=7;
		int secondNumber=21;
		int c=5;
		int result=maxOf(firstNumber,secondNumber);
		System.out.println(result);
		sayHi();
		maxOf(c);
	} 
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good morning");
	}
	static float maxOf(float a) {
		return a;
}
}