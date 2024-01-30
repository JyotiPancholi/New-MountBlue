package string.practice.com;

public class S12_EditDistance {

	public int editDistance(String s, String t) {
		int n = s.length();
		int m = t.length();
		int[][] dp = new int[n + 1][m + 1];

		for (int i = 0; i <= n; i++) {
			dp[i][0] = i;
		}
		for (int j = 0; j <= m; j++) {
			dp[0][j] = j;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1];
				else {
					dp[i][j] = 1 + Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]);
				}
			}
		}
		int res = dp[n][m];
		return res;
	}

	public static void main(String[] args) {
		String s1 = "geek", s2 = "gesek";
		S12_EditDistance e = new S12_EditDistance();
		System.out.println(e.editDistance(s1, s2));
	}
}
