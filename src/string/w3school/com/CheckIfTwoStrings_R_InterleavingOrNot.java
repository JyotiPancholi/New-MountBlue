package string.w3school.com;

public class CheckIfTwoStrings_R_InterleavingOrNot {
	
	private static boolean checkInterleaved(String str1, String str2, String CheckInString) {
        int i = 0, j = 0, k = 0;
        if (str1.length() + str2.length() != CheckInString.length()) {
            return false;
        }
        while (k < CheckInString.length()) {
            if (i < str1.length() && str1.charAt(i) == CheckInString.charAt(k)) {
                i++;
            }
            else if (j < str2.length() && str2.charAt(j) == CheckInString.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        if (!(i == str1.length() && j == str2.length() && k == CheckInString.length())) {
            return false;
        }
        return true;
    }
	public static void main(String[] args) {
		String str1 = "QS";
        String str2 = "PRT";
        String str3 = "PQRST";
		System.out.println(checkInterleaved(str1, str2, str3));
				
	}

}
