package arrays.weschool.com;

public class ConvertArrayFromMatrixToAntiDiagonal2 {
	    
	    public static void main(String[] args) {
//	        int[][] matrix1 = {{1, 2}, {3, 4}};
//	        System.out.println("Input:");
//	        printMatrix(matrix1);
//	        System.out.println("\nOutput:");
//	        printAntiDiagonals(getAntiDiagonals(matrix1));

	        int[][] matrix = {{10, 20, 30}, {50, 60, 70}, {90, 100, 110}};
	        int m = matrix.length;
	        int n = matrix[0].length;
	        for (int k = 0; k < m+n-1; k++) {
	        	for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						if (i+j==k) {
							System.out.print(matrix[i][j]+" ");
						}
					}
				}System.out.println();
			}
	    }
	}