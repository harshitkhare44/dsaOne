package wt.LabExam;
import java.util.*;
public class set4 {
	  static boolean isPrime(int n){
	        if (n <= 1)
	            return false;
	        if (n <= 3)
	            return true;
	        if (n % 2 == 0 || n % 3 == 0)
	            return false;
	        for (int i = 5; i * i <= n; i = i + 6) {
	            if (n % i == 0 || n % (i + 2) == 0)
	                return false;
	        }
	        return true;
	    }
	    static void segregatePrimeNonPrime(int arr[], int N){
	        int left = 0, right = N - 1;
	        while (left < right) {
	            while (isPrime(arr[left]))
	                left++;
	            while (!isPrime(arr[right]))
	                right--;
	            if (left < right) {
	                int temp = arr[right];
	                arr[right] = arr[left];
	                arr[left] = temp;
	                left++;
	                right--;
	            }
	            for(int i = 0; i < arr.length; i++)
	            {
	                System.out.println(arr[i]+" ");
	            }
	        }
	    }
	    public static void main(String[] args) 
	    {
	        int n,lb,ub;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the value of n");
	        n = sc.nextInt();
	        System.out.println("Enter the value of lb");
	        lb = sc.nextInt();
	        System.out.println("Enter the value of ub");
	        ub = sc.nextInt();
	        int arr[] = new int[n];
	        for (int i = 0; i < n; i++){
	            arr[i] = (int)(Math.random() * (ub - lb + 1)) + lb;
	        }
	        System.out.println("The array generated is :- ");
	            for(int i = 0; i < arr.length; i++){
	                System.out.println(arr[i]+" ");
	            }
	            System.out.println("The SEGREGATED array is :- "); 
	            int K =arr.length;
	            segregatePrimeNonPrime(arr, K);

	        
	    }
}
