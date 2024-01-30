package array.practice.com;

public class Array04_SortingOf0s1s2s {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 0, 1, 2, 2, 0, 1 };
		int counter0 = 0, counter1 = 0, counter2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				counter0++;
			} else if (arr[i] == 1) {
				counter1++;
			}
			else{
				counter2++;
			}
		}

		int i=0;
		for (int j = 0; j < counter0; j++) {
			arr[i++] = 0;
		}
		for (int j = 0 ; j < counter1; j++) {
			arr[i++] = 1;
		}
		for (int j = 0; j < counter2; j++) {
			arr[i++] = 2;
		}

		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
