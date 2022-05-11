package codechef;
//{ Driver Code Starts
//driver

import java.util.*;

class Node {
 int data;
 Node next;

 Node(int d) {
     data = d;
     next = null;
 }
}

class doubt{
 
 static void printList(Node n){
     while(n!=null){
         System.out.print(n.data+" ");
         n = n.next;
     }
     System.out.println();
 }
 
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     
     while (T-- > 0) {
         
         int n = sc.nextInt();
         int val = sc.nextInt();
         
         Node first = new Node(val);
         Node tail = first;
         for(int i=0; i<n-1; i++)
         {
             val = sc.nextInt();
             tail.next = new Node(val);
             tail = tail.next;
         }
         
         int m = sc.nextInt();
         val = sc.nextInt();
         
         Node second = new Node(val);
         tail = second;
         for(int i=0; i<m-1; i++)
         {
             val = sc.nextInt();
             tail.next = new Node(val);
             tail = tail.next;
         }
         
         Solution g = new Solution();
         Node res = g.addTwoLists(first, second);
         printList(res);
     }
 }
}
//} Driver Code Ends


/* node for linked list

class Node {
 int data;
 Node next;

 Node(int d) {
     data = d;
     next = null;
 }
}

*/

class Solution{
 //Function to add two numbers represented by linked list.
 static Node addTwoLists(Node first, Node second){
     // code here
     // return head of sum list
     Node curfirst=reverse(first);
     Node cursec=reverse(second);
     int carry=0;
     while(curfirst!=null || cursec!=null){
         curfirst.data=(curfirst.data+cursec.data+carry)%10;
         carry+=(curfirst.data/10)-carry;
         if(curfirst!=null){
         curfirst=curfirst.next;
         }
         if(cursec!=null){
         cursec=cursec.next;
         }
     }
     return curfirst;
 }
 static Node reverse(Node head){
     if(head==null|| head.next==null){
         return head;
     }
     Node newHead=reverse(head.next);
     Node headNext=head.next;
     headNext.next=head;
     head.next=null;
     return newHead;
 }
}