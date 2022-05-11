package dsaOne.stack;

public class stackUsingArrays {
	public static void main(String[] args) throws Exception {
		MyStack stack=new MyStack(4);
		
		stack.push(10);
		stack.push(1);
		stack.push(20);
		stack.push(4);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());

	}



}
 class MyStack{
	int a[];
	int top;
	int capacity;
	public MyStack(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity=capacity;
		top=-1;
		a=new int[capacity];
	}
	void push(int data) throws Exception {
		if(top==capacity-1) {
			throw new Exception("out of capacity");
		}
		top++;
		a[top]=data;
	}
	int pop() throws Exception {
		if(top==-1) {
			throw new Exception("cant remove from empty stack");
		}
	int res=a[top];
	top--;
	return res;
	}
	int peek() throws Exception{
		if(top==-1) {
			throw new Exception("cant peek from empty stack");
		}
		int res=a[top];
		return res;
	}
	boolean isEmpty() {
		return top==-1;
	}

	
}