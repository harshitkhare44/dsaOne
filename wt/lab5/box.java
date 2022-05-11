package wt.lab5;

import java.util.*;
public class box {
    int length;
    int width;
    int height;
   
    public  static class demo{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         box a=new box();
         a.length=sc.nextInt();
         a.width=sc.nextInt();
         a.height=sc.nextInt();
        volume(a.length,a.width,a.height);
     }

    private static void volume(int length, int width, int height) {
        System.out.println("volume"+"= "+ length*height*width);
    }
     
    }

    }
  


  

