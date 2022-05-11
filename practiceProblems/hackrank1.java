package practiceProblems;
import java.util.Scanner;

public class hackrank1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]= {4,5,6,7};
		int count=0;
	    int count2=0;
	    int add=0;
	        for(int i=0;i<n/2;i++)
	        { count+=a[i];}
	        
	        for(int i=n;i<n/2;i-- ){
	            count2+=a[i];
	        }
	        if(count>count2){
	            add=count-count2;
	        }else{
	             add=count2-count;
	        }
	        System.out.println(add); 
	    }


	}


