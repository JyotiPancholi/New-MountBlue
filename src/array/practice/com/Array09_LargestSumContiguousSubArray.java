package array.practice.com;

public class Array09_LargestSumContiguousSubArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,-2,5};
//		int arr[] = {-1,-2,-3,-4};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <=arr.length-1; i++) {
			int currentMax=0;
			for (int j = i; j <=arr.length-1; j++) {
				currentMax+=arr[j];
			}
			if (currentMax>max) {
				max=currentMax;
			}
		}
		System.out.println("highest Sum Of SubArray Is : "+max);
	}
}
