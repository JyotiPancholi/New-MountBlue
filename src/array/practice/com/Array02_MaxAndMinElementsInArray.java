package array.practice.com;

public class Array02_MaxAndMinElementsInArray {

	public static void main(String[] args) {
		int arr[] = new int [] {4,6,7,2,9,1,3};
		for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            int tmp = 0;
	            if (arr[i] > arr[j]) {
	                tmp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = tmp;
	           }
	        }
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("the Minimum number in Array : "+arr[0]);
		System.out.println("the Maximum number in Array : "+arr[arr.length-1]);

	}
}
