package string.practice.com;

public class S19_CountPalindromicSubsequences {

	static final int MOD = 1000000007;
    static int countPalindromicSubsequences(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = (dp[i + 1][j] % MOD + dp[i][j - 1] % MOD + 1) % MOD;
                } else {
                    dp[i][j] = (dp[i + 1][j] % MOD + dp[i][j - 1] % MOD - dp[i + 1][j - 1] % MOD + MOD) % MOD;
                }
            }
        }
        return dp[0][n - 1];				
	}

	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(countPalindromicSubsequences(str));
	}
}
