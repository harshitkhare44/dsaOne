package strings;

public class StringIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Harshit";
		String anotherName=new String("    Harshit");
		String cars="Hyundai,Maruti,Wagonr,Alto,Ferrari,Swift,Lamborhgini";
		String allCars[]=cars.split(" ,");
		System.out.println(name);
		System.out.println(anotherName);
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		System.out.println(name.substring(5));
		System.out.println(name.substring(2,5));
		System.out.println(name.contains("Harshit"));
		System.out.println(name.equals(anotherName));
		System.out.println(name.isEmpty());
		System.out.println(name.concat("Khare"));
		System.out.println(name.replace('a','r'));
//	For (String cars:allCars){
//		System.out.println(cars);}
		System.out.println(name.indexOf('r'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(anotherName.trim());
		

	}

}
