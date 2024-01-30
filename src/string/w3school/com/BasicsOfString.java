package string.w3school.com;

public class BasicsOfString {

	public static void main(String[] args) {
		String str= "Hello This Is Jiya !";
		// codePointtAt() : to find unicode of given index
		System.out.println(str.codePointAt(4));
		// codePointBefore() : to find unicode before given index
	    System.out.println(str.codePointBefore(8));
	    //codePointCount() : count all unicode character in given range
	    System.out.println(str.codePointCount(0, 9));
	    
	    String s1 ="hello" ;
		String s2 = "Hello";
		//compareTo() : to compare two strings lexicographically
		System.out.println(s1.compareTo(s2));
		//compareToIgnoreCase() : to compare two strings lexicographically, ignoring case differences.
		System.out.println(s1.compareToIgnoreCase(s2));
		//concat() : merge two strings 
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		String str2 = "Hello these is jyoti and i love coding";
		String s = "love";
		System.out.println(str2.contains(s));
	}
}
