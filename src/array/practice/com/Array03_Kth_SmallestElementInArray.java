package array.practice.com;

public class Array03_Kth_SmallestElementInArray {

	public static void main(String[] args) {
		int arr[] = new int[] {3,9,7,5,10,2,4};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j <arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("3rd Min Number of array : "+arr[2]);
	}
}
