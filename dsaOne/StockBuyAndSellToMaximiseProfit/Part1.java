package dsaOne.StockBuyAndSellToMaximiseProfit;

public class Part1 {
	static int maxProfit(int arr[]) {
		int minSoFar=arr[0];
		int maxProfit=0;
		for(int i=0;i<arr.length;i++) {
			minSoFar=Math.min(minSoFar, arr[i]);
			int profit=arr[i]-minSoFar;
			maxProfit=Math.max(maxProfit, profit);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int arr[]= {5,2,6,1,4};
      System.out.println(maxProfit(arr));
	}

}
