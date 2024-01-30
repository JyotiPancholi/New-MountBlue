package string.w3school.com;

//Write a Java program to get the Canonical representation of the string object

public class CanonicalRepresentation {

	public static void main(String[] args) {
		String str1 = "Java Exercises"; 
        String str2 = new StringBuffer("Java").append(" Exercises").toString(); 
        String str3 = str2.intern();
        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
        
        
		String str4 = "java exercise";
		String str5 = new StringBuffer("java").append(" exercise").toString();
		String str6 = str5.intern();
		System.out.println(str4==str5?"both are equal":"both are unequal");
		System.out.println(str4==str6?"both are equal":"both are unequal");
		
	}
}
