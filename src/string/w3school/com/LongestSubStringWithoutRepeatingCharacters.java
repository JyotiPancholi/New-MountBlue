package string.w3school.com;

import java.util.LinkedHashMap;

public class LongestSubStringWithoutRepeatingCharacters {

	static void longestSubstring(String inputString) {
		char[] arr = inputString.toCharArray();
		String longestSubstring = "";
		int maxLength = 0;
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if (map.size() > maxLength) {
				maxLength = map.size();
				longestSubstring = inputString.substring(i - maxLength + 1, i + 1);
			}
		}
		System.out.println("Input String: " + inputString);
		System.out.println("The longest substring: " + longestSubstring);
		System.out.println("The longest Substring Length: " + maxLength);
	}

	public static void main(String[] args) {
		longestSubstring("pickoutthelongestsubstring");
		longestSubstring("ppppppppppppp");
		longestSubstring("Microsoft");
	}

}
