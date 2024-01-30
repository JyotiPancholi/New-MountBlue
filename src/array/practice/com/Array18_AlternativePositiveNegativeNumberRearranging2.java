package array.practice.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array18_AlternativePositiveNegativeNumberRearranging2 {
	
	public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));
        int posIndex = 0, negIndex = 1;
//        for (int i = 0; i < n; i++) {
//            if (A.get(i) < 0) {
//                ans.set(negIndex, A.get(i));
//                negIndex += 2;
//            }
//            else {
//                ans.set(posIndex, A.get(i));
//                posIndex += 2;
//            }
//        }
        for (int i = 0; i < n; i++) {
            if (A.get(i) < 0) {
                if (negIndex < n) {
                    ans.set(negIndex, A.get(i));
                    negIndex += 2;
                }
            } else {
                if (posIndex < n) {
                    ans.set(posIndex, A.get(i));
                    posIndex += 2;
                }
            }
        }
        return ans;
	}
	public static void main(String[] args) {
		 ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-5, -2, 5, 2, 4, 7, 1, 8, 0, -8 ));
	        ArrayList<Integer> ans = RearrangebySign(A);

	        for (int i = 0; i < ans.size(); i++) {
	            System.out.print(ans.get(i) + " ");
	        }
	}
}