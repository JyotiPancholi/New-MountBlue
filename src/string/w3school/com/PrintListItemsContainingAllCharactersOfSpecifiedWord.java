package string.w3school.com;

import java.util.ArrayList;
import java.util.List;

public class PrintListItemsContainingAllCharactersOfSpecifiedWord {

	 static boolean containsAllCharacters(String str, String word) {
	        for (char c : word.toCharArray()) {
	            if (str.indexOf(c) == -1) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        List<String> items = new ArrayList<>();
	        items.add("raccit");
	        items.add("bribe");
	        items.add("dog");

	        String word = "bib";

	        System.out.println("The given word is: " + word);

	        System.out.println("\nThe strings containing all the letters of the given word are: ");
	        for (String item : items) {
	            if (containsAllCharacters(item, word)) {
	                System.out.println(item);
	            }
	        }
	    }
	}
//	static void checkExistance(String str1, String str2) {
//		int chk = 0;
//		char chhr = ' ';
//		int[] a = new int[Character.MAX_VALUE + 1];
//		for (int i = 0; i < str1.length(); i++) {
//			chhr = str1.charAt(i);
//			++a[chhr];
//		}
//		for (int i = 0; i < str2.length(); i++) {
//			chhr = str2.charAt(i);
//			if (a[chhr] >= 1)
//				chk = 1; // Set check flag if character exists in the first string.
//		}
//		if (chk == 1)
//			System.out.println(str1);
//	}
//
//	public static void main(String[] args) {
//		List<String> items = new ArrayList<>();
//		items.add("rabbit");
//		items.add("bribe");
//		items.add("dog");
//
//		String word = "bib";
//
//		System.out.print("The given strings are: ");
//		for (int i = 0; i < items.size(); i++) {
//			System.out.print(items.get(i) + "   ");
//		}
//		System.out.println("The given word is: " + word);
//		System.out.println("\nThe strings containing all the letters of the given word are: ");
//		for (int j = 0; j < items.size(); j++) {
//			checkExistance(items.get(j), "bib");
//		}
//	}
//}