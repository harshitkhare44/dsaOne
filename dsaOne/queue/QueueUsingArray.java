package dsaOne.queue;

import java.util.Scanner;

public class QueueUsingArray {
int a[];
int capacity;
int rear;
public static void main(String[] args) throws Exception {
	Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
	QueueUsingArray ad=new QueueUsingArray(n);
	ad.enqueue(24);
	ad.enqueue(2);
	ad.enqueue(8);
System.out.println(ad.getFront());
System.out.println(ad.dequeue());
System.out.println(ad.dequeue());
	
}

public QueueUsingArray(int n) {
	// TODO Auto-generated constructor stub
	capacity=n;
	a=new int[n];
	rear=-1;
}
void enqueue(int data) throws Exception {
	if(rear==capacity-1) {
		throw new Exception();
	}
	rear++;
	a[rear]=data;
}
int dequeue() throws Exception{
	if(rear==-1) {
		throw new Exception();
	}
	int result=a[0];
	for(int i=0;i<rear;i++) {
		a[i]=a[i+1];
	}
	rear--;
	return result;
}
int getFront() throws Exception{
	if(rear==-1) {
		throw new Exception();
	}
	return a[0];
}
}
