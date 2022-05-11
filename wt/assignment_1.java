package wt;


import java.io.*;
import java.util.*;
public class assignment_1
{
public static void main (String[] args) throws IOException
{
String ln;
double [] [] data = new double [150] [4];
final String filename = "D:\\\\4th semister\\\\Web Tecnology (WT)\\\\codes lect wise\\\\iris.csv";
FileReader fr = new FileReader (filename);
BufferedReader br = new BufferedReader (fr);
for (int i = 0; i < 150; ++i)
{
 ln = br.readLine () ;
String[] dl = ln.split (",");
for (int j = 0; j < 4; ++j)
{
data[i] [j] = Double.parseDouble (dl[j]);
}
}
System.out.print ("att1 att2 att3 att4 ") ;
System.out.println();
for (int i= 0; i < data.length; ++i)
{
for (int j = 0; j < data[i].length; ++j)
{
System.out.print (data[i][j]+"  ") ;
}
System.out.println();
}
int[] result = new int[data.length];
int[] result1 = new int[data.length];
int sum = 0, average = 0;
for (int i= 0; i < data.length; ++i)
{
    int min = (int) data[0][i];
    int max = (int) data[0][i];
for (int j = 0; j < data[i].length; ++j)
{
    if (data[j][i] < min) {
        min = (int) data[j][i];
    }
    result[i] =min;
    if (data[j][i] > max) {
        max = (int) data[j][i];
    }
    result1[i] = max;
    sum = (int) (sum + data[i][j]);
}

System.out.println("min="+min);
System.out.println("max="+max);
average = sum / data[i].length;
        sum = 0;
        System.out.println("average="+average);
}

}
}