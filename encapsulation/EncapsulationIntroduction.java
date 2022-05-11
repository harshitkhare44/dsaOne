package encapsulation;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
//		obj.name="tom";
//		obj.age=56;
		obj.setAge(25);
		System.out.println(obj.getAge());

	}

}
