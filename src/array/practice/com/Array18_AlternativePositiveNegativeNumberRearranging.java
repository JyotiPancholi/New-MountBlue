package array.practice.com;

import java.util.ArrayList;
import java.util.Arrays;

public class Array18_AlternativePositiveNegativeNumberRearranging {
	public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (A.get(i) > 0)
                pos.add(A.get(i));
            else
                neg.add(A.get(i));
        }
        if (pos.size() < neg.size()) {
            for (int i = 0; i < pos.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                A.set(index, neg.get(i));
                index++;
            }
        }
        else {
            for (int i = 0; i < neg.size(); i++) {
                A.set(2 * i, pos.get(i));
                A.set(2 * i + 1, neg.get(i));
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                A.set(index, pos.get(i));
                index++;
            }
        }
        return A;
    }
public static void main(String[] args) {
    int n = 6;
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8 ));

    ArrayList<Integer> ans = RearrangebySign(A, n);

    for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i) + " ");
    }
    }
}
//	public static int[] RearrangebySign(int[] arr, int n) {
//		ArrayList<Integer> pos = new ArrayList<>();
//		ArrayList<Integer> neg = new ArrayList<>();
//		for (int i = 0; i < n; i++) {
//			if (arr[i] > 0)
//				pos.add(arr[i]);
//			else
//				neg.add(arr[i]);
//		}
//		int i = 0;
//		for (; i < n; i++) {
//			if (arr[i]%2==0) {
//				arr[i]=pos.get(i);
//			}else {
//				arr[i]=neg.get(i);
//			}
//		}
//		 while (i < pos.size()) {
//	            arr[2 * i] = pos.get(i);
//	            i++;
//	        }
//	        while (i < neg.size()) {
//	            arr[2 * i] = neg.get(i);
//	            i++;
//	        }
//		return arr;
//	}
//
//	public static void main(String args[]) {
//		int n = 6;
//		int A[] = { 1, 2, 3, -4, -1, 4 };
//		int[] ans = RearrangebySign(A, n);
//		for (int i = 0; i < n; i++) {
//			System.out.print(ans[i] + " ");
//		}
//	}
//}