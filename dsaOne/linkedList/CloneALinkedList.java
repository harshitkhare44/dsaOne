package dsaOne.linkedList;

public class CloneALinkedList {
public static void main(String[] args) {
	InsertionDeletionTraversal obj=new InsertionDeletionTraversal();
	Node n1=new Node(1);
	Node n2=new Node(2);
	Node n3=new Node(3);
	Node n4=new Node(4);
	Node head=n1;
	n1.next=n2;
	n2.next=n3;
	n3.next=n4;
	n4.next=null;
	n1.random=n3;
	n2.random=n1;
	n3.random=n2;
	n4.random=n3;
//	Node dupHead=duplicate(head);
//	obj.print(dupHead);
	obj.print(head);
	
}
static Node duplicate(Node head) {
	Node cur=head;
	while(cur!=null) {
		Node temp=cur.next;
		cur.next=new Node(cur.data);
		cur.next.next=temp;
		cur=temp;
		
	}
	cur=head;
	while(cur!=null) {
		if(cur.next!=null) {
			cur.next.random=(cur.random!=null)?cur.random.next:null;
		}
		cur=cur.next.next;
	}
	Node orig=head,copy=head.next;
	Node temp=copy;
	while(orig!=null) {
		orig.next=orig.next.next;
		copy.next=copy.next.next;
		orig=orig.next;
		copy=copy.next;
	}
	
	return temp;
	
}
}
