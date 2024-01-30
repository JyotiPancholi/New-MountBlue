package string.w3school.com;

public class BasicsOfString3 {

	public static void main(String[] args) {
		String str1 = "Hello This Is Jiya";
		String str2 = "hello this is jiya";
		String str = "ya";
		System.out.println(str1.endsWith(str));
		System.out.println(str2.endsWith(str));
		
		System.out.println(str1.equals(str2));
	}
}
