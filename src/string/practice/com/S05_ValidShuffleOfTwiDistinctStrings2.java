package string.practice.com;

public class S05_ValidShuffleOfTwiDistinctStrings2 {

	 static void printValidity(String str, String s1, String s2) {
	        if (isValidShuffle(str, s1, s2)) {
	            System.out.println("Given string '" + str + "' is a valid shuffle of '" + s1 + "' and '" + s2 + "'");
	        } else {
	            System.out.println("Given string '" + str + "' is not a valid shuffle of '" + s1 + "' and '" + s2 + "'");
	        }
	    }

	    static boolean isValidShuffle(String str, String s1, String s2) {
	        if (str.length() != s1.length() + s2.length()) {
	            return false;
	        }

	        int i = 0, j = 0, k = 0;

	        while (k < str.length()) {
	            if (i < s1.length() && str.charAt(k) == s1.charAt(i)) {
	                i++;
	            } else if (j < s2.length() && str.charAt(k) == s2.charAt(j)) {
	                j++;
	            } else {
	                return false;
	            }
	            k++;
	        }
	        return i == s1.length() && j == s2.length();
	    }

	    public static void main(String[] args) {
	        String s1 = "XY";
	        String s2 = "12";
	        String shuffle1 = "1XY2";
	        String shuffle2 = "Y1X2";
	        String shuffle3 = "Y21XX";

	        printValidity(shuffle1, s1, s2);
	        printValidity(shuffle2, s1, s2);
	        printValidity(shuffle3, s1, s2);
	    }
	}