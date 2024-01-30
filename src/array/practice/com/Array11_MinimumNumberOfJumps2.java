package array.practice.com;

public class Array11_MinimumNumberOfJumps2 {
	public static int result(int arr[]) {
		int n = arr.length;
		int jumps = 0;
		int curMax = 0;
		int curReach = 0;

		for (int i = 0; i < n - 1; i++) {
			if (i + arr[i] > curMax) {
				curMax = i + arr[i];
			}
			if (i == curReach) {
				jumps++;
				curReach = curMax;
			}
			if (arr[i] == 0 && i == curMax) {
				return -1;
			}
		}
		return jumps;
	   
	}

	public static void main(String[] args) {
		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		System.out.println(result(arr));
	}
}
