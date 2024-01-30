package two_d.arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix {

	 public static List<Integer> spiralOrder(List<List<Integer>> A) {
	        int T, B, L, R, dir;
	        T = 0;
	        B = A.size() - 1;
	        L = 0;
	        R = A.get(0).size() - 1;
	        dir = 0;
	        int i;
	        List<Integer> ans = new ArrayList<>();

	        while (T <= B && L <= R) {
	            if (dir == 0) {
	                for (i = L; i <= R; i++)
	                    ans.add(A.get(T).get(i));
	                T++;
	            } else if (dir == 1) {
	                for (i = T; i <= B; i++)
	                    ans.add(A.get(i).get(R));
	                R--;
	            } else if (dir == 2) {
	                for (i = R; i >= L; i--)
	                    ans.add(A.get(B).get(i));
	                B--;
	            } else if (dir == 3) {
	                for (i = B; i >= T; i--)
	                    ans.add(A.get(i).get(L));
	                L++;
	            }
	            dir = (dir + 1) % 4;
	        }
	        return ans;
	    }

	    public static void main(String[] args) {
	        List<List<Integer>> matrix = new ArrayList<>();
	        matrix.add(Arrays.asList(1, 2, 3));
	        matrix.add(Arrays.asList(4, 5, 6));
	        matrix.add(Arrays.asList(7, 8, 9));

	        List<Integer> result = spiralOrder(matrix);
	        System.out.println("Spiral Order: " + result);
	    }
	}