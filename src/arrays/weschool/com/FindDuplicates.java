package arrays.weschool.com;

public class FindDuplicates {

	public static void main(String[] args) {
		int arr[]= {5,2,3,6,9,1,1,4};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j] && i!=j) {
					System.out.println(arr[j]+" ");
				}
			}
		}
		String str []= {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i].equals(str[j]) && i!=j) {
					System.out.println(str[j]+" ");
				}
			}
		}
	}
}
