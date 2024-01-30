package string.practice.com;

public class S06_CountAndSayProblem2 {

	public static String countAndSay(int n) {
		String s = "1";
		for (int i = 1; i < n; i++) {
			s = countIdx(s);
		}
		return s;
	}

	public static String countIdx(String s) {
		StringBuilder sb = new StringBuilder();
		char c = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				count++;
			} else {
				sb.append(count);
				sb.append(c);
				c = s.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(c);
		return sb.toString();
	}

	public static void main(String[] args) {
		int n1 = 1;
		
		System.out.println("Output for Example 1: " + countAndSay(n1));

		int n2 = 4;
		System.out.println("Output for Example 2: " + countAndSay(n2));
 	}
}
