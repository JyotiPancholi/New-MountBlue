package string.practice.com;

import java.util.ArrayList;
import java.util.HashSet;

public class S14_WordBreakProblem {
	  public static int wordBreak(String A, ArrayList<String> B) {
	        HashSet<String> Set = new HashSet<>(B);
	        int[] dp = new int[A.length() + 1];
	        dp[0] = 1;

	        for (int i = 1; i <= A.length(); i++) {
	            for (int j = 0; j < i; j++) {
	                String subString = A.substring(j, i);
	                if (dp[j] == 1 && Set.contains(subString)) {
	                    dp[i] = 1;
	                    break;
	                }
	            }
	        }

	        return dp[A.length()];
	    }
	public static void main(String[] args) {
		String arr[] = { "i","like", "sam",
			"sung", "samsung", "mobile",
			"ice","cream", "icecream",
			"man", "go", "mango" };
		ArrayList<String> slist =  new ArrayList<String>();
		for (String string : arr) {
			slist.add(string);
		}
		int x  =  wordBreak("ilike", slist);
		System.out.println(x);
	}
}
