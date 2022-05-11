package oops;
class Veichle{
	int wheels;
	Veichle(){
		wheels=4;
		
	}
}
class Veichles{
	int tyres;
	Veichles (int noOfTyres)
	{
		tyres=noOfTyres;
	}
}
class Alto{
	int whel;
	int headlight;
	String color;
	Alto (int whel){
	this.whel=whel;
	headlight=2;}
	Alto (int whel,String color)
	{
		this.whel=whel;
		headlight=2;
		this.color=color;
	}
}

public class MyConstructor {
	MyConstructor() {
		System.out.println("Object is created");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConstructor obj=new MyConstructor();
		Veichle car=new Veichle();
	
	System.out.println(car.wheels);
		Veichles scooty=new Veichles(2);
		System.out.println(scooty.tyres);
		Alto VX=new Alto(4);
		Alto VXI=new Alto(4,"pink");
		System.out.println(VX.whel+""+VX.headlight);
				System.out.println(VXI.whel+" wheels and color "+VXI.color);

	}

}
