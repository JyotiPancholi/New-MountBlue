package two_d.arrays.practice;

public class ToePlitzMatrix {

	public static boolean isToeplitzMatrix(int[][] matrix) {
//		for (int i = 1; i < matrix.length; i++) {
//			for (int j = 1; j < matrix[i].length; j++) {
//				if (matrix[i][j] != matrix[i - 1][j - 1]) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
		for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                try{
                  if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
                }
                catch(ArrayIndexOutOfBoundsException e){
                    //System.out.println("Nothing");
                }
                
            }
        }
        return true;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 4, 2, 3 }, { 9, 5, 1, 2 } };
		System.out.println(isToeplitzMatrix(arr));
	}
}
