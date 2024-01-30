package array.practice.com;

public class Array22_LongestConseutiveSubSquence {

	public static void main(String[] args) {
		int arr[] = {1,9,3,10,4,20,2};
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i==arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
