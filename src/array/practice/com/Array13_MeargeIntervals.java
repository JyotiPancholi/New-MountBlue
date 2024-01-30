package array.practice.com;

import java.util.Arrays;
import java.util.Comparator;

public class Array13_MeargeIntervals {

	public static void main(String[] args) {
		int[][] arr = { { 1, 3 }, { 8, 10 }, { 2, 6 },{ 15, 18 },{2,8} };
		int[][] arr3 = {{1,4},{4,5}};
		int[][] arr2 = new int[5][2];
		int index = 0 ;
        Arrays.sort(arr, Comparator.comparing(interval -> interval[0]));
        arr2[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr2[index][1] >= arr[i][0]) {
                arr2[index][1] = Math.max(arr2[index][1], arr[i][1]);
            } else {
                index++;
                arr2[index] = arr[i];
            }
        }
        arr2 = Arrays.copyOf(arr2, index + 1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(Arrays.toString(arr2[i]));
        }
	}
}
