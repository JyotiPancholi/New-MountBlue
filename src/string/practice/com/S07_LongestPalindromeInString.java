package string.practice.com;

public class S07_LongestPalindromeInString {

	static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); 
            int len2 = expandAroundCenter(s, i, i + 1);

            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s1 = "aaaabbbaa";
        System.out.println("Output for Example 1: " + longestPalindrome(s1));

        String s2 = "abc";
        System.out.println("Output for Example 2: " + longestPalindrome(s2));

//	static String longestPalin(String s){
//        boolean dp[][] = new boolean[s.length()][s.length()];
//        int maxLen = 0;
//        int x=0,y=0;
//        int i = 0, j = 0;
//        for (int gap = 0; gap < s.length(); gap++) {
//            for (i = 0, j = gap; j < s.length(); i++, j++) {
//                if (gap == 0) {
//                    dp[i][j] = true;
//                } else if (gap == 1) {
//                    if (s.charAt(i) == s.charAt(j))
//                        dp[i][j] = true;
//                } else {
//                    if (s.charAt(i)== s.charAt(j) && dp[i+1][j-1])
//                        dp[i][j] = true;
//                }
//
//                if (dp[i][j] && maxLen<gap+1) {
//                    maxLen = gap+1;
//                    x=i;
//                    y=j;
//                }
//            }
//        }
//        return s.substring(x, y+1);
//	}
//	public static void main(String[] args) {
//		System.out.println(longestPalin("aaaabbaa"));
	}

}
