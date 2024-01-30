package array.practice.com;

public class Array14_InversionCount2 {
	
	public static long inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static long mergeSort(int[] arr, int low, int high) {
        long inversionCount = 0;

        if (low < high) {
            int mid = (low + high) / 2;
            inversionCount += mergeSort(arr, low, mid);
            inversionCount += mergeSort(arr, mid + 1, high);
            inversionCount += merge(arr, low, mid, high);
        }

        return inversionCount;
    }

    private static long merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];
        System.arraycopy(arr, low, left, 0, n1);
        System.arraycopy(arr, mid + 1, right, 0, n2);

        long inversionCount = 0;
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                // Inversion found
                arr[k++] = right[j++];
                inversionCount += n1 - i;
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
        return inversionCount;
    }
    
    
	public static void main(String[] args) {
		int[] arr1 = {2, 4, 1, 3, 5};
        System.out.println("Inversion Count: " + inversionCount(arr1)); 
	}
}
