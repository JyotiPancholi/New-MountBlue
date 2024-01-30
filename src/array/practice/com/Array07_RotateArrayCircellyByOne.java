package array.practice.com;

public class Array07_RotateArrayCircellyByOne {

	public static void main(String[] args) {
		//rotation with one element 
		int arr[] = {1,2,3,4,5};
		int temp= arr[arr.length-1];
		for (int i = arr.length-1; i > 0; i--) {
			 arr[i]=arr[i-1];
		}
		arr[0]=temp;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
