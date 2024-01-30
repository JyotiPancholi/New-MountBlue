package string.practice.com;

public class S07_LongestPalindromeInString2 {

	static String longestPalindrome(String s) {
		int len = s.length();
        if (len == 0 || len == 1) {
            return s;
        }
         String ans = Character.toString(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
        	for (int j = len-1; j >i ; j--) {
				if ((j-i)+1<=ans.length()) {
					break;
				}
				if (s.charAt(i)==s.charAt(j)) {
					if (isPalindrom(s,i,j)) {
						if ((j-i)+1>ans.length()) {
							ans=s.substring(i,j+1);
						}
					}
				}
			}
        }

        return ans;
    }

	private static boolean isPalindrom(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		} 
		return true;
	}
	public static void main(String[] args) {
		String s1 = "bbaaaabbaa";
		System.out.println("Output for Example 1: " + longestPalindrome(s1));

		String s2 = "abc";
		System.out.println("Output for Example 2: " + longestPalindrome(s2));

	}

}
