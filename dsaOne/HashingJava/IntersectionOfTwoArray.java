package dsaOne.HashingJava;
import java.util.*;
public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[k];
		for(int i=0;i<k;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println(intersection(a,b));

	}

	private static int intersection(int[] a, int[] b) {
		// TODO Auto-generated method stub
		Set <Integer> set=new HashSet<>();
		int count=0;
		for(int i:a) {
			set.add(i);
		}
		for(int i:b) {
			if(set.contains(i)) {
			count++;
			set.remove(i);
			}
		}
		
	return count;
	}

}
