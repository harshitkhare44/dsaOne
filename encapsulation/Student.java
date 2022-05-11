package encapsulation;

public class Student {
//	int age;
	private int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>20) {
			System.out.print("You are to old to be a student at our nusery school ");
		}
		else {
		this.age=age;
	}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
