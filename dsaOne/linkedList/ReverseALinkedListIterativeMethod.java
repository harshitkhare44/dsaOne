package dsaOne.linkedList;
import dsaOne.linkedList.InsertionDeletionTraversal;
public class ReverseALinkedListIterativeMethod {
	
	public static Node reverse(Node head) {
		Node cur=head;
		Node prev=null;
		while(cur!=null) {
			Node temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		return prev;
	}
}
