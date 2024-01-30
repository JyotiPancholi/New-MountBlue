package two_d.arrays.practice;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {

	private static List<Integer> printSpiral(int[][] arr) {
		int left = 0, right = arr[0].length - 1, top = 0, bottom = arr.length - 1, dir = 0;
		int i;
		List<Integer> list = new ArrayList<Integer>();
		while (top <= bottom && left <= right) {
			if (dir == 0) {
				for (i = left; i <= right; i++) {
					list.add(arr[top][i]);
				}
				top++;
			} else if (dir == 1) {
				for (i = top; i <= bottom; i++) {
					list.add(arr[i][right]);
				}
				right-=1;
			} else if (dir == 2) {
				for (i = right; i >= left; i--) {
					list.add(arr[bottom][i]);
				}
				bottom-=1;
			} else if (dir == 3) {
				for (i = bottom; i>= top; i--) {
					list.add(arr[i][left]);
				}
				left+=1;
			}
			dir=(dir+1)%4;
		}

		return list;
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List<Integer> l = printSpiral(arr);
        System.out.println(l);
	}
}