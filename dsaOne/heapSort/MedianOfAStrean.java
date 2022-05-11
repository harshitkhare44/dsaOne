package dsaOne.heapSort;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MedianOfAStrean {
	PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
	PriorityQueue<Integer> minHeap=new PriorityQueue<>();

private void insertNum(int a) {
	// TODO Auto-generated method stub
	if(maxHeap.isEmpty() || maxHeap.peek()>=a) {
		maxHeap.add(a);
	}
	else {
		minHeap.add(a);
	}
	if(maxHeap.size()>minHeap.size()+1)
		minHeap.add(maxHeap.poll());
	else if(maxHeap.size()<minHeap.size())
		maxHeap.add(minHeap.poll());
}
private double findMedian() {
	if(maxHeap.size()==minHeap.size()) {
		return maxHeap.peek()/2.0+minHeap.peek()/2.0;
	}
	return maxHeap.peek();
	
}

public static void main(String[] args) {
	MedianOfAStrean medianOfAStream =new MedianOfAStrean();
	Scanner sc=new Scanner(System.in);

	medianOfAStream.insertNum(3);
	medianOfAStream.insertNum(2);
	System.out.println(medianOfAStream.findMedian());

}

}

