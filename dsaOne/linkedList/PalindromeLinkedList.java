package dsaOne.linkedList;

import java.util.LinkedList;
import java.util.List;

public class PalindromeLinkedList {
static ReverseALinkedListIterativeMethod obj=new ReverseALinkedListIterativeMethod();
	static boolean palindrome(Node head) {
		if(head==null)
			return true;
		Node mid=middle(head);
		Node last=obj.reverse(mid.next);
		Node cur=head;
		while(last!=null) {
			if(last.data!=cur.data) {
				return false;
			}
			last=last.next;
			cur=cur.next;
			
		}
		return true;
	}
	static Node middle(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
		}
		return slow;
	}
//	public static Node reverse(Node head) {
//		Node cur=head;
//		Node prev=null;
//		while(cur!=null) {
//			Node temp=cur.next;
//			cur.next=prev;
//			prev=cur;
//			cur=temp;
//		}
//		return prev;
//	}
	public static void main(String[] args) {
		Node n1=new Node('A');
		Node n2=new Node('B');
		Node n3=new Node('C');
		Node n4=new Node('B');
		Node n5=new Node('A');
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		boolean ans=palindrome(head);
		System.out.println(ans);
		
	}
}
