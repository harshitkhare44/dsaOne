package codechef;
import java.util.*;

public class second {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int numPlayers=sc.nextInt();
	int recScore[]=new int[numPlayers];
	int rewards[]=new int[numPlayers];
	for(int i=0;i<numPlayers;i++) {
		recScore[i]=sc.nextInt();
		rewards[i]=1;
	}
	for(int i=0;i<numPlayers;i++) {
		if(i==0) {
			if(recScore[i]>recScore[i+1]) {
				rewards[i]+=rewards[i+1];
			}
		}
		if(i==numPlayers-1) {
			if(recScore[i]>recScore[i-1]) {
				rewards[i]+=rewards[i-1];
			}
		}
		if(i>0 && i<numPlayers-1) {
			if(recScore[i]>recScore[i-1] &&recScore[i]>recScore[i+1]) {
				rewards[i]+=Math.max(numPlayers, numPlayers);
			}
		}
	}
	int sum=0;
	for(int i=0;i<numPlayers;i++) {
		sum+=rewards[i];

	}
	System.out.println(sum);
}
}	
