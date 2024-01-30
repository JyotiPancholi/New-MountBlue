package string.w3school.com;

//Write a Java program to find out whether a region in the current string matches a region in another string.
public class MatchingRegion {

	public static void main(String[] args) {
		String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";
        boolean match1 = str1.regionMatches(0, str2, 28, 8);
        System.out.println(match1);
        
//      Write a Java program to replace a specified character with another character.
	    String s = "hello java lets code !";
	    System.out.println(s.replace('j', 'v'));
	
//	    Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
	    String x = "hello java its time to code fast in java";
	    String y = x.replaceAll("java", "php");
	    System.out.println(y);
	
//	    Write a Java program to check whether a given string starts with another string.
	    System.out.println(x.startsWith("java"));
	    
//	    Write a Java program to get a substring of a given string at two specified positions.
	    System.out.println(x.substring(6, 22));
	    
	}
}
