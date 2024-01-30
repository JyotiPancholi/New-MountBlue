package string.practice.com;

public class S04_CheckIfStringsAreRotationOfEachOther2 {
	public static String rotation(String s) {
		int n = s.length();
		return s.charAt(n-1)+s.substring(0,n-1);
	}
	public static void main(String[] args) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		System.out.println(rotation(s1));
		boolean flag = true;
		String str = s1;
		for (int i = 0; i <s1.length(); i++) {
			str = rotation(str);
			if (str.equals(s2)) {
				flag = false;
				System.out.println("Strings are rotations of each other");
			}
		}
		if (flag) {
			System.out.println("Strings are not rotations of each other");
		}
	}
}
