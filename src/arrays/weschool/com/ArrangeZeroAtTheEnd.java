package arrays.weschool.com;

public class ArrangeZeroAtTheEnd {

	public static void main(String[] args) {
		int arr[] = {0, 0, 1, 0, 3, 0, 5, 0, 6};
		 System.out.println("Original array:");
	        printArray(arr);
	        int nonZeroIndex = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	            	arr[nonZeroIndex++] = arr[i];
	            }
	        }
	        for (int i = nonZeroIndex; i < arr.length; i++) {
	        	arr[i] = 0;
	        }
	        System.out.println("\nArray after moving zeros to the end:");
	        printArray(arr);
	    }

	    public static void printArray(int[] arr) {
	        for (int element : arr) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
	}