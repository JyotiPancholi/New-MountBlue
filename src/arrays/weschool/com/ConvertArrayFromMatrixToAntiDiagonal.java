package arrays.weschool.com;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayFromMatrixToAntiDiagonal {
	 public static List<List<Integer>> getAntiDiagonals(int[][] matrix) {
	        List<List<Integer>> result = new ArrayList<>();
	        int n = matrix.length;

	        for (int i = 0; i < n; i++) {
	            List<Integer> diagonal = new ArrayList<>();
	            for (int j = 0; j <= i; j++) {
	                diagonal.add(matrix[i - j][j]);
	            }
	            result.add(diagonal);
	        }

	        for (int i = 1; i < n; i++) {
	            List<Integer> diagonal = new ArrayList<>();
	            for (int j = 0; j < n - i; j++) {
	                diagonal.add(matrix[n - 1 - j][i + j]);
	            }
	            result.add(diagonal);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[][] matrix1 = {{1, 2}, {3, 4}};
	        System.out.println("Input:");
	        printMatrix(matrix1);
	        System.out.println("\nOutput:");
	        printAntiDiagonals(getAntiDiagonals(matrix1));

	        int[][] matrix2 = {{10, 20, 30}, {50, 60, 70}, {90, 100, 110}};
	        System.out.println("\nInput:");
	        printMatrix(matrix2);
	        System.out.println("\nOutput:");
	        printAntiDiagonals(getAntiDiagonals(matrix2));
	    }

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int element : row) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void printAntiDiagonals(List<List<Integer>> antiDiagonals) {
	        for (List<Integer> diagonal : antiDiagonals) {
	            System.out.println(diagonal);
	        }
	    }
	}