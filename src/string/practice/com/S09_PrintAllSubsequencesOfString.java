package string.practice.com;

public class S09_PrintAllSubsequencesOfString {
	static void generateSubsequences(String input) {
		int n = input.length();
//		 int totalSubsequences = (int) Math.pow(2, n);
		int totalSubsequences = 1 << n;
		System.out.println(totalSubsequences);
		for (int i = 1; i < totalSubsequences; i++) {
			StringBuilder subsequence = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					System.out.println(i & (1 << j));
					subsequence.append(input.charAt(j));
				}
			}
			System.out.println(subsequence);
		}
	}

	public static void main(String[] args) {
		String input = "abcd";
		System.out.println("Subsequences of " + input + ":");
		generateSubsequences(input);
	}
}
