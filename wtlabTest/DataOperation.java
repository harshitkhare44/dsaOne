package wtlabTest;

import java.io.*;
import java.util.*;
import java.lang.*;

public class DataOperation {
	  public static void main(String[] args) throws IOException {
		  String ln;
	        double[][] set = new double[70][4];
	        double[][] vir = new double[70][4];
	        double[][] ver = new double[70][4];
	        final String filename = "D:\\4th semister\\Web Tecnology (WT)\\lab tests\\iris_data.csv";
	        FileReader fr = new FileReader(filename);
	        BufferedReader br = new BufferedReader(fr);
	        int c1=0,c2=0,c3=0;
	        for (int i = 0; i < 150; ++i) {
	            ln = br.readLine();
	            String[] dl = ln.split(",");
	            for (int j = 0; j < 4; ++j) 
				{
	                if(dl[4].equalsIgnoreCase("setosa"))
	                set[c1][j] = Double.parseDouble(dl[j]);

	                if(dl[4].equalsIgnoreCase("versicolor"))
	                ver[c2][j] = Double.parseDouble(dl[j]);
	                
	                if(dl[4].equalsIgnoreCase("virginica"))
	                vir[c3][j] = Double.parseDouble(dl[j]);
	            }

	            if(dl[4].equalsIgnoreCase("setosa"))
	            c1++;
	            if(dl[4].equalsIgnoreCase("versicolor"))
	            c2++;
	            if(dl[4].equalsIgnoreCase("virginica"))
	            c3++;
	            
	        }
	        System.out.println("-||-||-||-");
	      

	        for (int i = 0; i < c1; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                System.out.printf("%.1f ", +set[i][j]);
	            }
	            System.out.println(",Iris-setosa");
	        }
	       

	        for (int i = 0; i < c2; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                System.out.printf("%.1f ", +vir[i][j]);
	            }
	            System.out.println(",virginica");
	        }
	  
	        for (int i = 0; i < c1; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                System.out.printf("%.1f ", +ver[i][j]);
	            }
	            System.out.println(",versicolor");
	        }
	        

	        double[][] Training_set = new double[150][4];
	        double[][] Test_set = new double[150][4];

	        int c=0;
	        for (int i = 0; i < .7*c1; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                Training_set[c][j] = set[i][j];
	            }
	            c++;   
	        }

	        for (int i = 0; i < .7*c2; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                Training_set[c][j] = vir[i][j];
	            }
	            c++;   
	        }

	        for (int i = 0; i < .7*c3; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                Training_set[c][j] = ver[i][j];
	            }
	            c++;   
	        }
	        int cd=0;
	        for (int i = (int).7*c1; i < c1; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                Test_set[cd][j] = set[i][j];
	            }
	            cd++;   
	        }
	        for (int i = (int).7*c2; i < c2; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                Test_set[cd][j] = vir[i][j];
	            }
	            cd++;   
	        }
	        for (int i = (int).7*c3; i < c3; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	                Test_set[cd][j] = ver[i][j];
	            }
	            cd++;   
	        }
	        System.out.println("training set");
	        for (int i = 0; i < c; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	               System.out.printf("%.1f ", +Training_set[i][j]);
	            }  
	            System.out.println();
	        }
	        System.out.println("-||-||-||-||-");   
	        System.out.println("-||-||-||-||-");
	        System.out.println("-||-||-||-||-");
	        System.out.println("test set");
	        for (int i = 0; i < cd; ++i) 
			{
	            for (int j = 0; j < 4; ++j) 
				{
	               System.out.printf("%.1f ", +Test_set[i][j]);
	            }  
	            System.out.println();
	        }
	   
	    }
	  
	  
}