package string.w3school.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMostFrequentElement {

	public static void main(String[] args) {
		String s = "HelloWorld";
		Map<Character, Integer> map =  new HashMap<Character, Integer>();
		for (char c  : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int maxFrequency = Integer.MIN_VALUE;

        for (int frequency : map.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey());
            }
        }
	}
}
