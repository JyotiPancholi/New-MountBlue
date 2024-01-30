package array.practice.com;

public class Array11_MinimumNumberOfJumps {

	public static int result(int arr[]) {
		int steps =0;
		for (int i = 0; i < arr.length-1; ) {
			i=i+arr[i];
			steps++;
			if (i>=arr.length-1) {
				return steps;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
//		int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int arr[] = {1, 4, 3, 2, 6, 7};
		int x = result(arr);
		System.out.println(x);
	}
}

