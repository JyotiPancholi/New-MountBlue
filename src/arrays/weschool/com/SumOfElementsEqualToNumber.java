package arrays.weschool.com;

public class SumOfElementsEqualToNumber {

	public static void main(String[] args) {
		int arr[] = {14, -15, 9, 16, 30, 45, 12, 8};
		int num = 15;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]+arr[j]==num) {
					System.out.println(arr[i]+" + "+arr[j]+" = "+num);
				}
			}
		}
	}
}
