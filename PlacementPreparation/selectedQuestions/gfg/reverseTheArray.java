package PlacementPreparation.selectedQuestions.gfg;

import java.util.Scanner;

public class reverseTheArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		reverseTheString(s);
	}

	private static void reverseTheString(String s) {
		// TODO Auto-generated method stub
		String words[]=s.split("\\s");
		String reverseString="";
		for(String w:words) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
//			reverseString+=sb.toString()+" ";
			reverseString+=sb+" ";
		
		}
		System.out.println(reverseString.trim());
		
		
	}
}
