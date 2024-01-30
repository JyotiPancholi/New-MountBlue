package string.w3school.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String s = "hellotherethisisjyoti";// helotrisjy
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		String str = set.toString().replaceAll(",", "");
		System.out.print(str);
		//one way
//		char[] ch = s.toCharArray();
//		Set<Character> set = new HashSet<Character>();
//		for (int i = 0; i < s.length(); i++) {
//				set.add(ch[i]);
//		}
//		String str = set.toString(); 
//		System.out.print(str);
		
		
		// other way
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		for (int i = 0; i < s.length(); i++) {
//			if (!map.containsKey(s.charAt(i))) {
//				map.put(s.charAt(i), 1);
//			}
//		}
//		for (Entry<Character, Integer>  entry : map.entrySet()) {
//		   System.out.print(entry.getKey());
//		}
	}
}
