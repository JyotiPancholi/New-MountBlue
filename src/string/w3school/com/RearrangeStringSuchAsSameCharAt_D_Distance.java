//package string.w3school.com;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class RearrangeStringSuchAsSameCharAt_D_Distance {
//
//	public static String rearrange(String str, int k) {  
//	    Map<Character, Integer> map = new HashMap<>();  
//	    char[] s = str.toCharArray();  
//	    int n = s.length;  
//	    for(int i=0; i<n; i++) {  
//	        Integer cnt = map.get(s[i]);  
//	        if(cnt == null) cnt = 0;  
//	        map.put(s[i], cnt+1);  
//	    }  
//	    Queue<Character> queue = new PriorityQueue<>(map.size(), new Comparator<Character>(){  
//	        public int compare(Character c1, Character c2) {  
//	            return map.get(c2) - map.get(c1);  
//	        }  
//	    });  
//	    queue.addAll(map.keySet());  
//	    Arrays.fill(s, '\0');  
//	    for(int i=0; i<map.size(); i++) {  
//	        int p = i;  
//	        while(s[p] != '\0') p++;  
//	        char c = queue.poll();  
//	        int cnt = map.get(c);  
//	        for(int j=0; j<cnt; j++) {  
//	            if(p >= n) return "Cannot be rearranged";  
//	            s[p] = c;  
//	            p += k;  
//	        }  
//	    }  
//	    return new String(s);  
//	}  
//    public static void main(String[] args) {
//        String originalString = "accessories";
//        int distance = 3;
//
//        System.out.println("The given string is: " + originalString);
//        System.out.println("The string after rearranging is: " + rearrange(originalString, distance));
//    }
//}