package array.practice.com;

public class Array17_CountPairWithGivenSum {
	public static int coutPair(int arr[],int k) {
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int w = arr[i]+arr[j];
				if (w==k) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
//		int arr[] = {1, 5, 7, 1};
		int arr[] = {1, 1, 1, 1};
		int x = coutPair(arr,2);
		System.out.println(x);
	}
}
