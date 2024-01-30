package array.practice.com;

public class Array08_RotateArrayCircellyBytwo {
	public static int[] rotationByTwo(int arr[]) {
		int temp= arr[arr.length-1];
		for (int i = arr.length-1; i > 0; i--) {
			 arr[i]=arr[i-1];
		}
		arr[0]=temp;
		return arr;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		rotationByTwo(arr);
		rotationByTwo(arr);
		rotationByTwo(arr);
//		int arr2 [] = rotationByTwo(arr);
//		int arr3 [] = rotationByTwo(arr2);
//		int arr4 [] = rotationByTwo(arr3);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
