package string.w3school.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Write a Java program to find the second most frequent character in a given string.

public class FindSeconMostFrequentCharacter2 {

	static char findSecondMostFrequent(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int maxFrequency = Integer.MIN_VALUE;
        int secondMaxFrequency = Integer.MIN_VALUE;

        for (int frequency : map.values()) {
            if (frequency > maxFrequency) {
                secondMaxFrequency = maxFrequency;
                maxFrequency = frequency;
            } else if (frequency > secondMaxFrequency && frequency < maxFrequency) {
                secondMaxFrequency = frequency;
            }
        }
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondMaxFrequency) {
                return entry.getKey();
            }
        }
        return '\0';
    }

	public static void main(String[] args) {
		String str = "sucesses";
		System.out.println("The given string is: " + str);
		char result1 = findSecondMostFrequent(str);
        System.out.println("Second most frequent character in \"" + str + "\" is: " + result1);

	}
}
//        Map<Character, Integer> map =  new HashMap<Character, Integer>();
//        for (int i = 0; i < str.length(); i++) {
//			if (!map.containsKey(str.charAt(i))) {
//				map.put(str.charAt(i), 1);
//			}else {
//				map.put(str.charAt(i), map.get(str.charAt(i))+1);
//			}
//		}
//        int maxFrequency = Integer.MIN_VALUE;
//        int secondMaxFrequency = Integer.MIN_VALUE;
//
//        for (int frequency : map.values()) {
//            if (frequency > maxFrequency) {
//                secondMaxFrequency = maxFrequency;
//                maxFrequency = frequency;
//            } else if (frequency > secondMaxFrequency && frequency < maxFrequency) {
//                secondMaxFrequency = frequency;
//            }
//        }
//        for (Entry<Character, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == secondMaxFrequency) {
//                return entry.getKey();
//            }
//        }
////        for (Map.Entry<Character, Integer> m : map.entrySet()) {
////			System.out.println(m.getKey()+" "+m.getValue());
////		}
//		return '\0';
//	}
//}
