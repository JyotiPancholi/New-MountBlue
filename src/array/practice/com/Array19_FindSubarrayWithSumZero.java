package array.practice.com;

public class Array19_FindSubarrayWithSumZero {

	public static void main(String[] args) {
		int arr[] =  {4,2,-3,1,6};
		int sum = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			if (sum==0 || arr[i]==0) {
				flag = true;
				break;
			}
			int currentSum =0;
			for (int j = 0; j < i; j++) {
				currentSum+=arr[j];
				if (currentSum==sum) {
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		System.out.println(flag);
	}
}
