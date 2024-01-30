package string.w3school.com;

import java.util.HashSet;
import java.util.Set;

public class RemoveCharactersOfStringFromAnotherString {

	public static String removeDuplicates(String s1,String s2){
		Set<Character> set = new HashSet<Character>();
		for (char c : s2.toCharArray()) {
			set.add(c);
		}
		StringBuilder sb = new StringBuilder();
		for (char c : s1.toCharArray()) {
			if (!set.contains(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}
//	static String removeDuplicates(String str1, String str2) {
//        Set<Character> charSet = new HashSet<>();
//        for (char c : str2.toCharArray()) {
//            charSet.add(c);
//        }
//        StringBuilder result = new StringBuilder();
//        for (char c : str1.toCharArray()) {
//            if (!charSet.contains(c)) {
//                result.append(c);
//            }
//        }
//        return result.toString();
//    }

    public static void main(String[] args) {
        String input1 = "the quick brown fox";
        String input2 = "queen";

        String result = removeDuplicates(input1, input2);

        System.out.println("Original String 1: " + input1);
        System.out.println("String 2 for removal: " + input2);
        System.out.println("String after removal: " + result);
    }
}