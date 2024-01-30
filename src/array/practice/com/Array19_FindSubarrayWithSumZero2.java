package array.practice.com;

public class Array19_FindSubarrayWithSumZero2 {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 3, 1, 6 };
		int n = arr.length;
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			int sum = arr[i];
			if (sum == 0) {
				flag = true;
				System.out.println(flag);
				break;
			}
			for (int j = i + 1; j < n; j++) {
				sum += arr[j];
				if (sum == 0) {
					flag = true;
					System.out.println(flag);
					break;
				}
			}
		}
	}
}
