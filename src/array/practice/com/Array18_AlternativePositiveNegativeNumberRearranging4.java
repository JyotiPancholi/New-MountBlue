package array.practice.com;

public class Array18_AlternativePositiveNegativeNumberRearranging4 {
	static void rerrange(int[] arr, int n) {
		int i=-1,temp =0;
		for (int j = 0; j < n; j++) {
			if (arr[j]<0) {
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int pos= i+1,neg=0;
		while (pos<n && neg<pos && arr[neg]<0) {
			temp=arr[neg];
			arr[neg]=arr[pos];
			arr[pos]=temp;
			pos++;
			neg+=2;
		}
	}

	public static void main(String[] args){
		int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
		rerrange(arr,arr.length);
		 for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
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
