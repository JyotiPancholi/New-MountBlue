package string.w3school.com;

// Write a Java program to create a character array containing a string.

public class StringToCharacterArray {

	public static void main(String[] args) {
		String str = "java code exercise";
		char []arr =new char[str.length()];
		for (int i = 0; i <str.length(); i++) {
			arr[i]=str.charAt(i);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		char[]arr2 = str.toCharArray();
		System.out.println(arr2);
	}
}
