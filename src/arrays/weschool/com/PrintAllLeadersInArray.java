package arrays.weschool.com;

public class PrintAllLeadersInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 9, 14, 23, 15, 0, 9 };
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int j;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] <= arr[j]) {
					break;
				}
			}
			if (j == arr.length) {
				System.out.println(arr[i] + " ");
			}
		}
	}
}
