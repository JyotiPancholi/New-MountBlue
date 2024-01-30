package two_d.arrays.practice;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		int [][]arr = {{1,2,3},{1,2,3}};
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int r=0;
			for (int j = 0; 	j < arr[0].length; j++) {
				r=r+arr[i][j];
				max=Math.max(max, r);
			}
		}
		System.out.println(max);
	}
 }
