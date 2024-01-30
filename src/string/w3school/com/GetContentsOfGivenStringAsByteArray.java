package string.w3school.com;
// Write a Java program to get the contents of a given string as a character array.
public class GetContentsOfGivenStringAsByteArray {

	public static void main(String[] args) {
		String str = "This is jyoti pancholi";
		byte []arr = str.getBytes();
		String s =  new String(arr);
		System.out.println(s);

//		Create a unique identifier of a given string
		String a = "hiie";
		String b = "jyotipancholi";
		int unique = b.hashCode();
		System.out.println(unique);
		
//		Write a Java program to get the index of all the characters of the alphabet.
		String c = "jyoti pancholi";
		for (int i = 0; i <c.length(); i++) {
			System.out.println("Index of character : "+c.indexOf(c.charAt(i)));
		}
	}
}
