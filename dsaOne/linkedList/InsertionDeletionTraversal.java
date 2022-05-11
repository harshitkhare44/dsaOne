package dsaOne.linkedList;
import dsaOne.linkedList.ReverseALinkedListIterativeMethod;
public class InsertionDeletionTraversal {
	public static void main(String[] args) {
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		print(head);
		System.out.println();
		insert(4,head,2);
		print(head);
		System.out.println();
		delete(head,2);
		print(head);
		System.out.println();
	Node prev=reverse(head);
		print(prev);
	}
	public static void print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	static void insert(int data,Node head,int pos) {
		Node toAdd=new Node(data);
		if(pos==0) {
			toAdd.next=head;
			head=toAdd;
			return;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++) {
			prev=prev.next;
		}
	toAdd.next=prev.next;
	prev.next=toAdd;
	
	}
	static void delete(Node head,int pos) {
		if(pos==0) {
			head=head.next;
			return;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++) {
			prev=prev.next;
		}
		prev.next=prev.next.next;
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
 static Node reverse(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		Node newHead=reverse(head.next);
		Node headNext=head.next;
		headNext.next=head;
		head.next=null;
		return newHead;
	}
		

}
class Node<T>{
	T data;
	Node next;
	Node random;
	Node(T data){
		this.data=data;
	}
}
