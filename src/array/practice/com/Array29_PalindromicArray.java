package array.practice.com;

public class Array29_PalindromicArray {
	public static int findIfPalindrom(int arr[]) {
		int n = arr.length;
		 for (int i = 0; i < n; i++) {
	            int num = arr[i];
	            int rev = 0;

	            while (num > 0) {
	                int digit = num % 10;
	                rev = rev * 10 + digit;
	                num /= 10;
	            }

	            if (arr[i] != rev) {
	                return 0;
	            }
	        }
	        return 1;
	}
	public static void main(String[] args) {
		int arr[] = {111, 222, 333, 444, 555};
		int x = findIfPalindrom(arr);
		System.out.println(x);
	}
}
