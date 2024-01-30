package array.practice.com;

import java.util.Arrays;

public class Array27_ChocolateDistribution {
	public static int findMinDiff(int arr[], int m) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		int ans = Integer.MAX_VALUE;
		int n = arr.length;
		for (int i = 0; i < n-m+1; i++) {
			int min = arr[i] ;
			int max = arr[i+ m-1];
			int gap = max-min;
			if (gap<ans) {
				ans=gap;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 3, 2, 4, 9, 12, 56 };
		int x = findMinDiff(arr, 3);
		System.out.println();
		System.out.println(x);
	}
}
