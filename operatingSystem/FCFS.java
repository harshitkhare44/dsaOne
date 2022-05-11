package operatingSystem;

import java.util.Scanner;

public class FCFS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Total no of process:");
		int n=sc.nextInt();
		int at[]=new int[n];
		int bt[]=new int[n];
	     for(int i=0;i<n;i++) {
	    
	    	System.out.print("Enter AT AND BT for P"+(i)+": ");
	   	   at[i]=sc.nextInt();
	    	bt[i]=sc.nextInt();
	     }
	    int ct[]=new int[n];
	    int tt[]=new int[n];
	    int wt[]=new int[n];
	   find(at,bt,ct,tt,wt);
	}

	private static void find(int[] at, int[] bt, int[] ct, int[] tt, int[] wt) {
		// TODO Auto-generated method stub
		findct(at,bt,ct);
		
//	for(int i:ct) {
//		System.out.print(i+" ");
//	}
		ganttChart(at,bt,ct);
		findtt(at,ct,tt);
		findwt(bt,tt,wt);
		System.out.println();
		System.out.println("Chart "+"\n");
		finalChart(at,bt,ct,tt,wt);
	}

	private static void finalChart(int[] at, int[] bt, int[] ct,int []tt, int[] wt) {
		// TODO Auto-generated method stub
		int n=at.length;
		System.out.println("Process\t"+"AT\t"+"BT\t" +"CT\t" +"TAT\t"+"WT\t");
		for(int i=0; i<n;i++) {
			System.out.println("P"+i+"\t"+at[i]+"\t"+bt[i]+"\t"+ct[i]+"\t"+tt[i]+"\t"+wt[i]);
		}
	}

	private static void findwt(int[] bt, int[] tt, int[] wt) {
		// TODO Auto-generated method stub
		int n=bt.length;
		for(int i=0;i<n;i++) {
			wt[i]=tt[i]-bt[i];
		}
		
	}

	private static void findtt(int[] at, int[] ct, int[] tt) {
		// TODO Auto-generated method stub
		int n=at.length;
		for(int i=0;i<n;i++) {
			tt[i]=ct[i]-at[i];
		}
		
	}

	private static void findct(int[] at, int[] bt, int[] ct) {
		// TODO Auto-generated method stub
		int n=at.length;
		
		for(int i=0;i<n;i++) {
			int min=at[i];
			int geti=i;
			for(int j=i;j<n;j++) {
				if(min>at[j]) {
					min=at[j];
					geti=j;
				}
				
			}
			if(i==0) {
				ct[i]=bt[geti];
			}
			else {
				ct[i]=bt[geti]+ct[i-1];
			}
			
		}
	
	}

	private static void ganttChart(int[] at, int[] bt,int[] ct) {
		// TODO Auto-generated method stub
		int n=at.length;
		
		int process[]=new int[n];
		for(int i=0;i<n;i++) {
			int min=at[i];
			int geti=i;
			for(int j=i;j<n;j++) {
				if(min<at[i]) {
					min=at[i];
					geti=j;
				}
				
			}
			process[i]=geti;
			
		
			
		}
		System.out.println();
		System.out.println("GANTT CHART :");
		for(int i=0;i<n;i++) {
			System.out.print("  P"+process[i]+"   ");
		}
		System.out.println();
		System.out.print("0   ");
		for(int i=0;i<n;i++) {
			System.out.print("  "+ct[i]+"   ");
		}
	
		
	}
}
