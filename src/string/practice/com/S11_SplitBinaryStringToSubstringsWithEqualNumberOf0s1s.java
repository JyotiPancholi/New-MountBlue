package string.practice.com;

public class S11_SplitBinaryStringToSubstringsWithEqualNumberOf0s1s {
	public static int subString(String s, int n) {
		int count0=0,count1=0;
		int check=0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i)=='0') {
				count0++;
			}else {
				count1++;
			}
			
			if (count0==count1) {
				check++;
			}
		}
		if (count0 != count1) {
			return -1;	
		}
		return check;
	}
	public static void main(String[] args) {
		String  str ="0111100010";
		int n = str.length();
		System.out.println(subString(str, n ));
	}
}
