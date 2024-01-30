package string.practice.com;

import java.util.HashMap;
import java.util.Map;

public class S03_CountFrequency {
	
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
