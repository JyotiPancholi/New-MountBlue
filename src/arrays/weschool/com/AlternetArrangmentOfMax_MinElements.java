package arrays.weschool.com;

import java.util.Arrays;

public class AlternetArrangmentOfMax_MinElements {

	public static void maxMinSort(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i += 2) {
            result[i] = arr[right--];
            if (i + 1 < n) {
                result[i + 1] = arr[left++];
            }
        }
        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] array = {100, 10, 90, 20, 80, 30, 70, 40, 60, 50};

        System.out.println("Original array:");
        printArray(array);

        maxMinSort(array);

        System.out.println("\nArray after max-min sorting:");
        printArray(array);
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}