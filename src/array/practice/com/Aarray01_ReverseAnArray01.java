package array.practice.com;

public class Aarray01_ReverseAnArray01 {

	public static void main(String[] args) {
		int ar[] = new int[] { 1, 2, 3, 4, 5 };
		char ar2[] = {'h','e','l','l','o',' ','j','a','v','a'};
		System.out.println("Original array: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("Array after reverse : ");
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("Array after reverse : ");
		for (int i = ar2.length-1 ; i >= 0; i--) {
			System.out.print(ar2[i] + " ");
		}
	}
}
