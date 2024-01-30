package array.practice.com;

public class Array05_MoveNegativeOneSide {

	public static void main(String[] args) {
//		int arr[] = { -2, 9, 7, -6, 5, 6, -4, -8, 3, -5, -3, 7 };
//		int countNegative = 0, countpositive = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < 0) {
//				countNegative++;
//			} else {
//				countpositive++;
//			}
//		}
//		int ar1[] = new int[countNegative];
//		int ar2[] = new int[countpositive];
//		int index1 = 0;
//		int index2 = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < 0) {
//				ar1[index1++] = arr[i];
//			} else {
//				ar2[index2++] = arr[i];
//			}
//		}
//
//		int i = 0;
//		for (int j = 0; j < ar1.length; j++) {
//			arr[i++] = ar1[j];
//		}
//		for (int j = 0; j < ar2.length; j++) {
//			arr[i++] = ar2[j];
//		}
//
//		for (int k = 0; k < arr.length; k++) {
//			System.out.print(arr[k] + " ");
//		}
		
//----------------------------------other simple way
//		int arr[] = { -2, 9, 7, -6, 5, 6, -4, -8, 3, -5, -3, 7 };
//		int arr[] = { -2, -6, -4, -8, -5, -3, 7, 9, 3, 5, 6, 7 };
//			int index =0;//1,2,3,4,5
//			for (int j = 0; j < arr.length; j++) {//0,3,6,7,10,11
//				if (arr[j] < 0) {
//	                int temp = arr[j]; //-2,-6,-4,-8,-5,-3
//	                arr[j] = arr[index];
//	                arr[index] = temp;
//	                index++;
//	            }
//			}
//		for (int k = 0; k < arr.length; k++) {
//            System.out.print(arr[k] + " ");
//        }
//------------------------------------------------------
		int arr[] = { -2, 9, 7, -6, 5, 6, -4, -8, 3, -5, -3, 7 };
		int countNegative = 0;
		int arr2[] = new int[arr.length]; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				countNegative++;
			} 
		}
		int i=0,j=countNegative;
		int k=0;
		while (k<arr.length) {
			if (arr[k]>=0) {
				arr2[j]=arr[k];
				j++;
			}else {
				arr2[i]=arr[k];
		        i++;
			}k++;
		}
		for (int x = 0; x < arr2.length; x++) {
          System.out.print(arr2[x] + " ");
      }
	}
}
