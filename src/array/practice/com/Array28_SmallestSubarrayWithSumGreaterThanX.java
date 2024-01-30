package array.practice.com;

public class Array28_SmallestSubarrayWithSumGreaterThanX {

	public static int smallestSubWithSum(int arr[], int x) {
		    int n = arr.length;
		    int sum=0;
	        int start=0;
	        int minimumLength=Integer.MAX_VALUE;
	        
	        for(int i=0;i<n;i++){
	            sum+=arr[i];
	            if(sum>x){
	                while(sum>x){
	                    minimumLength=Math.min(minimumLength,i-start+1);
	                    sum-=arr[start++];
	                }
	            }
	        }
//	        return minimumLength==Integer.MAX_VALUE?0:minimumLength;
	        return Math.min(minimumLength, Integer.MAX_VALUE);
	}
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 6, 0, 19};
		int i = smallestSubWithSum(arr, 51);
		System.out.println(i);
	}
}
