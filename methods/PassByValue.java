package methods;
class Dog {
	int legs;
}
public class PassByValue {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=34,d=99;
		swap(c,d);
	System.out.println(c+" "+d);
		Dog e=new Dog();
		e.legs=4;
		Dog f=new Dog();
	
		f.legs=3;
		Dog(e,f);
		System.out.println(e.legs+" "+f.legs);
	Dog h=new Dog();
		h.legs=4;
		changeDog(h);
		System.out.println(h);
	}
	static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	static void Dog(Dog a,Dog b) {
		Dog temp=a;
		a=b;
		b=temp;
	}

	static void changeDog(Dog dog) {
		dog.legs=6;
	}
	

}

