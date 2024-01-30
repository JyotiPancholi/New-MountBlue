package string.practice.com;

public class S02_StringPalindrom {
	 public static int isPalindrome(String S) {
		 int n = S.length();
		 System.out.println(n);
		 for (int i = 0; i <n/2; i++) {
			if (S.charAt(i)!=S.charAt(n-1-i)) {
				return 0;
			}
		}
		 return 1;
	    }
	public static void main(String[] args) {
		int x =isPalindrome("abba");
		System.out.println(x);
	}
}
