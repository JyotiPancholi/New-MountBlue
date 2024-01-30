package string.practice.com;

public class S06_CountAndSayProblem {

	static String countAndSay(int n) {
		if (n <= 0) {
			return "";
		}
		String result = "1";

		for (int i = 2; i <= n; i++) {
			StringBuilder current = new StringBuilder();
			char prevChar = result.charAt(0);
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				char currentChar = result.charAt(j);

				if (currentChar == prevChar) {
					count++;
				} else {
					current.append(count).append(prevChar);
					count = 1;
					prevChar = currentChar;
				}
			}
			current.append(count).append(prevChar);
			result = current.toString();
		}
		return result;
	}

	public static void main(String[] args) {
		int n1 = 1;
		System.out.println("Output for Example 1: " + countAndSay(n1));

		int n2 = 4;
		System.out.println("Output for Example 2: " + countAndSay(n2));
	}
}
