package dsaOne;

public class largestSumSubArray {

	static int maxSum(int a[]) {
		int currSum = 0;
		int realSum = 0;
		for (int i = 0; i < a.length; i++) {
			currSum += a[i];
			if (currSum > realSum) {
				realSum = currSum;
			}
			if (currSum < 0) {
				currSum = 0;
			}
		}
		return realSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -5, 4, 6, -3, 4, -1 };
		System.out.println(maxSum(a));

	}

}
