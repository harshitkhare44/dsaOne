package codechef;

import java.util.*;

import java.lang.*;
import java.io.*;


public class competetiveCoding {
	
	public static void main(String[] args) {
		 int arr[] = { 1,2,3,2,4,1,7 };
		    int n = arr.length;
		 
		    System.out.println(MinGCD(arr, n));
	}
	static int gcd(int a, int b)
	{
	    if(b == 0)
	        return a;
	    else
	        return gcd(b, a % b);
	}
	static int MinGCD(int arr[], int n)
	{
	    int k = 0;
	 
	 
	    for(int i = 0; i < n; i++)
	    {
	       k =gcd(k, arr[i]);
	    }
	     
	    return k;
	}
	
}

