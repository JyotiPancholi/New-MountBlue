package array.practice.com;

public class Array21_MaximumProductSubArray {

	public static void main(String[] args) {
		int arr [] =  {6, -3, -10, 0, 2};
		long maxprod = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length ;i++)
        {
            long prod = 1;
            for(int j = i; j<arr.length ; j++)
            {
                prod = prod * arr[j];
                maxprod = Math.max(maxprod, prod);
            }
        }
        System.out.println(maxprod);
	}
}
