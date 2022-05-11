package oops;
class Cat { boolean hasFur;
			String color,bread;
			int legs,eyes;
			
public void walk() {
	System.out.println("Cat is walking");
}
public void eat() {
	System.out.println("Cat is eating");
}
public void description() {
	System.out.println("My  cat has "+legs+" legs & "+eyes+" eyes");
}
		}
class dog {
	String bread,name;
	public void jump() {
		System.out.println("my dog"+name+"jumped");
	}
	public void description() {
		System.out.println("my dog name is"+name+"and its bread is"+bread);
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1=new Cat();
		Cat cat2 =new Cat();
		cat1.legs=3;
		cat1.eyes=2;
		cat2.legs=4;
		cat2.eyes=1;
		cat1.walk();
		cat2.eat();
		cat1.description();
		cat2.description();
		dog husky =new dog();
		dog poodle=new dog();
		husky.bread="Husky";
		husky.name="chintu";
		poodle.bread="Poodle";
		poodle.name="hola";
		husky.jump();
		husky.description();
		poodle.jump();
		poodle.description();
		

	}

}
