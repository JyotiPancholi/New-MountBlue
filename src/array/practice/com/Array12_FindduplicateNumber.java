package array.practice.com;

public class Array12_FindduplicateNumber {

	public static void main(String[] args) {
		int arr[] = {1,3,4,2,2};
		int duplicate = 0 ;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					duplicate=arr[j];
					 break;
				}
			}
		}
		System.out.println(duplicate);
	}
}
