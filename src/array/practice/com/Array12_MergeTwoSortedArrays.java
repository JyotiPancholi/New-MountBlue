package array.practice.com;

public class Array12_MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = {1,3,5,7,9,11};
		int arr2[] = {2,4,6,8,10};
		int a=arr1.length;
		int b=arr2.length;
		int c = a+b;
		int arr3[] = new int[c];
		int count=0;
		for (int i = 0; i < a; i++) {
			arr3[count++]=arr1[i];
		}
		for (int j = 0; j < b; j++) {
			arr3[count++]=arr2[j];
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
	}
}
