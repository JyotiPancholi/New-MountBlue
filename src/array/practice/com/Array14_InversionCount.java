package array.practice.com;

public class Array14_InversionCount {

	public int countInversion(int [] arr) {
		int inverse=0 ;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					inverse++;
				}
			}
		}
		return inverse;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,1,3,5};
		Array14_InversionCount a = new Array14_InversionCount();
		int x = a.countInversion(arr);
		System.out.println(x);
//		int inverse=0 ;
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = 0; j < arr.length-1; j++) {
//				if (arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]= temp;
//					inverse++;
//				}
//			}
//		}System.out.println("Inversion Count Of Given Array is : "+inverse);
	}
}
