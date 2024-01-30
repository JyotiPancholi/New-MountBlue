package string.w3school.com;

public class DivideStringIntoEqualParts {
	public static void stringDivision(String s, int n) {
		int len = s.length();
		int part;
		if (len % n != 0) {
			System.out.println("String is not divisible by " + n + " parts");
		} else {
			part = len / n;
			for (int i = 0; i < len; i++) {
				if (i % part == 0) {
					System.out.println();
				}
				System.out.print(s.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrstuvwxy";
		int n = 5;
		stringDivision(s, n);
	}
}
