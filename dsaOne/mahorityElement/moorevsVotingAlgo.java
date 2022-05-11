package dsaOne.mahorityElement;

public class moorevsVotingAlgo {

class MajorityElement {
	 void printMajority(int a[], int size)
	    {
	        /* Find the candidate for Majority*/
	        int cand = findCandidate(a, size);
	 
	        /* Print the candidate if it is Majority*/
	        if (isMajority(a, size, cand))
	            System.out.println(" " + cand + " ");
	        else
	            System.out.println("No Majority Element");
	    }
	 
	    /* Function to find the candidate for Majority */
	    int findCandidate(int a[], int size)
	    {
	        int maj_index = 0, count = 1;
	        int i;
	        for (i = 1; i < size; i++) {
	            if (a[maj_index] == a[i])
	                count++;
	            else
	                count--;
	            if (count == 0) {
	                maj_index = i;
	                count = 1;
	            }
	        }
	        return a[maj_index];
	    }
	 
	    /* Function to check if the candidate occurs more
	       than n/2 times */
	  boolean isMajority(int a[], int size, int cand)
	    {
	        int i, count = 0;
	        for (i = 0; i < size; i++) {
	            if (a[i] == cand)
	                count++;
	        }
	        if (count > size / 2)
	            return true;
	        else
	            return false;
	    }
	 
	    /* Driver code */
	  public  void main (String[] args)
	    {
	        MajorityElement majorelement = new MajorityElement();
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt()
	        int a[] = new int[n] ;
	        for(int i=0;i<n;i++) {
	        	a[i]=sc.nextInt();
	        }
	       
	        // Function call
	        int size = a.length;
	        majorelement.printMajority(a, size);
	    }
}
}
