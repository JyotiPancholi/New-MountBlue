package arrays.weschool.com;

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[]= {5,2,3,6,9,1,1,4};
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("max = "+max);
	}
}
