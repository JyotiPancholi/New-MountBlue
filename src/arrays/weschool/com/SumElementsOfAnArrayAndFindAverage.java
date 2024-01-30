package arrays.weschool.com;

public class SumElementsOfAnArrayAndFindAverage {

	public static void main(String[] args) {
		int arr[] = {5,2,3,6,9,1,4};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		int average = sum/arr.length;
		System.out.println("Average of ArraysElements : "+average);
	}
}
