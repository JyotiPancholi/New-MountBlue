package array.practice.com;

import java.util.Arrays;

public class Array26_TripletSumInArray {
	static boolean tripletSum(int arr[], int x) {
		Arrays.sort(arr);
		int n =  arr.length;
		for (int i = 0; i <n; i++) {
			int j=i+1,k=n-1;
			while (j<k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum==x) {
					return true;
				}else if(sum>x){
					k--;
				}else {
					j++;
				}
			}
		}
//		for(int i=0; i<n-2; i++){
//            for(int j=i+1, k=n-1; j<k; ){
//                int cursum = arr[i] + arr[j] + arr[k];
//                
//                if(cursum == x) return true;
//                else if(cursum < x){
//                    j++;
//                }else{
//                    k--;
//                }
//            }
//        }
        return false;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, 45, 6, 10, 8 };
		boolean i = tripletSum(arr, 13);
		System.out.println(i);
	}
}
