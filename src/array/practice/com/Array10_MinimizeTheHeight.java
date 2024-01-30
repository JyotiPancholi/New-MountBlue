package array.practice.com;

public class Array10_MinimizeTheHeight {
	public static int difference(int arr[], int k) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > k) {
				arr[i] = arr[i] - k;
			} else {
				arr[i] = arr[i] + k;
			}

			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int diff = max-min;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return diff;
	}

	public static void main(String[] args) {
//		int arr[] = {1,5,8,10};
		int arr[] = { 3, 9, 12, 16, 20 };
		int x =difference(arr, 3);
		System.out.println("Difference between min and max Tower is : "+x);
	}
}
