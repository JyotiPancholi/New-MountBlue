package array.practice.com;

public class Array18_AlternativePositiveNegativeNumberRearranging3 {
	public void rerrange(int[] arrA) {
		int pivot = 0;
		int left = 0;
		int right = arrA.length - 1;
		while (right > left) {
			while (arrA[left] < 0 && left < right)
				left++;
			while (arrA[right] > 0 && left < right)
				right--;
			if (left < right) {

				int temp = arrA[left];
				arrA[left] = arrA[right];
				arrA[right] = temp;
				left++;
				right--;
			}
		}
		left = 1;
		int high = 0;
		while (arrA[high] < 0)
			high++;
		right = high;
		while (arrA[left] < 0 && right < arrA.length) {
			int temp = arrA[left];
			arrA[left] = arrA[right];
			arrA[right] = temp;
			left = left + 2;
			right++;
		}
		for (int i = 0; i < arrA.length; i++) {
			System.out.print("  " + arrA[i]);
		}
	}

	public static void main(String[] args){
		int[] arrA = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
		Array18_AlternativePositiveNegativeNumberRearranging3 i = new Array18_AlternativePositiveNegativeNumberRearranging3();
		i.rerrange(arrA);
	}
}


//     static public int[] reorder(int[] input) {
//	    int[] output = new int[input.length];
//	    int pos = 0;
//	    int neg = 1;
//	    for (int val: input) {
//	        if (val >= 0) {   
//	            output[pos] = val;
//	            pos += 2;
//	        } else {
//	            output[neg] = val;
//	            neg += 2;
//	        }
//	    }
//	    return output;
//	}
//	public static void main(String[] args) {
//		int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
//		int[] result = reorder(arr);
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i] + " ");
//        }
//	}
//}
