package two_d.arrays.practice;

public class SpiralMatrixOfSize_n {
	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int num = 1;
		int top = 0, bottom = n - 1, left = 0, right = n - 1;

		while (top <= bottom && left <= right) {
			for (int i = left; i <= right; i++) {
				matrix[top][i] = num++;
			}
			top++;
			for (int i = top; i <= bottom; i++) {
				matrix[i][right] = num++;
			}
			right--;
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					matrix[bottom][i] = num++;
				}
				bottom--;
			}
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					matrix[i][left] = num++;
				}
				left++;
			}
		}
		return matrix;
	}

	public static void main(String[] args) {
		int arr[][] = generateMatrix(5);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
