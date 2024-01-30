package array.practice.com;

public class Array15_BestTimeToBuyAndSellStocks {
	public static int bestTime(int arr [] ) {
		int buy = 0;
		int sell = 0;
		int high = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int profit = arr[j]-arr[i];
				if (profit>high) {
					high=profit;
				}
			}
		}
		return high;
	}
	public static void main(String[] args) {
//		int arr[] = {7,1,5,3,6,4};
		int arr[] = {7,6,4,3,1};
		int x = bestTime(arr);
		System.out.println(x);
	}
}
