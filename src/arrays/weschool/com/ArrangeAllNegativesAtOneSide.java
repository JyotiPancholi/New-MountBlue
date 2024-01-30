package arrays.weschool.com;

public class ArrangeAllNegativesAtOneSide {

	public static void main(String[] args) {
		 int[] array = {-1, 2, -3, 4, -5, 6, -7, 8, -9};
	        System.out.println("Original array:");
	        printArray(array);
	        int n = array.length;
	        int left = 0;
	        for (int i = 0; i < n; i++) {
	            if (array[i] < 0) {
	                int temp = array[i];
	                array[i] = array[left];
	                array[left] = temp;
	                left++;
	            }
	        }
	        System.out.println("\nArray after rearranging negatives:");
	        printArray(array);
	    }

	    public static void printArray(int[] arr) {
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
	}