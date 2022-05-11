package dsaOne.binaryTree;
import java.util.*;

public class heightOfABinaryTree {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BinaryTree tree = new BinaryTree();
	  
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    System.out.print(tree.height(tree.root));
}

class BinaryTree
{
     Node root;
  
     int height(Node root) {
    		if(root==null)
    			return 0;
    		return Math.max(height(root.left),height(root.right)+1);
    	}

}
}
class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
  