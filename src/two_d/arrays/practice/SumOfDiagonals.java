package two_d.arrays.practice;

public class SumOfDiagonals {

	 public static int diagonalSum(int[][] mat) {
		 int n=mat.length;
	        int ans=0;
	        int mid=n/2;
	        
	            for(int i=0;i<n;i++)
	            {
	                ans+=mat[i][i]+mat[i][n-i-1];
	            }
	            if(n%2==1)
	            {
	              ans-=mat[mid][mid];
	            }
	            return ans;
	    }    
	    
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int arr1[][]= {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int result= diagonalSum(arr);
		System.out.println(result);
	}
}
