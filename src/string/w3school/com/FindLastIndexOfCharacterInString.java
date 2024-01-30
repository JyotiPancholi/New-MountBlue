package string.w3school.com;

//Write a Java program to get the last index of a string within a string.
public class FindLastIndexOfCharacterInString {

	public static void main(String[] args) {
		String str = "JavaCodeExercisea";
		int a = str.lastIndexOf("a", str.length() - 1);
		System.out.println(a);
	}
}
