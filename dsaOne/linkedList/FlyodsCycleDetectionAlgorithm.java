package dsaOne.linkedList;
import dsaOne.linkedList.InsertionDeletionTraversal;
public class FlyodsCycleDetectionAlgorithm {

	public static void main(String[] args) {
		InsertionDeletionTraversal obj=new InsertionDeletionTraversal();
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		Node n7=new Node(7);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n3;
		Node head=n1;
	Node ans=detectFisrtNode(head);
	System.out.println(ans.data);
	deleteCycle(head);
	obj.print(head);
		
	}
	static Node detectCycle(Node head) {
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(slow ==fast) {
				return slow;
			}
		}
		return null;
	}
	static Node detectFisrtNode(Node head) {
		Node meet=detectCycle(head);
		Node start=head;
		while(start!=meet) {
			start=start.next;
			meet=meet.next;
		}
		return start;
	}
	static void deleteCycle(Node head) {
		Node meet=detectCycle(head);
		Node start=head;
		Node prev=null;
		while(start!=meet) {
			start=start.next;
			prev=meet;
			meet=meet.next;
		}
	prev.next=null;
	}
}
